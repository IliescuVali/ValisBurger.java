

public class Main {
    public static void main(String[] args){


//        Item coke= new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//
//
//        Item avocado = new Item("Topping" , "avocado" , 1.50);
//        avocado.printItem();
//
//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("Bacon", "CHEESE", "MAYO");
//        burger.printItem();

//        MealOrder regularMeal=new MealOrder();
//        regularMeal.addBurgerTopping("BACON", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

        MealOrder secoundMeal = new MealOrder("happy cow", "Pepsi", "chili");
        secoundMeal.addBurgerTopping("LETTUCE","CHEESE", "MAYO");
        secoundMeal.setDrinkSize("SMALL");
        secoundMeal.printItemizedList();




    }
}