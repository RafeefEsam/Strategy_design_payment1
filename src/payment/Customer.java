/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payment;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Customer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount you will pay : ");
        double amount = input.nextDouble();
        System.out.println("Please enter how you wanna pay : 'Credit', 'Check' or 'Cash'");

        String HowToPay = input.next();
        if ("Cash".equalsIgnoreCase(HowToPay)) {
            Payment cash = new Cash(amount);
            cash.setHowToPay(new PrintCashTrans());
            cash.authorizable();
            cash.printRecipt1(amount);
            

        } else if ("Check".equalsIgnoreCase(HowToPay)) {
            System.out.println("Please Enter your name amd the bank's name");
            String name = input.next();
            String bankid = input.nextLine();
            Payment check = new Check(name, bankid);
            check.setHowToPay(new PrintCashTrans());
            check.authorizable();
            check.printRecipt1(amount);
            

        } else if ("Credit".equalsIgnoreCase(HowToPay)) {
            System.out.println("Please Enter your credit id, the credit type , expdate and "
                    + "how you wanna authorize it 'online or offline' ");
            String id = input.next();
            String type = input.next();
            int expdate = input.nextInt();
            String method = input.next();
            Payment credit = new Credit(id, type, expdate, method);
            credit.setHowToPay(new PrintCashTrans());
            credit.authorizable();
            credit.printRecipt1(amount);
      
        } else {
            System.out.println("payment method NOT valid");
        }
        int x = 0;
    }
}
