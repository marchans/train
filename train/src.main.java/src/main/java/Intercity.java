package src.main.java;

public class Intercity implements Train{
    private int cart = 6;
    public Intercity() {}
    public Intercity(int cart){
    	this.cart=cart;
    }
    public void drive() {
    	System.out.println("Intercity drives "+cart+" carts.");
    }
}

