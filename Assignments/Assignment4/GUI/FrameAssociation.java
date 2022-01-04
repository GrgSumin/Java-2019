import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
class FrameAssociation
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Calculater");
        JLabel number1 = new JLabel();
        JTextField number1text = new JTextField();
        JLabel number2 = new JLabel();
        JTextField number2text = new JTextField();
        JLabel result = new JLabel();
        JTextField resulttext = new JTextField();
        JButton addition = new JButton("Add");
        JButton subtraction = new JButton("Subtract");
        JButton multiply = new JButton("multiply");
        JButton divide = new JButton("Divide");
        
        number1.setText("Number 1:");
        number1.setBounds(10,60,75,25);
        number1text.setBounds(100,60,180,25);
        frame.add(number1);
        frame.add(number1text);
        number2.setText("Number 2: ");
        number2.setBounds(10,60,75,25);
        number2text.setBounds(100,60,180,25);
        frame.add(number2);
        frame.add(number2text);
        result.setText("Answer:");
        result.setBounds(10,60,75,25);
        resulttext.setBounds(100,60,180,25);
        frame.add(result);
        frame.add(resulttext);
        addition.setBounds(10,200,50,35);
        frame.add(addition);
        subtraction.setBounds(80,200,50,35);
        frame.add(subtraction); 
        multiply.setBounds(150,200,50,35);
        frame.add(multiply);
        divide.setBounds(220,200,50,35);
        frame.add(divide);
        frame.setSize(300,400);
        
        frame.setLayout(null);
        frame.setVisible(true);
       
	}

}

