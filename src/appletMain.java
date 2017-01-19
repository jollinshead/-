/**
 * Created by jholl on 19/01/2017.
 */
import gui.JCPersonDisplay;

import javax.swing.*;
import java.awt.Graphics;
import java.util.Random;

public class appletMain extends JApplet {
    public void init() {
        JInternalFrame frame = new JInternalFrame();
        add(frame);
        frame.setContentPane(new JCPersonDisplay(new Random().nextLong()).getMainPanel());
        frame.setVisible(true);
    }
}