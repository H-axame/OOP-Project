
import javax.swing.*;
import java.awt.*;

public class loginForm extends JDialog {
    private JTextField adminUsername;
    private JTextField adminPassword;
    private JButton loginButton;
    private JPanel loginPanel;

    public loginForm(JFrame parent){
        super(parent);
        setTitle("Admin Login");
        setContentPane(loginPanel);
        setMinimumSize(new Dimension(450, 474));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args){
        loginForm admin = new loginForm(null);
    }
}
