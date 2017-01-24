package gui;

import customclasses.Header;
import customclasses.Language;
import customclasses.Person;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

/**
 * Created by jhollinshead on 17/01/2017.
 */
public class JCPersonDisplay {
    private JPanel pnlMain;
    private JLabel lblPortrait;
    private JLabel lblNameTitle;
    private JLabel lblCareerTitle;
    private JLabel lblCountryTitle;
    private JLabel lblGenderTitle;
    private JLabel lblFavColourTitle;
    private JLabel lblName;
    private JLabel lblCareer;
    private JLabel lblCountry;
    private JLabel lblGender;
    private JLabel lblFavColourIcon;
    private JComboBox cbbLanguage;
    private JLabel lblLanguageTitle;
    private JLabel lblFavColour;
    private JButton btnNewPerson;
    private JLabel lblObjectTitle;
    private JLabel lblObject;

    private Language language = Language.ENGLISH;
    private Person person;

    public JCPersonDisplay (long seed) {
        initaliseLanguages();
        setFont();
        this.person = new Person(seed);
        refreshText();
    }

    private void setFont () {
        Font font = new Font("Courier", Font.PLAIN, 22);

        lblLanguageTitle.setFont(font);
        lblNameTitle.setFont(font);
        lblCareerTitle.setFont(font);
        lblCountryTitle.setFont(font);
        lblGenderTitle.setFont(font);
        lblFavColourTitle.setFont(font);
        lblObjectTitle.setFont(font);
        lblName.setFont(font);
        lblCareer.setFont(font);
        lblCountry.setFont(font);
        lblGender.setFont(font);
        lblFavColour.setFont(font);
        lblObject.setFont(font);
    }

    private void refreshText() {
        lblLanguageTitle.setText(Header.LANGUAGE.getText(language));
        lblNameTitle.setText(Header.NAME.getText(language));
        lblCareerTitle.setText(Header.OCCUPATION.getText(language));
        lblCountryTitle.setText(Header.COUNTRY.getText(language));
        lblGenderTitle.setText(Header.GENDER.getText(language));
        lblFavColourTitle.setText(Header.FAV_COLOUR.getText(language));
        lblObjectTitle.setText(Header.OBJECT.getText(language));
        lblName.setText(person.getName().getText(language));
        lblCareer.setText(person.getCareer().getText(language));
        lblCountry.setText(person.getCountry().getText(language));
        lblGender.setText(person.getPortrait().getGender().getText(language));
        lblFavColourIcon.setBackground(Color.decode(person.getFavourateColour().getColourId()));
        lblFavColour.setText(person.getFavourateColour().getText(language));
        lblObject.setText(person.getObject().getText(language));
        InputStream imgStream = getClass().getResourceAsStream(person.getPortrait().getImagePath());
        if (imgStream == null)
            lblPortrait.setText("?");
        else {
            ImageIcon image = null;
            try {
                image = new ImageIcon(ImageIO.read(imgStream));
                lblPortrait.setIcon(image);
                lblPortrait.setText("");
            } catch (IOException e) {
                lblPortrait.setText("?");
            }
        }
    }

    private void initaliseLanguages() {
        Language[] languages = Language.values();
        for(Language lang : languages)
            cbbLanguage.addItem(lang.getText(Language.ENGLISH));

        cbbLanguage.addActionListener(e -> {
            setLanguage(cbbLanguage.getSelectedItem().toString());
            refreshText();
        });

        btnNewPerson.addActionListener(e -> generateNewPerson());
    }

    private void setLanguage(String text) {
        Language[] languages = Language.values();
            for(Language lang : languages)
                if(text.equals(lang.getText(Language.ENGLISH))) {
                    this.language = lang;
                    return;
                }

        this.language = Language.ENGLISH;
    }

    private void generateNewPerson() {
        this.person = new Person(new Random().nextLong());
        refreshText();
    }

    public JPanel getMainPanel(){
        return this.pnlMain;
    }
}
