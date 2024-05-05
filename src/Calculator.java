import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;   /*this lines import necessary classes
 for creating GUI and handling events (like button clicks)in java.*/


public class Calculator {     //new class named Calculator, (main class of this program)
    private JPanel Calculator;  //which is the container that holds components like buttons and text in GUI
    private JTextField txtDisplay;  //which is the text feild where the user can input and view number
    private JButton button1;
    private JButton button2;   // this declear a private variable for each button in calculator
    private JButton button3;
    private JButton button4;
    private JButton ACButton;
    private JButton button6;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a00Button;
    private JButton button11;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton button16;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button20;

    double a,b,result;
    String op;



    public Calculator() {   /*the constructor 'public Calculator()' initializes the calculator GUI
        and setup event listeners for each button.*/
        ACButton.addActionListener(new ActionListener() {  //ActionListener to perform specific action when clicked
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("");

            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a9Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a6Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a3Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a0Button.getText());
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a00Button.getText());
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtDisplay.getText().contains(".")){
                    double pm = Double.parseDouble(txtDisplay.getText());
                    pm= pm*-1;
                    txtDisplay.setText(String.valueOf(pm));
                }else
                {
                    long PM =Long.parseLong(txtDisplay.getText());
                    PM=PM*-1;
                    txtDisplay.setText(String.valueOf(PM));
                }
            }
        });
        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtDisplay.getText().contains("."))
                {
                    txtDisplay.setText(txtDisplay.getText() + button11.getText());
                }
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(txtDisplay.getText());
                op="+";
                txtDisplay.setText("");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(txtDisplay.getText());
                op="-";
                txtDisplay.setText("");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(txtDisplay.getText());
                op="*";
                txtDisplay.setText("");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(txtDisplay.getText());
                op="/";
                txtDisplay.setText("");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;
                if(txtDisplay.getText().length() > 0)
                {
                    StringBuilder strB = new StringBuilder(txtDisplay.getText());
                    strB.deleteCharAt(txtDisplay.getText().length()-1);
                    backspace= String.valueOf(strB);
                    txtDisplay.setText(backspace);
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(txtDisplay.getText());
                if(op == "+")
                {
                    result = a+b;
                    txtDisplay.setText(String.valueOf(result));
                } else if (op == "-")
                {
                    result = a-b;
                    txtDisplay.setText(String.valueOf(result));

                }
                else if (op == "*")
                {
                    result = a*b;
                    txtDisplay.setText(String.valueOf(result));

                }
                else if (op == "/")
                {
                    result = a/b;
                    txtDisplay.setText(String.valueOf(result));

                }
            }
        });
    }

    public static void main(String[] args) { //creates an instance of the 'Calculator' class, set GUI and make it visible
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);/*This line sets the content pane of the GUI frame
         to the Calculator panel, which contains all the buttons and text fields*/
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);/*This line sets the default close operation for
         the frame, which exits the program when the window is closed */
        frame.pack();    // This line sizes the frame to fit its contents.
        frame.setVisible(true);  //This line makes the frame visible on the screen
    }
}
