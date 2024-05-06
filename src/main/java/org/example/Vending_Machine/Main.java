package org.example.Vending_Machine;

public class Main {
    public static void main(String[] args)
    {
        Snack coke = new Snack("Coke", 2.99, 1);
        Snack pepsi = new Snack("Pepsi", 2.99, 1);
        Snack cheetos = new Snack("Cheetos", 2.99, 1);
        Snack doritos = new Snack("Doritos", 2.99, 1);
        Snack kitKat = new Snack("KitKat", 2.99, 1);
        Snack snickers = new Snack("Snickers", 2.99, 1);

        VendingMachine vm = new VendingMachine();
        System.out.println("Testing Vending Machine States");
//        vm.idle();  //vm starts in idle state
        vm.itemSelection();
        vm.acceptMoney();
        vm.dispenseChange();
        vm.dispenseItem();
        vm.idle();

        System.out.println();
        vm.itemSelection();
        vm.cancel();

        System.out.println("===============\nTesting Vending Machine Chain of Responsibility");
        vm.handleSnack("Snickers");


    }
}