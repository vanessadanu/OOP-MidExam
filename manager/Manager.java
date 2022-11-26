/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manager;

import static customer.Main.drinkOrder;
import static customer.Main.foodOrder;
import java.util.*;

public class Manager {
    //add
    public static void addFood(){
        Scanner input = new Scanner(System.in);
        Scanner sInput = new Scanner(System.in);
        
        System.out.println("\nCategory: ");
        System.out.println("1. Appetizer");
        System.out.println("2. Main Course");
        System.out.println("3. Dessert");
        System.out.print("Choice: ");
        int ch = input.nextInt();
        
        System.out.print("Food name: ");
        String fName = sInput.nextLine();
        System.out.print("Price: ");
        int fPrice = input.nextInt();
        
        if(ch == 1) foodOrder.add(new customer.Food.Appetizer(fName, fPrice, 0, "Appetizer"));
        else if(ch == 2) foodOrder.add(new customer.Food.MainCourse(fName, fPrice, 0, "Main Course"));
        else if(ch == 3) foodOrder.add(new customer.Food.Dessert(fName, fPrice, 0, "Dessert"));
        
        System.out.println("---Successful---");
    }
    
    public static void addDrinks(){
        Scanner input = new Scanner(System.in);
        Scanner sInput = new Scanner(System.in);
        
        System.out.println("\nCategory: ");
        System.out.println("1. Iced");
        System.out.println("2. Hot");
        System.out.print("Choice: ");
        int ch = input.nextInt();
        
        System.out.print("Drink name: ");
        String dName = sInput.nextLine();
        System.out.print("Price: ");
        int dPrice = input.nextInt();
        
        if(ch == 1) drinkOrder.add(new customer.Drinks.Iced(dName, dPrice, 0, "Iced"));
        if(ch == 2) drinkOrder.add(new customer.Drinks.Hot(dName, dPrice, 0, "Hot"));
            
        System.out.println("---Successful---");
    }
    
    //view
    public static void viewMenu(){
        System.out.println("===========================================================");
        System.out.println("| No. |          Order          |   Price  |   Category   |");
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                           FOOD                          |");
        System.out.println("-----------------------------------------------------------");
        for(int i = 0; i < foodOrder.size(); i++){
            System.out.printf("|%3d  | %-23s | Rp%6d | %-12s |\n", i + 1, foodOrder.get(i).getFood(), foodOrder.get(i).getPrice(), foodOrder.get(i).getCategory());
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("|                          DRINKS                         |");
        System.out.println("-----------------------------------------------------------");
        for(int i = 0; i < drinkOrder.size(); i++){
            System.out.printf("|%3d  | %-23s | Rp%6d | %-12s |\n", i + 1, drinkOrder.get(i).getDrink(), drinkOrder.get(i).getPrice(), drinkOrder.get(i).getCategory());
        }
        System.out.println("===========================================================");
    }
    
    //delete
    public static void delFood(){
        customer.Main.viewFood();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number to delete: ");
        int no = input.nextInt();
        
        
        for(int i = 0; i < foodOrder.size(); i++){
            if(no == i+1){
                System.out.printf("Confirm deletion for '%s'? (Enter '1' to confirm) ", foodOrder.get(i).food);
                int ch = input.nextInt();
                if(ch == 1){
                    foodOrder.remove(i);
                    System.out.println("---Successful---\n");
                }
                else System.out.println("---Delete canceled---\n");
            }
            //if(foodOrder.get(i).getFood().equals(food)) customer.Main.foodOrder.remove(i);
        }
    }
    
    public static void delDrink(){
        customer.Main.viewDrinks();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number to delete: ");
        int no = input.nextInt();
        
        
        for(int i = 0; i < drinkOrder.size(); i++){
            if(no == i+1){
                System.out.printf("Confirm deletion for '%s'? (Enter '1' to confirm) ", drinkOrder.get(i).drink);
                int ch = input.nextInt();
                if(ch == 1){
                    drinkOrder.remove(i);
                    System.out.println("---Successful---\n");
                }
                else System.out.println("---Delete canceled---\n");
            }
        }
    }
    
    //edit
    public static void editFood(){
        customer.Main.viewFood();
        Scanner input = new Scanner(System.in);
        Scanner sInput = new Scanner(System.in);
        
        System.out.print("Enter number to edit: ");
        int no = input.nextInt();
        
        for(int i = 0; i < foodOrder.size(); i++){
            if(no == i+1){
                System.out.printf("Edit '%s'? (Enter '1' to confirm) ", foodOrder.get(i).food);
                int ch = input.nextInt();
                if(ch == 1){
                    System.out.print("New food: ");
                    String newFood = sInput.nextLine();
                    System.out.print("Price: ");
                    int newPrice= input.nextInt();
                    System.out.println("Category: ");
                    System.out.println("1. Appetizer");
                    System.out.println("2. Main Course");
                    System.out.println("3. Dessert");
                    System.out.print("Choice: ");
                    int ch2 = input.nextInt();
                    
                    foodOrder.get(i).setFood(newFood);
                    foodOrder.get(i).setPrice(newPrice);
                    if(ch2 == 1) foodOrder.get(i).setCategory("Appetizer");
                    else if(ch2 == 2) foodOrder.get(i).setCategory("Main Course");
                    else if(ch2 == 3) foodOrder.get(i).setCategory("Dessert");
                    
                    
                    System.out.println("---Successful---\n");
                }
                else System.out.println("---Edit canceled---\n");
            }
        }
    }
    
    public static void editDrink(){
        customer.Main.viewDrinks();
        Scanner input = new Scanner(System.in);
        Scanner sInput = new Scanner(System.in);
        
        System.out.print("Enter number to edit: ");
        int no = input.nextInt();
        
        for(int i = 0; i < drinkOrder.size(); i++){
            if(no == i+1){
                System.out.printf("Edit '%s'? (Enter '1' to confirm) ", drinkOrder.get(i).drink);
                int ch = input.nextInt();
                if(ch == 1){
                    System.out.print("New drink: ");
                    String newDrink = sInput.nextLine();
                    System.out.print("Price: ");
                    int newPrice= input.nextInt();
                    System.out.println("Category: ");
                    System.out.println("1. Iced");
                    System.out.println("2. Hot");
                    System.out.print("Choice: ");
                    int ch2 = input.nextInt();
                    
                    drinkOrder.get(i).setDrink(newDrink);
                    drinkOrder.get(i).setPrice(newPrice);
                    if(ch2 == 1) drinkOrder.get(i).setCategory("Iced");
                    else if(ch2 == 2) drinkOrder.get(i).setCategory("Hot");
                    
                    System.out.println("---Successful---\n");
                }
                else System.out.println("---Edit canceled---\n");
            }
        }
    }
    
    public static void main() {
        int n = 0, menu;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("\nRESTAURANT MANAGEMENT");
            System.out.println("=====================");
            System.out.println("1. Add menu");
            System.out.println("2. Delete menu");
            System.out.println("3. Edit menu");
            System.out.println("4. View menu");
            System.out.println("5. Exit");
            System.out.print("Input: ");
            menu = input.nextInt();

            switch(menu){
                    case 1:
                        System.out.println("\n# ADD MENU");
                        System.out.println("1. Food");
                        System.out.println("2. Drink");
                        System.out.print("Choice: ");
                        int choice = input.nextInt();
                        if(choice == 1)addFood();
                        else if(choice == 2) addDrinks();
                        else System.out.println("---Wrong input---\n");
                        
                        break;
                        
                    case 2:
                        System.out.println("\n# DELETE MENU");
                        System.out.println("1. Food");
                        System.out.println("2. Drink");
                        System.out.print("Choice: ");
                        int choice2 = input.nextInt();
                        
                        if(choice2 == 1) delFood();
                        else if(choice2 == 2) delDrink();
                        else System.out.println("---Wrong input---\n");
                        
                        break;
                        
                    case 3:
                        System.out.println("\n# EDIT MENU");
                        System.out.println("1. Food");
                        System.out.println("2. Drink");
                        System.out.print("Choice: ");
                        int choice3= input.nextInt();
                        
                        if(choice3 == 1) editFood();
                        else if(choice3 == 2) editDrink();
                        else System.out.println("---Wrong input---\n");
                        
                        break;
                        
                    case 4:
                        System.out.println("\n# VIEW MENU");
                        viewMenu();
                        break;
                        
                    case 5:
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
