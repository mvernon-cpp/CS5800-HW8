package org.example.Vending_Machine;

public class DispenseChangeState implements StateOfVendingMachine {
    @Override
    public void idle(VendingMachine vendingMachine) {

    }

    @Override
    public void itemSelection(VendingMachine vendingMachine) {

    }

    @Override
    public void acceptMoney(VendingMachine vendingMachine) {

    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {

        vendingMachine.setState( new DispenseItemState() );
        System.out.println("Changing state to Dispensing Items");
    }

    @Override
    public void dispenseChange(VendingMachine vendingMachine) {

    }

    @Override
    public void cancel(VendingMachine vendingMachine) {

    }
}
