/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package customer;

import java.util.*;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Food> foodOrder = new ArrayList<Food>();
    public static ArrayList<Drinks> drinkOrder = new ArrayList<Drinks>();
    
    public static void Menu(){
        Food app1 = new Food.Appetizer("Garlic Bread", 25000, 0, "Appetizer");
        Food app2 = new Food.Appetizer("Fried Calamari", 20000, 0, "Appetizer");
        Food main1= new Food.MainCourse("Mushroom Pasta", 50000, 0, "Main Course");
        Food main2 = new Food.MainCourse("Roasted Chicken", 60000, 0, "Main Course");
        Food des1 = new Food.Dessert("Waffle Ice Cream", 30000, 0, "Dessert");
        Food des2 = new Food.Dessert("Strawberry Cheesecake", 35000, 0, "Dessert");
        foodOrder.add(app1);
        foodOrder.add(app2);
        foodOrder.add(main1);
        foodOrder.add(main2);
        foodOrder.add(des1);
        foodOrder.add(des2);
        
        Drinks iced1 = new Drinks.Iced("Lychee Tea", 28000, 0, "Iced");
        Drinks iced2 = new Drinks.Iced("Iced Lemonade", 20000, 0, "Iced");
        Drinks hot1 = new Drinks.Hot("Chamomile Tea", 20000, 0, "Hot") ;
        Drinks hot2 = new Drinks.Hot("Herbal Tea", 18000, 0, "Hot");
        drinkOrder.add(iced1);
        drinkOrder.add(iced2);
        drinkOrder.add(hot1);
        drinkOrder.add(hot2);
    }
   
    //order
    public static void orderFood(int foodQty){
        Scanner input = new Scanner(System.in);
        
        viewFood();
        
        System.out.print("Choice: "); int foodCh = input.nextInt();
        System.out.print("Quantity: "); int fQty = input.nextInt();

        if(foodOrder.get(foodCh - 1).getQty() > 0){
            foodQty = foodOrder.get(foodCh - 1).getQty() + fQty;
            foodOrder.get(foodCh - 1).setQty(foodQty);
        }
        else foodOrder.get(foodCh - 1).setQty(fQty);

        System.out.println("---Successful---");
    }
    
    public static void orderDrinks(int drinkQty){
        Scanner input = new Scanner(System.in);
        
        viewDrinks();
        
        System.out.print("Choice: "); int drinkCh = input.nextInt();
        System.out.print("Quantity: "); int dQty = input.nextInt();

        if(drinkOrder.get(drinkCh - 1).getQty() > 0){
            drinkQty = drinkOrder.get(drinkCh - 1).getQty() + dQty;
            drinkOrder.get(drinkCh - 1).setQty(drinkQty);
        }
        else drinkOrder.get(drinkCh - 1).setQty(dQty);

        System.out.println("---Successful---");
    }
                                
    //display
    public static void viewFood(){
        System.out.println("\n# FOOD ORDERS");
        System.out.println("===========================================================");
        System.out.println("| No. |          Order          |   Price  |   Category   |");
        System.out.println("-----------------------------------------------------------");
        for(int i = 0; i < foodOrder.size(); i++){
            System.out.printf("|%3d  | %-23s | Rp%6d | %-12s |\n", i + 1, foodOrder.get(i).getFood(), foodOrder.get(i).getPrice(), foodOrder.get(i).getCategory());
        }
        System.out.println("===========================================================\n");
    }
    
    public static void viewDrinks(){
        System.out.println("\n# DRINK ORDERS");
        System.out.println("===========================================================");
        System.out.println("| No. |          Order          |   Price  |   Category   |");
        System.out.println("-----------------------------------------------------------");
        for(int i = 0; i < drinkOrder.size(); i++){
            System.out.printf("|%3d  | %-23s | Rp%6d | %-12s |\n", i + 1, drinkOrder.get(i).getDrink(), drinkOrder.get(i).getPrice(), drinkOrder.get(i).getCategory());
        }
        System.out.println("===========================================================\n");
    }
    
    public static void viewTotal(){
        System.out.println("==============================================================");
        System.out.println("| No. |          Order          |   Price  | Qty |   Total   |");
        System.out.println("--------------------------------------------------------------");
        System.out.println("|                            FOOD                            |");
        System.out.println("--------------------------------------------------------------");
        for(int i = 0; i < foodOrder.size(); i++)
                    System.out.printf("|%3d  | %-23s | Rp%6d |%3d  | Rp%7d |\n", i + 1, foodOrder.get(i).getFood(), foodOrder.get(i).getPrice(), foodOrder.get(i).getQty(), foodOrder.get(i).getPrice() * foodOrder.get(i).getQty());
        System.out.println("--------------------------------------------------------------");
        System.out.println("|                           DRINKS                           |");
        System.out.println("--------------------------------------------------------------");
        for(int i = 0; i < drinkOrder.size(); i++)
               System.out.printf("|%3d  | %-23s | Rp%6d |%3d  | Rp%7d |\n", i + 1, drinkOrder.get(i).getDrink(), drinkOrder.get(i).getPrice(), drinkOrder.get(i).getQty(), drinkOrder.get(i).getPrice() * drinkOrder.get(i).getQty());
        System.out.println("--------------------------------------------------------------");
        int total = 0;
        for(int i = 0; i< foodOrder.size(); i++) total+= foodOrder.get(i).getPrice() * foodOrder.get(i).getQty();
        for(int i = 0; i< drinkOrder.size(); i++) total+= drinkOrder.get(i).getPrice() * drinkOrder.get(i).getQty();
        System.out.printf("                     Total                       | Rp%7d |\n", total);
        System.out.println("==============================================================");
    }
    
    public static void main() {
        int n = 0, foodQty = 0, drinkQty = 0;
        
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("\nORDER");
            System.out.println("=====");
            System.out.println("1. Make order");
            System.out.println("2. Pay");
            System.out.println("3. Exit");
            System.out.print("Input: ");
            int menu = input.nextInt();

            switch(menu){
                    case 1:
                        System.out.println("\n# MAKE ORDER");
                        System.out.println("1. Food");
                        System.out.println("2. Drinks");
                        System.out.print("Input: ");
                        int choice = input.nextInt();
                        switch(choice) {
                            case 1:
                                orderFood(foodQty);
                                break;
                                
                            case 2:
                                orderDrinks(drinkQty);
                                break;
                                
                            default:
                                System.out.println("---Wrong input---");
                                break;
                        }
                        
                        break;

                    case 2:
                        System.out.println("\n# TOTAL ORDER(S)");
                        viewTotal();
                        break;
                        
                    case 3:
                        System.out.println("---Thank you---");
                        n = 1;
                        break;
                        
                    default:
                        System.out.println("---Wrong input. Please input valid menu---");
                        break;
            }
        } while (n == 0);
    }
}
