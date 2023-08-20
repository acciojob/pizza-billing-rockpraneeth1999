package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean cheese = false;
    private boolean toppings = false;
    private boolean takeaway = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            this.price+=300;
        }
        else{
            this.price+=400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!cheese){
            this.cheese=true;
            this.price+=80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppings){
            if(!cheese){
                addExtraCheese();
            }
            this.toppings=true;
            this.price+=70;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeaway){
            this.takeaway=true;
            this.price+=20;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill = "";
        if (isVeg)
            this.bill+="Base Price Of The Pizza: 300\n";
        else
            this.bill+="Base Price Of The Pizza: 400\n";

        if(cheese)
            this.bill+="Extra Cheese Added: 80\n";
        if(toppings)
            this.bill+="Extra Toppings Added: 70\n";
        if(takeaway)
            this.bill+="Paperbag Added: 20\n";
        this.bill+="Total Price: "+this.price+"\n";
        return this.bill;
    }
}
