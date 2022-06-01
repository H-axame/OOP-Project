package schoolGUI;

import javax.swing.*;

public class studentFees {
    private JPanel studentPay;
    private JTextField textField1;
    private JTextField textField2;
    private JFormattedTextField formattedTextField1;
    private JButton saveButton;

    public static void main(String[] args){
        JFrame frame = new JFrame("Student Payment");
        frame.setContentPane(new studentFees().studentPay);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,250);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
