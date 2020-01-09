import javax.swing.*;
/**DiceThrower throws two dice*/
public class DiceThrower {
 public static void main(String[] args){
     DiceDrawer zari=new DiceDrawer(300,300,200,100);
    
      DiceDrawer zari2=new DiceDrawer(300,300,900,100);
   int b=0;
   while(b==0){
      zari.drawDice();
      zari2.drawDice();  
      b=JOptionPane.showConfirmDialog(null,"A deshiron te luash perseri?","Zari",0);
     
   
   }
 }

}