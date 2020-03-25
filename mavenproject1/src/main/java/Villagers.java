/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seandfields
 */
import java.util.*;

public class Villagers {
   
}

class CommonVillager{
    static Random rand = new Random();
    
    public static boolean randomVillager(){
        boolean check = rand.nextBoolean();
        return check;
    }
    public static boolean helpfulVillager(){
        boolean check = rand.nextBoolean();
        return check;
    }
    
    public static boolean unhelpfulVillager(){
        boolean check = rand.nextBoolean();
        return check;
    }
    public static int playerHealth(){
        int power = rand.nextInt(35 - 6 + 1) + 6;
        return power;
    }
    
    public static int playerGold(){
        int wealth = rand.nextInt(25 - 5 + 1) + 5;
        return wealth;
    }
    
}

class shop{
    Random rand = new Random();
    
    int sword = rand.nextInt(50 - 15 + 1) + 15;
    int potion = rand.nextInt(60 - 10 + 1) + 10;
    int shoes = rand.nextInt(25 - 1 + 1) + 1;
    
    int swordPrice = sword / 2 + 5;
    int potionPrice = potion / 2 + 5;
    int shoesPrice = shoes / 2 + 5;
            
    public static void shopInventory(){
        shop newShop = new shop();
        
        System.out.println("Sword- Power: " + newShop.sword + "        | Price: " + newShop.swordPrice + "$");
        System.out.println("Potion- Health regen: " + newShop.potion + "| Price: " + newShop.potionPrice + "$");
        System.out.println("Shoes- Speed Increase: " + newShop.shoes + "| Price: " + newShop.shoesPrice + "$");
    }
}

    
    



    
    
    
    