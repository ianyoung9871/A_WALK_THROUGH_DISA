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

public class NewClass1 {
    // varaibles to start out our character
    static int health = 100;
    static int hunger = 0;
    static int power = 10;
    static int gold = 50;
    static int speed = 2;
    static int xCord = 0;
    static int yCord = 0;
    static String nameCharacter = "John";
    static int damageDealt;
    static boolean check;
    static int villagerBonus;
    static int damageTaken;
    static Random rand = new Random();
    static Scanner sc = new Scanner(System.in);
    //Random methods
    public static boolean randomBoolean(){
        Random rand = new Random();
        
        return rand.nextBoolean();
    }
    //opening page
    public static String introPage(){
        System.out.println("Hello new player, what is your name: ");
        String name = sc.nextLine();
        System.out.println("Welcome to the game " + name);
        return name;
    }
    //information and main page
    public static void infoPage(){
        System.out.println("Heres is you information " + nameCharacter);
        System.out.println("Your health is: " + health);
        System.out.println("Your hunger is at: " + hunger);
        System.out.println("Your power is at: " + power);
        System.out.println("Your gold is at: " + gold);
        System.out.println("Your speed is at: " + speed);
        System.out.println("Your location is currently (" + xCord + ", " + yCord + ")");    
    }
    // The wild animals that attack
    public static void attackCommonBear(){
        CommonBear newCommonBear = new CommonBear();
        damageDealt = newCommonBear.attackCommonBearCalc(power);
        
        health = health - damageDealt;
        System.out.println("The bear has done " + damageDealt + " damage to you");
        System.out.println("You have " + health + " health remaning");
        
    }
    
    public static void attackCommonWolf(){
        CommonWolf newCommonWolf = new CommonWolf();
        damageDealt = newCommonWolf.attackCommonWolfCalc(power);
        
        health = health - damageDealt;
        
        System.out.println("The wolf has done " + damageDealt + " damage to you");
        System.out.println("You have " + health + " health remaning");
    }
    public static void attackCommonSnake(){
        CommonSnake newCommonSnake = new CommonSnake();
        damageDealt = newCommonSnake.attackCommonSnakeCalc(power);
        
        health = health - damageDealt;
        System.out.println("The snake has done " + damageDealt + " damage to you");
        System.out.println("You have " + health + " heatlh remaning");
        
    }
    // End of the wild animal attacking methods
    
    //Start of villager interactions
    public static void findCommonVillager(){
        CommonVillager newCommonVillager1 = new CommonVillager();
        
        if(newCommonVillager1.randomVillager() == true){
             check = newCommonVillager1.helpfulVillager();
             System.out.println("You have come across a helpful villager");
             
            if(check == true){
                villagerBonus = newCommonVillager1.playerHealth();
                health = health + villagerBonus;
                System.out.println("The villager has healed you by " + villagerBonus);
                System.out.println("You health is now: " + health);
            }
            else{
                villagerBonus = newCommonVillager1.playerGold();
                gold = gold + villagerBonus;
                System.out.println("The villager has donated you " + villagerBonus + " gold");
                System.out.println("You gold is now: " + gold);
            }
        }
        else{
            check = newCommonVillager1.unhelpfulVillager();
            System.out.println("You have come across an unhelpful villager");
            if(check == true){
                villagerBonus = newCommonVillager1.playerHealth();
                health = health - villagerBonus;
                System.out.println("The villager has hurt you by " + villagerBonus);
                System.out.println("You health is now: " + health); 
            }
            else{
                villagerBonus = newCommonVillager1.playerGold();
                gold = gold - villagerBonus;
                System.out.println("The villager has stolen from you " + villagerBonus + " gold");
                System.out.println("You gold is now: " + gold);
            }
        }
 
    }
    //end of villager interaction
    //start of the shop
    public static void checkShopInventory(){
            shop newShop = new shop();
            newShop.shopInventory();
        }
    //end of the shop

    public static void main(String [] args){
        
        /* attackCommonBear();
        attackCommonWolf();
        attackCommonSnake();
        infoPage();
        findCommonVillager();
        checkShopInventory();
        */
        introPage();
    
    }
    
}

