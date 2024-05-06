package org.example.Vending_Machine;

public class DispenseItemState implements StateOfVendingMachine {
    @Override
    public void idle(VendingMachine vendingMachine) {

        vendingMachine.setState( new IdleState() );
        System.out.println("Changing state to Idle");
    }

    @Override
    public void itemSelection(VendingMachine vendingMachine) {

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
