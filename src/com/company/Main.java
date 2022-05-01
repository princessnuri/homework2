package com.company;
import java.lang.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(goingOutside(generateRandomAge(),generateRandomTemperature()));
        System.out.println(goingOutside(generateRandomAge(),generateRandomTemperature()));
        System.out.println(goingOutside(generateRandomAge(),generateRandomTemperature()));
        System.out.println(goingOutside(generateRandomAge(),generateRandomTemperature()));
        System.out.println(goingOutside(18,11));
        System.out.println(goingOutside(20,28));
        System.out.println(goingOutside(47,15));
        System.out.println(goingOutside(22,34));
        System.out.println(generateRandomAge());

    }
    public static String goingOutside(int age, int temperature){
        if((age>20 && age<45)&&(temperature>-20 && temperature<30)){
            return "You can go walking";
            }
        else if((age<20)&&(temperature>0 && temperature<28)){
            return "You can go walking";
        }
        else if((age>45)&&(temperature>-10 && temperature<25)){
            return "You can go walking";
        }
        else{
            return "Stay home";
        }

    }
    public static int generateRandomAge(){
        Random random=new Random();
        int randomAge=random.nextInt(100)+1;
        return randomAge;
    }
    public static int generateRandomTemperature(){
        Random random=new Random();
        int randomTemperature=-20+random.nextInt(65)+1;
        return randomTemperature;
    }


}
