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
public class AuthorizeCredit2 implements AuthorizeBehavior{

    @Override
    public void authorized() {
        System.out.println("\nCongratulation Your Credit2 Is Authorized successfully");
    }
    
}
