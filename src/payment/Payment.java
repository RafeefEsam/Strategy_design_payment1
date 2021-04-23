/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payment;

/**
 *
 * @author Administrator
 */
public abstract class Payment {

    private double amount;
    private String HowToPay;
    protected AuthorizeBehavior AB;
    protected PrintBehavior PB;

    public void setHowToPay(PrintBehavior HowToPay) {
        this.PB = HowToPay;
    }

    public void printRecipt1(double amount) {
        PB.PrintRecipt(amount);
    }

    public void authorizable() {
        AB.authorized();
    }

}
