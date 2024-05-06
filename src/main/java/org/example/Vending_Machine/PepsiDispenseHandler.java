package org.example.Vending_Machine;

public class PepsiDispenseHandler extends SnackDispenseHandler {
    public PepsiDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void handleSnack(String itemName)
    {
        if( itemName.equals("Pepsi") )
        {
            System.out.println("Dispensing Pepsi");
        }
        else
        {
            System.out.println("I was passed from Pepsi");
            super.handleSnack( itemName );
        }
    }
}
