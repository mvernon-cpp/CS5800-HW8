package org.example.Vending_Machine;

public interface StateOfVendingMachine {
//- Represents the different states of the vending machine. What are all the
//things vending machine can do?
    void idle(VendingMachine vendingMachine);
    void itemSelection(VendingMachine vendingMachine);
    void acceptMoney(VendingMachine vendingMachine);
    void dispenseItem(VendingMachine vendingMachine);
    void dispenseChange(VendingMachine vendingMachine);
    void cancel(VendingMachine vendingMachine);

}
