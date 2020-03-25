/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seandfields
 */

import java.util.Random;



class CommonBear {
    Random rand = new Random();
    
    int health = rand.nextInt(61 - 20 + 1) + 20;
    int power = rand.nextInt(3 - 1 + 1) + 1;
    
    public int attackCommonBearCalc(int power){
        
        CommonBear newCommonBear = new CommonBear();
        System.out.println("You run into a bear");
        System.out.println("Bear's health " + newCommonBear.health);
        System.out.println("Bear's power " + newCommonBear.power);
        int a = newCommonBear.health - power; // This is the attack formula
        if( a < 0){
            a = 0;
        }
        int b = a / 2;                  // Takes the bears health - player power
        int damage = b * newCommonBear.power; // Divided by two times the bears power for damage
        
        return damage;
    }
}

class CommonWolf {
    Random rand = new Random();
    
    int health = rand.nextInt(25 - 6 + 1) + 6;
    int power = rand.nextInt(15 - 4 + 1) + 4;
    
    public int attackCommonWolfCalc(int power){
        
        CommonWolf newCommonWolf = new CommonWolf();
        System.out.println("You run into a wolf");
        System.out.println("Wolf's health " + newCommonWolf.health);
        System.out.println("Wolf's power " + newCommonWolf.power);
        int a = newCommonWolf.health - power; // This is the attack formula
        if( a < 0){
            a = 0;
        }
        int b = a / 2;                  // Takes the bears health - player power
        int damage = b * newCommonWolf.power; // Divided by two times the bears power for damage
        
        
        return damage;
    }
    }

class CommonSnake {
    Random rand = new Random();
    
    int health = rand.nextInt(15 - 2 + 1) + 2;
    int power = rand.nextInt(40 - 15 + 1) + 15;
    
    public int attackCommonSnakeCalc(int power){
        
        CommonSnake newCommonSnake = new CommonSnake();
        System.out.println("You run into a snake");
        System.out.println("Snake's health " + newCommonSnake.health);
        System.out.println("Snake's power " + newCommonSnake.power);
        int a = newCommonSnake.health - power; // This is the attack formula
        if( a < 0){
            a = 0;
        }
        int b = a / 2;                  // Takes the bears health - player power
        int damage = b * newCommonSnake.power; // Divided by two times the bears power for damage
     
        return damage;
    }
}



