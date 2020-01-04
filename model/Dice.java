public class Dice{
   /**throwDice generates a random number between 1 and 6 including them
     *@return the number generated*/
   public int throwDice(){
      int number=(int)(Math.random()*6)+1;
      return number;
   }
}