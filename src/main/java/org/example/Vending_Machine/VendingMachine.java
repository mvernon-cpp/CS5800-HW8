package org.example.Vending_Machine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VendingMachine {
    //Should reference state of Vending Machine and SnackDispenser plus hold all snacks.
    private SnackDispenseHandler chain = new CokeDispenseHandler( new PepsiDispenseHandler( new CheetosDispenseHandler( new DoritosDispenseHandler( new KitKatDispenseHandler( new SnickersDispenseHandler(null))))));

    private StateOfVendingMachine state = new IdleState();
    private ArrayList<Snack> snacks;
    private HashMap<Snack,Integer> userSelectedSnacks;
    private double userMoney;
    private double totalPrice;

    public VendingMachine()
    {
        this.snacks = new ArrayList<>();
        this.userSelectedSnacks = new HashMap<>();
        this.userMoney = 0;
        this.totalPrice = 0;
    }

    public void addSnack(Snack snack)
    {
        snacks.add(snack);
    }

    public ArrayList<Snack> getSnacks()
    {
        return this.snacks;
    }

    public void setState(StateOfVendingMachine state)
    {
        this.state = state;
    }

    public StateOfVendingMachine getState()
    {
        return state;
    }

    public void startVendingMachine(){
        this.itemSelection();
    }

    public void idle()
    {
        getState().idle(this);
    }
    public void itemSelection() {
        getState().itemSelection(this);
        selectSnack();
        printSelectedSnack();

        this.acceptMoney();
    }

    private void selectSnack() {
        Scanner sc = new Scanner(System.in);

        int exit = 1;

        while(exit == 1 )
        {
            System.out.println("Select snack number (0 - exit, 7 - cancel selection): ");
            int userSelectedSnack = sc.nextInt();
            sc.nextLine();

            if( userSelectedSnack == 0 ) {
                exit = 0;
                System.out.println("Exiting item selection...");
                continue;
            }

            if( userSelectedSnack == 7 ) {
//                exit = 0;
                System.out.println("Canceling item selection...");
                cancel();
                break;
            }

            if( userSelectedSnack < 0 || userSelectedSnack > 7)
            {
                System.out.println("Invalid item selection...");
                continue;
            }

            System.out.println("Enter quantity: ");
            int userSelectedQuantity = sc.nextInt();
            sc.nextLine();

            userSelectedSnack--;
            Snack s = snacks.get(userSelectedSnack);

            boolean snackQuantity = checkSnackQuantity(s, userSelectedQuantity);

            if( snackQuantity ) {
                s.deductQuantity(userSelectedQuantity);
                userSelectedSnacks.put(s, userSelectedQuantity);
            }
            else
            {
                System.out.println("Invalid quantity entered. Snack not added.");
            }
        }
    }

    private boolean checkSnackQuantity(Snack snack, int quantity) {
        return quantity <= snack.getQuantity();
    }

    private void printSelectedSnack() {
        System.out.println("User selected the following snacks:\n==============================");
        for(Map.Entry<Snack, Integer> userSelectedSnack : userSelectedSnacks.entrySet() )
        {
            System.out.println(userSelectedSnack.getKey().getName() + ":\t$" + userSelectedSnack.getKey().getPrice() + " x " + userSelectedSnack.getValue());
        }
    }
    public void acceptMoney()
    {
        getState().acceptMoney(this);
        getSnackTotal();
        insertMoney();

        this.dispenseChange();
    }

    private void insertMoney() {
        Scanner sc = new Scanner(System.in);

        int exit = 1;

        while(exit == 1 ) {
            System.out.print("Enter inserted money: $");
            this.userMoney += sc.nextDouble();
            sc.nextLine();

            System.out.print("Are you finished entering money? (y/n/cancel)");
            String input = sc.nextLine().toLowerCase();
            if (input.equals("y") && this.userMoney >= this.totalPrice) {
                exit = 0;
                continue;
            }

            if (input.equals("cancel")) {
                exit = 0;
                cancel();
                break;
            }

            if( this.userMoney < this.totalPrice) {
                System.out.println("Insufficient funds. $" + this.userMoney);
            }
        }
    }

    private void getSnackTotal() {
        double totalPrice = 0;
        for(Map.Entry<Snack, Integer> userSelectedSnack : userSelectedSnacks.entrySet() )
        {
            totalPrice += userSelectedSnack.getKey().getPrice() * userSelectedSnack.getValue();
        }

        System.out.println("Total: $" + totalPrice);

        this.totalPrice = totalPrice;
    }

    public void dispenseChange()
    {
        getState().dispenseChange(this);

        System.out.println("User inserted\t$" + userMoney + "\nTotal price\t\t$" + totalPrice + "\n------------------------------");
        userMoney = userMoney - totalPrice;
        System.out.println("Change dispensed\t$" + userMoney);

        this.dispenseItem();
    }

    public void dispenseItem()
    {
        getState().dispenseItem(this);

        dispenseSnack();

        this.idle();
    }

    private void dispenseSnack() {

        for(Map.Entry<Snack, Integer> userSelectedSnack : userSelectedSnacks.entrySet() )
        {
            String snackName = userSelectedSnack.getKey().getName();
            for (int i = 0; i < userSelectedSnack.getValue(); i++) {
                handleSnack(snackName);
            }
        }
    }

    public void cancel()
    {
        getState().cancel(this);
    }
    public void handleSnack(String itemName)
    {
        chain.handleSnack(itemName);
    }

    public void printVendingMachine()
    {
        int selectNumber = 1;
        for(Snack snack : snacks)
        {
            System.out.println(selectNumber++ + ". " + snack);
        }
    }
}

