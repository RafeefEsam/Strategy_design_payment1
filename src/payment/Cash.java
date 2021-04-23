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
public class Cash  extends Payment{

    private final double cashMoney;
    
    Cash( double cashMoney){
        super();
        this.cashMoney = cashMoney;
        AB = new AuthorizeNon();
        PB = new PrintCashTrans();
//        System.out.println(AB);
    }
    

    
}
