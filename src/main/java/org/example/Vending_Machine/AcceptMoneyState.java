package org.example.Vending_Machine;

public class AcceptMoneyState implements StateOfVendingMachine {
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

    }

    @Override
    public void dispenseChange(VendingMachine vendingMachine) {
        vendingMachine.setState( new DispenseChangeState() );
        System.out.println("Changing state to Dispensing Change");
    }

    @Override
    public void cancel(VendingMachine vendingMachine) {
        vendingMachine.setState( new IdleState() );
        System.out.println("Canceling --- Changing state to Idle.\tDispense any change in process");

    }
}
