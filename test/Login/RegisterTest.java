/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class RegisterTest {
    
    public RegisterTest() { 
    }

    @Test //Test add user functionallity with valid username
    public void valid_username() {
     
        Register user = new Register(101,"Sara","Jones","sarah","sarajones", "sara@gmail.com",33671233);
        Roster R = new Roster();
        boolean ActualResult  = R.addUser(user);
        assertTrue(ActualResult);  
    }
    
    @Test //Test add user functionallity with invalid username
    public void invalid_username(){
     
        Register user = new Register(101,"Sara","Jones","s","sarajones", "sara@gmail.com",33671233);
        Roster R = new Roster();
        boolean ActualResult  = R.addUser(user);
        assertFalse(ActualResult);   
    }
    
     @Test //Test add user functionallity with invalid email
    public void invalid_email(){
     
        Register user = new Register(101,"Sara","Jones","sarah","sarajones", "@gmail.com",33671233);
        Roster R = new Roster();
        boolean ActualResult  = R.addUser(user);
        assertFalse(ActualResult);  
    }
    
    @Test //Test add user functionallity with valid email
    public void valid_email(){
     
        Register user = new Register(101,"Sara","Jones","sarah","sarajones", "sara@gmail.com",33671233);
        Roster R = new Roster();
        boolean ActualResult  = R.addUser(user);
        assertTrue(ActualResult);   
    }
    
     @Test //Test add user functionallity with valid all
    public void valid_all(){
     
        Register user = new Register(101,"Sara","Jones","sarah","sarajones", "sara@gmail.com",33671233);
        Roster R = new Roster();
        boolean ActualResult  = R.addUser(user);
        assertTrue(ActualResult);   
    }
    
    @Test //Test add user functionallity with valid password
    public void valid_password(){
        Register user = new Register(101,"Sara","Jones","sarah","sarahjones", "sara@gmail.com",33671233);
        Roster R = new Roster();
        boolean ActualResult  = R.addUser(user);
        assertTrue(ActualResult);   
    }
    
    @Test //Test add user functionallity with invalid password
    public void invalid_password(){
        Register user = new Register(101,"Sara","Jones","sarah","sar", "sara@gmail.com",33671233);
        Roster R = new Roster();
        boolean ActualResult  = R.addUser(user);
        assertFalse(ActualResult);   
    }
    

    
}
