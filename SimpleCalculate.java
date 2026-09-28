import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculate extends JFrame implements ActionListener {

    JTextField t = new JTextField();
    double a;
    char op;

    SimpleCalculate() {
        setLayout(new BorderLayout());
        add(t, "North");

        JPanel p = new JPanel();
        String[] b = {"7","8","9","+","4","5","6","-","1","2","3","*","C","0","=","/"};

        for (String x : b) {
            JButton bt = new JButton(x);
            bt.addActionListener(this);
            p.add(bt);
        }

        add(p);
        setSize(250,250);
        setVisible(true);
        setDefaultCloseOperation(3);
    }

    public void actionPerformed(ActionEvent e) {
        String x = e.getActionCommand();

        if (x.equals("C"))
            t.setText("");
        else if (x.equals("=")) {
            double b = Double.parseDouble(t.getText());
            if (op == '+') a += b;
            if (op == '-') a -= b;
            if (op == '*') a *= b;
            if (op == '/') a /= b;
            t.setText("" + a);
        }
        else if ("+-*/".contains(x)) {
            a = Double.parseDouble(t.getText());
            op = x.charAt(0);
            t.setText("");
        }
        else
            t.setText(t.getText() + x);
    }

    public static void main(String[] args) {
        new SimpleCalculate();
    }
}