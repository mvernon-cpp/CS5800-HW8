package org.example.Vending_Machine;

public class Snack {
    private String name;
    private double price;
    private int quantity;

    public Snack(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void deductQuantity(int quantity)
    {
        this.quantity = this.quantity - quantity;
    }
    @Override
    public String toString()
    {
        return "[" + this.name + "\t$" + this.price + "\tRemaining: " + this.quantity + "]";
    }
}
