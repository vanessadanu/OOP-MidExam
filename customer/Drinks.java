/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customer;

/**
 *
 * @author acer
 */
abstract public class Drinks {
    public String drink, category;
    public int price, qty;
    
    public Drinks(String drink, int price, int qty, String category){
        this.drink = drink;
        this.price = price;
        this.qty = qty;
        this.category = category;
    }
    
    public String getDrink(){
        return drink;
    }
    public void setDrink(String drink){
        this.drink = drink;
    }
    
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    
    @Override
    public String toString(){
        return String.format("| %-16s | Rp%-7s | %-2s | %-10s |", drink, price, qty, category);
    }
    
    abstract String category();
    public static class Hot extends Drinks{
        public Hot(String drink, int price, int qty, String category) {
            super(drink, price, qty, category);
        }
        
        @Override
        String category(){
            return "Hot";
        }
    }
    
    public static class Iced extends Drinks{
        public Iced(String drink, int price, int qty, String category) {
            super(drink, price, qty, category);
        }
        
        @Override
        String category(){
            return "Iced";
        }
    }
}
