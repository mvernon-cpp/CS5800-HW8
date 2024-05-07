package org.example.Vending_Machine;

public class IdleState implements StateOfVendingMachine{

    @Override
    public void idle(VendingMachine vendingMachine) {
        System.out.println("Vending Machine already in Idle State");
    }

    @Override
    public void itemSelection(VendingMachine vendingMachine) {
        vendingMachine.setState( new ItemSelectionState() );
        System.out.println("Changing state to Item Selection. User can now select snacks.");
    }

    @Override
    public void acceptMoney(VendingMachine vendingMachine) {

    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {

    }

    @Override
    public void dispenseChange(VendingMachine vendingMachine) {

    }

    @Override
    public void cancel(VendingMachine vendingMachine) {

    }
}
