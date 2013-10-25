import java.util.*;
import java.text.*;

public class LuckySevens{

     public static void main(String []args){
        
        int money, dice1, dice2; 
        int greatest = 0, roll= 0, greatestRoll = 0, greatestMoney;
        
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("\nHow much money do you have?");
        money = scan.nextInt();
        greatestMoney = money;
        
        dice1 = random.nextInt(6)+ 1;
        dice2 = random.nextInt(6)+ 1;
        
        while(money >= 1){

            roll++;
            
            if(money > greatestMoney){
                
                greatestMoney = money;
                greatest = (dice1 + dice2);
                greatestRoll = (roll - 1);
                
            }
            
            dice1 = random.nextInt(6)+ 1;
            dice2 = random.nextInt(6)+ 1;
            
            System.out.println("Roll #"+roll+": You are broke after "+money+" rolls. You have $"+money);
        
            //System.out.println("\nDie 1 rolled a "+dice1);
            //System.out.println("Die 2 rolled a "+dice2);
            //System.out.println("The total is: "+(dice1+dice2));
            if(dice1 + dice2 == 7){
            
                money += 4;
                //System.out.println("\nYou win $4! ");
            
            }else{
            
                money -= 1;
                //System.out.println("\nSorry, you lost $1.");
            }
        }
        System.out.println("\nYou went broke on Roll "+roll);
        System.out.println("\nYou should of quit after "+greatestRoll+" rolls. When you had $"+greatestMoney);
    }
}
