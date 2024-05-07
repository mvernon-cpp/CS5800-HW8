package org.example.Vending_Machine;

import org.example.Vending_Machine.StateOfVendingMachine;

public class ItemSelectionState implements StateOfVendingMachine {
    @Override
    public void idle(VendingMachine vendingMachine) {
        
    }

    @Override
    public void itemSelection(VendingMachine vendingMachine) {
        System.out.println("Vending Machine already in Item Selection State");
    }

    @Override
    public void acceptMoney(VendingMachine vendingMachine) {
        vendingMachine.setState( new AcceptMoneyState() );
        System.out.println("Changing state to Accept Money. User can now insert money.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {

    }

    @Override
    public void dispenseChange(VendingMachine vendingMachine) {

    }

    @Override
    public void cancel(VendingMachine vendingMachine) {
        vendingMachine.setState( new IdleState() );
        System.out.println("Canceling --- Changing state to Idle");
    }
}
