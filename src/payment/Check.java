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
public class Check extends Payment{
    private final String name;
    private final String bankID;

    public Check(String name, String bankID) {
        super();
        this.name  = name;
        this.bankID = bankID;
        AB = new AuthorizeCheck();
        PB = new PrintNon();
    }
    
    
/*
    @Override
    protected String authorized() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected String printRecipt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
}
