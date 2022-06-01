package schoolGUI;
import javax.swing.*;

public class teacherSalary {
    private JPanel teacherSalary;
    private JLabel teacherName;
    private JTextField textField1;
    private JTextField textField2;
    private JFormattedTextField formattedTextField1;
    private JButton saveButton;

    public static void main(String[] args){
        JFrame frame = new JFrame("Teacher Salary");
        frame.setContentPane(new teacherSalary().teacherSalary);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,250);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
