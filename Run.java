/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.*;

public class Run {
    public static void main(String[] args) {
        int n = 0, menu;
        
        Scanner input = new Scanner(System.in);
        customer.Main.Menu();
        
        do{
            System.out.println("\nRESTAURANT");
            System.out.println("==========");
            System.out.println("1. Customer");
            System.out.println("2. Restaurant management");
            System.out.println("3. Exit");
            System.out.print("Input: ");
            menu = input.nextInt();

            switch(menu){
                    case 1:
                        customer.Main.main();
                        break;
                        
                    case 2:
                        manager.Main.main();
                        break;
                        
                    case 3:
                        System.out.println("---Thank you---\n");
                        n = 1;
                        break;
                        
                    default:
                        System.out.println("---Wrong input. Please input valid menu---");
                        break;
            }
        } while (n == 0);
    }
}
