package org.example.Vending_Machine;

public class CokeDispenseHandler extends SnackDispenseHandler {
    public CokeDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void handleSnack(String itemName)
    {
        if( itemName.equals("Coke") )
        {
            System.out.println("Dispensing Coke");
        }
        else
        {
            System.out.println("I was passed from Coke");
            super.handleSnack( itemName );
        }
    }
}
