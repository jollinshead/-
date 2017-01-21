import gui.JCPersonDisplay;

import javax.swing.*;
import java.util.Random;

public class AppletBasic extends JApplet
{
    /**
     * Create the GUI. For thread safety, this method should
     * be invoked from the event-dispatching thread.
     */
    private void createGUI()
    {
        JInternalFrame frame = new JInternalFrame();
        add(frame);
        frame.setContentPane(new JCPersonDisplay(new Random().nextLong()).getMainPanel());
        frame.setVisible(true);
    }

    @Override
    public void init()
    {
        try
        {
            SwingUtilities.invokeAndWait(() -> createGUI());
        }
        catch (Exception e)
        {
            System.err.println("createGUI didn't successfully complete: " + e);
        }
    }

/*    public static void main(String[] args)
    {
        JApplet applet = new AppletBasic();
        applet.init();

        JFrame frame = new JFrame("Applet in Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add( applet );
        frame.pack();
        frame.setLocationRelativeTo( null );
        frame.setVisible( true );

        applet.start();
    }*/
}