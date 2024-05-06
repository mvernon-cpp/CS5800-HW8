package org.example.Vending_Machine;

public class SnickersDispenseHandler extends SnackDispenseHandler {
    public SnickersDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void handleSnack(String itemName)
    {
        if( itemName.equals("Snickers") )
        {
            System.out.println("Dispensing Snickers");
        }
        else
        {
            System.out.println("I was passed from Snickers");
            super.handleSnack( itemName );
        }
    }
}
