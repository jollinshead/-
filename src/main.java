import gui.JCPersonDisplay;

import javax.swing.*;
import java.applet.Applet;
import java.util.Random;

/**
 * Created by jhollinshead on 19/01/2017.
 */
public class main {


        public static void main(String[] args) {
            appletMain frame = new appletMain();
            frame.setContentPane(new JCPersonDisplay(new Random().nextLong()).getMainPanel());
            frame.setVisible(true);
    }
}
