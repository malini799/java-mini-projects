import java.awt.*;
import java.awt.event.*;
public class SimpleCalculator extends Frame implements ActionListener{
  TextField t1,t2,t3;
  Button b1,b2,b3,b4,b5;
  SimpleCalculator()
  {
    setTitle("Simple Calculator");
    setLayout(null);
    setBackground(Color.red);
    Label l1,l2,l3;
    l1=new Label("value1");
    l1.setBounds(30,40,80,30);
    add(l1);
    l2=new Label("value2");
    l2.setBounds(30,70,80,30);
    add(l2);
    l3=new Label("result");
    l3.setBounds(30,110,80,30);
    add(l3);
    t1=new TextField();
    t1.setBounds(130,40,80,30);
    add(t1);
    t2=new TextField();
    t2.setBounds(130,70,80,30);
    add(t2);
    t3=new TextField();
    t3.setBounds(130,110,80,30);
    add(t3);
    b1=new Button("sum");
    b1.setBounds(30,140,50,30);
    add(b1);
    b2=new Button("sub");
    b2.setBounds(80,140,50,30);
    add(b2);
    b3=new Button("mul");
    b3.setBounds(130,140,50,30);
    add(b3);
    b4=new Button("div");
    b4.setBounds(190,140,50,30);
    add(b4);
    b5=new Button("exit");
    b5.setBounds(250,140,50,30);
    add(b5);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    setSize(400,400);
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e)
  {
    int a=Integer.parseInt(t1.getText());
    int b=Integer.parseInt(t2.getText());
    if(e.getSource()==b1)
    t3.setText(String.valueOf(a+b));
    if(e.getSource()==b2)
    t3.setText(String.valueOf(a-b));
    if(e.getSource()==b3)
    t3.setText(String.valueOf(a*b));
    if(e.getSource()==b4)
    t3.setText(String.valueOf(a/b));
    if(e.getSource()==b5)
    System.exit(0);
  }
  public static void main(String args[])
  {
    new SimpleCalculator();
  }
}
