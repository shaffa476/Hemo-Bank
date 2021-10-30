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
public class bloodbagTest {
    
    public bloodbagTest() {
    }

    @Test
    public void view_donor_Blood_bag_info()  
    { 
        // 1. User is registering .
        // 2. Registerded user is added as donor --- eleigibily 
        // 3. only when he is eligible is added as donor 
        // 4. when he donates blood we are taking its blood bag info 
        // then printing.
    Register user =  new Register(101,"Sara","Jones","sarah","sarajones", "sara@gmail.com",33671233);
    Donor  donor =  new Donor (101,18,60,"Healthy","B+");
    bloodbag b =    new bloodbag(user.getId(),"26/5/21","24/4/21");
     
    Register user1 = new Register(201,"Smith","Walker","smith","smithwalker", "smith@gmail.com",33126633);
    Donor  donor1 = new Donor (201,18,60,"Healthy","B+");
    bloodbag b1 = new bloodbag(user1.getId(),"26/6/21","21/5/21");
   
    Roster R = new Roster();
    
       R.addUser(user);
       R.addDonor(donor,user.getId());
       
       R.addUser(user1);
         R.addDonor(donor1,user1.getId());
         
      boolean actualresult = R.add_blood_bag_info(donor , user.getId(), b);
       
       assertTrue(actualresult);
    }
    
    @Test
    public void test_invalid_user_exist_blood_bag_info()
    { 
        // calling bloood bag info of invalid bllod group--- donor doesn't exist user
        // 1. User register
        // 2. Registerded user is added as donor --- eleigibily - Group -- B -- invalid  
        // 3. he is not a donor -- not  added 
        // 4. return false blood_info will returnfalse because donor doesn't exist
    Register user =  new Register(101,"Sara","Jones","sarah","sarajones", "sara@gmail.com",33671233);
    Donor  donor =  new Donor (101,18,60,"Healthy","");
    Roster R = new Roster();
    R.addUser(user);
    R.addDonor(donor, user.getId()); // invalid bloood group 
    bloodbag b =    new bloodbag(user.getId(),"26/5/21","24/4/21");
        boolean actualresult = R.add_blood_bag_info(donor , user.getId(), b);
       
       assertFalse(actualresult);
    }
    
    @Test
    public void test_donor_donate_Blood_donor_doesnt_exist()
    {
        
      Register user =  new Register(101,"Sara","Jones","sarah","sarajones", "sara@gmail.com",33671233);
      
       Donor  donor = new Donor (201,18,60,"Healthy","B+");
        bloodbag b =    new bloodbag(user.getId(),"26/5/21","24/4/21");
       Roster R = new Roster();
     
 
       boolean actualresult = R.add_blood_bag_info(donor , user.getId(), b);
       
       assertFalse(actualresult);
      
     
    }
    
}
