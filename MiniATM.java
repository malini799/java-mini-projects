import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiniATM extends JFrame implements ActionListener {

    double balance = 5000;

    JButton checkBalance, deposit, withdraw, exit;

    MiniATM() {

        setTitle("Mini ATM");
        setSize(400,300);
        setLayout(new FlowLayout());

        JLabel title = new JLabel("ATM Simulation System");
        title.setFont(new Font("Arial", Font.BOLD, 18));

        checkBalance = new JButton("Check Balance");
        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        exit = new JButton("Exit");

        add(title);
        add(checkBalance);
        add(deposit);
        add(withdraw);
        add(exit);

        checkBalance.addActionListener(this);
        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        exit.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == checkBalance) {
            JOptionPane.showMessageDialog(this, "Balance: ₹" + balance);
        }

        else if(e.getSource() == deposit) {

            String amount = JOptionPane.showInputDialog("Enter amount to deposit:");

            if(amount != null) {
                balance += Double.parseDouble(amount);
                JOptionPane.showMessageDialog(this,"Amount deposited successfully");
            }
        }

        else if(e.getSource() == withdraw) {

            String amount = JOptionPane.showInputDialog("Enter amount to withdraw:");

            if(amount != null) {
                double withdrawAmount = Double.parseDouble(amount);

                if(withdrawAmount <= balance) {
                    balance -= withdrawAmount;
                    JOptionPane.showMessageDialog(this,"Please collect your cash");
                }
                else {
                    JOptionPane.showMessageDialog(this,"Insufficient Balance");
                }
            }
        }

        else if(e.getSource() == exit) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new MiniATM();
    }
}
