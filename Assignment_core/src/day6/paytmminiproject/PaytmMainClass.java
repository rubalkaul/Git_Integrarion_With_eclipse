package day6.paytmminiproject;

import java.util.Scanner;

public class PaytmMainClass {


    private void moneyMethod () throws InterruptedException{

        Scanner sc = new Scanner(System.in);
        int rupiah;
        int loopInput;

        PaytmAccount aniketAccount = new PaytmAccount("9406400514","Aniket Kumar",5000);//Account added.

        System.out.println(aniketAccount.toString());

        do {
            System.out.println("Press 1 to ADD MONEY" + "\nPress 2 to MAKE PAYMENT");
            int input = sc.nextInt();
            if (input == 1) {
                System.out.println("Kindly Enter the amount you want to add: ");
                rupiah = sc.nextInt();
                Thread t1 = new PaytmAccountOperations(aniketAccount, rupiah, "Add Money");
                t1.start();
                t1.join();
            } else if (input == 2) {
                System.out.println("Kindly Enter the amount you want to pay: ");
                rupiah = sc.nextInt();
                Thread t2 = new PaytmAccountOperations(aniketAccount, rupiah, "Make Payment");
                t2.start();
                t2.join();
            }
            System.out.println("Kindly enter 1 to CONTINUE and 0 to END");
            loopInput = sc.nextInt();
        }
        while (loopInput == 1);
    }


    public static void main(String[] args) {

        PaytmMainClass x = new PaytmMainClass();
        try {
            x.moneyMethod();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
