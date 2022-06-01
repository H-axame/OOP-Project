package schoolGUI;

import javax.swing.*;

public class dashboard {
    private JPanel adminDashboard;
    private JButton studentsFee;
    private JButton salaryButton;
    private JButton logoutButton;

    public static void main(String[] args){
        JFrame frame = new JFrame("School System");
        frame.setContentPane(new dashboard().adminDashboard);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(280,200);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
