import java.awt.*;
import java.awt.event.*;

public class Frame_ex extends Frame implements ActionListener {
    TextField T1, T2, T3,T4;
    Label Lb1, Lb2, Lb3,Lb4;
    Button b1,b2;

    Frame_ex() {
        setLayout(new FlowLayout());
        T1 = new TextField(10);
        T2 = new TextField(10);
        T3 = new TextField(10);
        T4 = new TextField(10);
        T4.setEditable(false); // Make the output field non-editable

        Lb1 = new Label("First Number");
        Lb2 = new Label("Second Number");
        Lb3 = new Label("Third Number");
        Lb4 = new Label("Big Number");

        b1 = new Button("Check");
        b2 = new Button("Clear");

        add(Lb1);
        add(T1);
        
        add(Lb2);
        add(T2);
        
        add(Lb3);
        add(T3);
        
        add(b1);
        add(Lb4);
        add(T4);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }

    public void actionPerformed(ActionEvent ae) 
    {
        int a, b,c, result;
        String str;
        if (ae.getSource() == b1) {
                a = Integer.parseInt(T1.getText());
                b = Integer.parseInt(T2.getText());
                c = Integer.parseInt(T3.getText());
                if (a>c)
                {
                    result=a;
                }
                else 
                {
                    result=c;
                }
                if (b>c)
                {
                    result=b;
                }
                else 
                {
                    result=c;
                }
                T4.setText(String.valueOf(result));
        } 
         else if (ae.getSource() == b2) {
            T1.setText("");
            T2.setText("");
            T3.setText("");
            T4.setText("");
        }
    }

    public static void main(String[] args) 
    {
        Frame_ex obj=new Frame_ex();
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
