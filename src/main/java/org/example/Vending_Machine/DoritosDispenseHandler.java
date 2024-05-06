package org.example.Vending_Machine;

public class DoritosDispenseHandler extends SnackDispenseHandler {
    public DoritosDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void handleSnack(String itemName)
    {
        if( itemName.equals("Doritos") )
        {
            System.out.println("Dispensing Doritos");
        }
        else
        {
            System.out.println("I was passed from Doritos");
            super.handleSnack( itemName );
        }
    }
}
