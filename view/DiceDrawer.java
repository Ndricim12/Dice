import javax.swing.*;
import java.awt.*;
/**DiceDrawer draws a dice on the display*/
public class DiceDrawer extends JPanel {
    private int width;
    private int height;
    private int diameter;
    private int number;//a number from 1 to 6 representing the dice numbers
    private int x_position;
    private int y_position;
    /**@param w-the width of the frame
      *@param h-the height of the frame
      *@param x-the x position of the location of the frame on the display
      *@param y-the y position of the location of the frame on the display*/
    public DiceDrawer(int w, int h,int x,int y) {
    width=w;
    height=h;
    x_position=x;
    y_position=y;  
    diameter=width/2;//the diameter of the dice
    JFrame korniza=new JFrame();
    korniza.getContentPane().add(this);
    korniza.setLocation(x_position,y_position);
    korniza.setSize(width,height);
    korniza.setTitle("Dice");
    korniza.setVisible(true);
     Dice dice=new Dice();
    number=dice.throwDice();

 }

 public void paintComponent(Graphics g){
    int c=(((width-diameter)/2)+(diameter/3))/10;
    int k=(((height-diameter)/2)+(diameter/3))/10;
      g.setColor(Color.darkGray);
      g.fillRect(0,0,width,height);
      g.setColor(Color.white);
      g.fillRect((width-diameter)/2,(height-diameter)/2,diameter,diameter);
      g.setColor(Color.black);
      g.drawRect((width-diameter)/2,(height-diameter)/2,diameter,diameter);

      if(number==1){
      g.fillOval((((width-diameter)/2)+(diameter/3))+c,(((height-diameter)/2)+(diameter/3))+k,width/13,height/13);
      }
      
      
      else if(number==2){
            g.fillOval((((width-diameter)/2)+(diameter/3))+c,(((height-diameter)/2)+(diameter/3))-k,width/13,height/13);
            g.fillOval((((width-diameter)/2)+(diameter/3))+c,(((height-diameter)/2)+(diameter/3))+4*k,width/13,height/13);
      }

      else if(number==3){
            g.fillOval((((width-diameter)/2)+(diameter/3))+c,(((height-diameter)/2)+(diameter/3))-2*k,width/13,height/13);
            g.fillOval((((width-diameter)/2)+(diameter/3))+c,(((height-diameter)/2)+(diameter/3))+4*k,width/13,height/13);
            g.fillOval((((width-diameter)/2)+(diameter/3))+c,(((height-diameter)/2)+(diameter/3))+k,width/13,height/13);
      }

      else if(number==4){
            g.fillOval((((width-diameter)/2)+(diameter/3))+4*c,(((height-diameter)/2)+(diameter/3))-2*k,width/13,height/13);
            g.fillOval((((width-diameter)/2)+(diameter/3))+4*c,(((height-diameter)/2)+(diameter/3))+4*k,width/13,height/13);
            g.fillOval((((width-diameter)/2)+(diameter/3))-2*c,(((height-diameter)/2)+(diameter/3))-2*k,width/13,height/13);
            g.fillOval((((width-diameter)/2)+(diameter/3))-2*c,(((height-diameter)/2)+(diameter/3))+4*k,width/13,height/13);
      }

      else if(number==5){
            g.fillOval((((width-diameter)/2)+(diameter/3))+4*c,(((height-diameter)/2)+(diameter/3))-2*k,width/13,height/13);
            g.fillOval((((width-diameter)/2)+(diameter/3))+4*c,(((height-diameter)/2)+(diameter/3))+4*k,width/13,height/13);
            g.fillOval((((width-diameter)/2)+(diameter/3))+c,(((height-diameter)/2)+(diameter/3))+k,width/13,height/13);
            g.fillOval((((width-diameter)/2)+(diameter/3))-2*c,(((height-diameter)/2)+(diameter/3))-2*k,width/13,height/13);
            g.fillOval((((width-diameter)/2)+(diameter/3))-2*c,(((height-diameter)/2)+(diameter/3))+4*k,width/13,height/13);
      }

      else if(number==6){
            g.fillOval((((width-diameter)/2)+(diameter/3))+4*c,(((height-diameter)/2)+(diameter/3))-2*k,width/13,height/13);
            g.fillOval((((width-diameter)/2)+(diameter/3))+4*c,(((height-diameter)/2)+(diameter/3))+4*k,width/13,height/13);
            g.fillOval((((width-diameter)/2)+(diameter/3))+4*c,(((height-diameter)/2)+(diameter/3))+k,width/13,height/13);
            g.fillOval((((width-diameter)/2)+(diameter/3))-2*c,(((height-diameter)/2)+(diameter/3))+k,width/13,height/13);
            g.fillOval((((width-diameter)/2)+(diameter/3))-2*c,(((height-diameter)/2)+(diameter/3))-2*k,width/13,height/13);
            g.fillOval((((width-diameter)/2)+(diameter/3))-2*c,(((height-diameter)/2)+(diameter/3))+4*k,width/13,height/13);
      
      }




 }
      public void drawDice() {
         Dice dice=new Dice();
         number=dice.throwDice();
         this.repaint();


      }
 
 }

