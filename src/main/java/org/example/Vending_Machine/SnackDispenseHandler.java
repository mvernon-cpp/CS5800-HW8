package org.example.Vending_Machine;

public abstract class SnackDispenseHandler {
    private SnackDispenseHandler next;

    public SnackDispenseHandler( SnackDispenseHandler next )
    {
        this.next = next;
    }

    public void handleSnack(String itemName)
    {
        if( next != null )
        {
            next.handleSnack( itemName );
        }
    }
}
