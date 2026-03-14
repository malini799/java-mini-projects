import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RestaurantMenu extends JFrame implements ActionListener {

    JCheckBox burger, pizza, sandwich, coffee;
    JButton calculate;
    JLabel result;

    public RestaurantMenu() {

        setTitle("Restaurant Menu System");
        setSize(400,300);
        setLayout(new FlowLayout());

        JLabel title = new JLabel("Select Your Items");
        title.setFont(new Font("Arial", Font.BOLD, 18));

        burger = new JCheckBox("Burger - ₹120");
        pizza = new JCheckBox("Pizza - ₹250");
        sandwich = new JCheckBox("Sandwich - ₹100");
        coffee = new JCheckBox("Coffee - ₹80");

        calculate = new JButton("Calculate Bill");
        result = new JLabel("Total Bill: ₹0");

        calculate.addActionListener(this);

        add(title);
        add(burger);
        add(pizza);
        add(sandwich);
        add(coffee);
        add(calculate);
        add(result);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        int total = 0;

        if(burger.isSelected())
            total += 120;

        if(pizza.isSelected())
            total += 250;

        if(sandwich.isSelected())
            total += 100;

        if(coffee.isSelected())
            total += 80;

        result.setText("Total Bill: ₹" + total);
    }

    public static void main(String[] args) {
        new RestaurantMenu();
    }
}
