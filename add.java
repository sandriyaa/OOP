import java.awt.*;
import java.awt.event.*;

public class add extends Frame implements ActionListener {
    TextField T1, T2, T3;
    Label Lb1, Lb2, Lb3;
    Button bAdd, bSubtract, bMultiply, bDivide, bClear;

    add() {
        setLayout(new FlowLayout());

        T1 = new TextField(10);
        T2 = new TextField(10);
        T3 = new TextField(10);
        T3.setEditable(false); // Make the output field non-editable

        Lb1 = new Label("First Number");
        Lb2 = new Label("Second Number");
        Lb3 = new Label("Output");

        bAdd = new Button("+");
        bSubtract = new Button("-");
        bMultiply = new Button("*");
        bDivide = new Button("/");
        bClear = new Button("Clear");

        add(Lb1);
        add(T1);
        add(Lb2);
        add(T2);
        add(Lb3);
        add(T3);
        add(bAdd);
        add(bSubtract);
        add(bMultiply);
        add(bDivide);
        add(bClear);

        bAdd.addActionListener(this);
        bSubtract.addActionListener(this);
        bMultiply.addActionListener(this);
        bDivide.addActionListener(this);
        bClear.addActionListener(this);

        // Setting the frame properties
        setTitle("Simple Calculator");
        setSize(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        int a, b, result;
        try {
            a = Integer.parseInt(T1.getText());
            b = Integer.parseInt(T2.getText());

            if (ae.getSource() == bAdd) 
            {
                result = a + b;
                T3.setText(String.valueOf(result));
            } 
            else if (ae.getSource() == bSubtract) 
            {
                result = a - b;
                T3.setText(String.valueOf(result));
            } 
            else if (ae.getSource() == bMultiply) 
            {
                result = a * b;
                T3.setText(String.valueOf(result));
            } 
            else if (ae.getSource() == bDivide) 
            {
                if (b != 0) 
                {
                    result = a / b;
                    T3.setText(String.valueOf(result));
                } 
                else 
                {
                    T3.setText("Cannot divide by zero");
                }
            } 
            else if (ae.getSource() == bClear) 
            {
                T1.setText("");
                T2.setText("");
                T3.setText("");
            }
        } 
        catch (NumberFormatException e) 
        {
            T3.setText("Invalid input");
        }
    }

    public static void main(String[] args) 
    {
         add obj=new add();
        obj.setTitle("Compare");
        obj.setSize(200, 300);
        obj.setVisible(true);
        obj.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e) 
            {
                System.exit(0);
            }
        });
    }
}
