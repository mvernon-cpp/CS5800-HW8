package org.example.Vending_Machine;

public class VendingMachine {
    //Should reference state of Vending Machine and SnackDispenser plus hold all snacks.
    private SnackDispenseHandler chain = new CokeDispenseHandler( new PepsiDispenseHandler( new CheetosDispenseHandler( new DoritosDispenseHandler( new KitKatDispenseHandler( new SnickersDispenseHandler(null))))));

    private StateOfVendingMachine state = new IdleState();

    public void setState(StateOfVendingMachine state)
    {
        this.state = state;
    }

    public StateOfVendingMachine getState()
    {
        return state;
    }

    void idle()
    {
        getState().idle(this);
    }
    void itemSelection()
    {
        getState().itemSelection(this);

    }
    void acceptMoney()
    {
        getState().acceptMoney(this);
    }
    void dispenseItem()
    {
        getState().dispenseItem(this);
    }
    void dispenseChange()
    {
        getState().dispenseChange(this);
    }
    void cancel()
    {
        getState().cancel(this);
    }

    public void handleSnack(String itemName)
    {
        chain.handleSnack(itemName);
    }
}

