/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author acer
 */

class Login {
    private String div;
    private String uname;
    private String pass;

    public Login(String div, String uname, String pass){
        this.div = div;
        this.uname = uname;
        this.pass = pass;
    }

    public String getDiv(){
        return this.div;
    }
    
    public String getUname(){
        return this.uname;
    }

    public String getPass(){
        return this.pass;
    }
}

public class Main {
    public static void main(){
        int n = 0, menu;
        List<Login> account = new ArrayList<Login>();
        
        Login acc1 = new Login("Chef", "admin1", "123456");
        Login acc2 = new Login("Waiter", "admin2", "678910");
        account.add(acc1);
        account.add(acc2);
        
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        
        do{
            System.out.println("\nADMIN");
            System.out.println("=====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Input: ");
            menu = input.nextInt();

            switch(menu){
                    case 1:
                        System.out.println("\n# REGISTER");
                        System.out.print("Division: ");
                        String rDiv = input1.nextLine();
                        System.out.print("Username: ");
                        String rUname = input1.nextLine();
                        System.out.print("Password: ");
                        String rPass = input1.nextLine();
                        
                        account.add(new Login(rDiv, rUname, rPass));
                        System.out.println("---Successful---");
                        break;
                        
                    case 2:
                        System.out.println("\n#LOGIN");
                        System.out.print("Division: ");
                        String lDiv = input1.nextLine();
                        System.out.print("Username: ");
                        String lUname = input2.nextLine();
                        System.out.print("Password: ");
                        String lPass = input2.nextLine();
                        
                        for(Login Login : account){
                            if(Login.getDiv().equals(lDiv) && Login.getUname().equals(lUname) && Login.getPass().equals(lPass)){
                                System.out.println("---Successful---");
                                manager.Manager.main();
                            }
                        }
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