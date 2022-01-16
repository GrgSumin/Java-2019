import java.awt.*;
import java.awt.event.*;
public class Flag extends Frame
{
Flag()
{
setTitle("Flag of Nepal");
setSize(800,800);
setVisible(true);


}


public void paint(Graphics g)
{
    // Creating the black color rod to hold the flag
    g.setColor(Color.BLACK);
    g.fillRect(30,30,10,600);

    // creating the outer blue part of flag
    g.setColor(Color.BLUE);
    int x1Points[] = {40,340,120,540,40,40};
    int y1Points[] = {30,230,230,530,530,30};
    g.fillPolygon(x1Points,y1Points,5);

    // creating inner red part flag 
    g.setColor(Color.RED);
    int x2Points[] = {50,310,90,505,50,50};
    int y2Points[] = {50,220,220,520,520,50};
    g.fillPolygon(x2Points,y2Points,5);

    // circle white sun      
    g.setColor(Color.WHITE);        
    g.fillArc(100,350,125,125,0,360);                  

    // for the half moon shape          
    g.fillArc(100,155,100,35,0,-180); 

     
    


}

public static void main(String[] args) 
{
    new Flag();    
}
}
