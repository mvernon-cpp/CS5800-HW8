package org.example.Vending_Machine;

public class CheetosDispenseHandler extends SnackDispenseHandler {
    public CheetosDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void handleSnack(String itemName)
    {
        if( itemName.equals("Cheetos") )
        {
            System.out.println("Dispensing Cheetos");
        }
        else
        {
            System.out.println("I was passed from Cheetos");
            super.handleSnack( itemName );
        }
    }
}
