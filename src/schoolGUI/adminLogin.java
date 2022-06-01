package schoolGUI;

import javax.swing.*;
import java.awt.*;

public class adminLogin extends JDialog {
    private JTextField adminUsername;
    private JTextField adminPassword;
    private JButton loginButton;
    private JPanel loginPanel;

    public static void main(String[] args){
        JFrame frame = new JFrame("Administrator");
        frame.setContentPane(new adminLogin().loginPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
