import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;
class InheritanceFrame extends Frame
{
	public static void main(String[] args)
	{
        InheritanceFrame fw = new InheritanceFrame();
        Label number1 = new Label();
        TextField number1text = new TextField();
        Label number2 = new Label();
        TextField number2text = new TextField();
        Label result = new Label();
        TextField resulttext = new TextField();
        Button addition = new Button("Add");
        Button subtraction = new Button("Subtract");
        Button multiply = new Button("multiply");
        Button divide = new Button("Divide");
        
        number1.setText("Number 1:");
        number1.setBounds(10,60,75,25);
        number1text.setBounds(100,60,180,25);
        fw.add(number1);
        fw.add(number1text);
        number2.setText("Number 2: ");
        number2.setBounds(10,60,75,25);
        number2text.setBounds(100,60,180,25);
        fw.add(number2);
        fw.add(number2text);
        result.setText("Answer:");
        result.setBounds(10,60,75,25);
        resulttext.setBounds(100,60,180,25);
        fw.add(result);
        fw.add(resulttext);
        addition.setBounds(10,200,50,35);
        fw.add(addition);
        subtraction.setBounds(80,200,50,35);
        fw.add(subtraction); 
        multiply.setBounds(150,200,50,35);
        fw.add(multiply);
        divide.setBounds(220,200,50,35);
        fw.add(divide);
        fw.setSize(300,400);
        fw.setLayout(null);
        fw.setVisible(true);
        fw.setLayout(null);
        fw.setVisible(true);
	}

}