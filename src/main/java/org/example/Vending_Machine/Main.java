package org.example.Vending_Machine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Creating Vending Machine");

        VendingMachine vm = new VendingMachine();
        vm.idle();

        System.out.println("Filling Vending Machine");

        vm.addSnack( new Snack("Coke", 2.99, 10) );
        vm.addSnack( new Snack("Pepsi", 2.99, 10) );
        vm.addSnack( new Snack("Cheetos", 4.48, 8) );
        vm.addSnack( new Snack("Doritos", 3.98, 12) );
        vm.addSnack( new Snack("KitKat", 1.99, 20) );
        vm.addSnack( new Snack("Snickers", 2.29, 10) );

        vm.printVendingMachine();

        vm.startVendingMachine();

        System.out.println("\nVending Machine - Remaining snacks");

        vm.printVendingMachine();

    }
}