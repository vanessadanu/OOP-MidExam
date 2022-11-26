/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customer;

/**
 *
 * @author acer
 */
abstract public class Food {
    public String food, category;
    public int price, qty;
    
    public Food(String food, int price, int qty, String category){
        this.food = food;
        this.price = price;
        this.qty = qty;
        this.category = category;
    }
    
    public String getFood(){
        return food;
    }
    public void setFood(String food){
        this.food = food;
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
        return String.format("| %-16s | Rp%-7s | %-2s | %-10s |", food, price, qty, category);
    }

    abstract String category();
    public static class Appetizer extends Food{
        public Appetizer(String food, int price, int qty, String category){
            super(food, price, qty, category);
        }
        
        @Override
        String category(){
            return "Appetizer";
        }
    }

    public static class MainCourse extends Food{
        public MainCourse(String food, int price, int qty, String category){
            super(food, price, qty, category);
        }
        
        @Override
        String category(){
            return "Main Course";
        }
    }

    public static class Dessert extends Food{
        public Dessert(String food, int price, int qty, String category){
            super(food, price, qty, category);
        }
        
        @Override
        String category(){
            return "Dessert";
        }
    }
}
