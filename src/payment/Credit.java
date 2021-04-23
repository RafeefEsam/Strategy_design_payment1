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
public class Credit extends Payment{ 
    
    private final String id;
    private final String type;
    private final int expDate;
    private final String method;

    public Credit(String id, String type, int expDate, String method) {
        super();
        this.id = id;
        this.type = type;
        this.expDate = expDate;
        this.method = method;
        PB = new PrintCashTrans();
        if ("online".equalsIgnoreCase(method)){
            AB = new AuthorizeCredit1();
        }else{
            AB = new AuthorizeCredit2();
        }
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

    Credit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
