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
public class PrintCashTrans implements PrintBehavior{

    @Override
    public void PrintRecipt(double amount) {
        
        System.out.println ("The Money You Paid is " + amount)  ;

    }
    
}
