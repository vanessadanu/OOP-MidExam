/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customer;

import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class Orders {
    private ArrayList<Food> foodOrder = new ArrayList<>();
    private ArrayList<Drinks> drinkOrder = new ArrayList<>();
    
    public ArrayList<Food> getFoodOrder(){
        return foodOrder;
    }
    public void setFoodOrder(ArrayList<Food> foodOrder){
        this.foodOrder = foodOrder;
    }
    
    public ArrayList<Drinks> getDrinkOrder(){
        return drinkOrder;
    }
    public void setDrinkOrder(ArrayList<Drinks> drinkOrder){
        this.drinkOrder = drinkOrder;
    }
    
    @Override
    public String toString(){
        return "Food = " + foodOrder + "Drinks = " + drinkOrder;
    }
}
