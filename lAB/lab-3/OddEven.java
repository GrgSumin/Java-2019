import java.awt.*;
import java.awt.event.*;

class OddEven implements ActionListener
{

Frame frame = new Frame();
Label label1=new Label("Number");
Label label2=new Label("Result");
TextField text1=new TextField();
TextField text2=new TextField();
Button b=new Button("Check");
OddEven()
{

label1.setBounds(50,100,100,20);
label2.setBounds(50,140,100,20);
text1.setBounds(200,100,100,20);
text2.setBounds(200,140,100,20);
b.setBounds(50,180,50,20);


frame.add(label1);
frame.add(label2);
frame.add(text1);
frame.add(text2);
frame.add(b);
b.addActionListener(this);
frame.setLayout(null);
frame.setVisible(true);
frame.setSize(400,350);
}


public void actionPerformed(ActionEvent e)
{
int i=Integer.parseInt(text1.getText());
    
if(e.getSource()==b)
{
    if ( i % 2 == 0 ){
        text2.setText("it is Even");
    }
    else{
        text2.setText("it is Odd");
    }
}
      

}

public static void main(String[] args)
{
    OddEven a = new OddEven();
}
}