package org.example.Vending_Machine;

public class KitKatDispenseHandler extends SnackDispenseHandler {
    public KitKatDispenseHandler(SnackDispenseHandler next) {
        super(next);
    }

    public void handleSnack(String itemName)
    {
        if( itemName.equals("KitKat") )
        {
            System.out.println("Dispensing KitKat");
        }
        else
        {
            System.out.println("I was passed from KitKat");
            super.handleSnack( itemName );
        }
    }
}
