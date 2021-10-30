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
public class DonorTest {
    
    
    public DonorTest() {
    }
    
    Register user =  new Register(101,"Sara","Jones","sarah","sarajones", "sara@gmail.com",33671233);
    Register user1 = new Register(201,"Smith","Walker","smith","smithwalker", "smith@gmail.com",33126633);
     Donor  donor = new Donor (101,18,60,"Healthy","B");
    Roster R = new Roster();
   
    @Test
    public  void test_medical_condition(){
     Donor  donor = new Donor (101,21,60,"Not Healthy","B+");
      R.addUser(user);
      boolean ActualResult = R.addDonor(donor,  user.getId());
     assertFalse(ActualResult);  
    }
    
    @Test
    public  void test_age(){
      Donor  donor = new Donor (101,16,60,"Not Healthy","B+");
      R.addUser(user);
      boolean ActualResult = R.addDonor(donor,user.getId());
      assertFalse(ActualResult);  
    }
    
    @Test
    public  void test_blood_type_invalid(){
      Donor  donor = new Donor (101,18,60,"Healthy","C");
      R.addUser(user);
      boolean ActualResult = R.addDonor(donor,user.getId());
      assertFalse(ActualResult);  
    }
    
    @Test
    public  void test_valid_added(){
      Donor  donor = new Donor (101,18,60,"Healthy","B+");
      R.addUser(user);
      boolean ActualResult = R.addDonor(donor,user.getId());
      assertTrue(ActualResult);  
    }
    
    @Test 
    public void test_search_donor()
    { 
       Register user =  new Register(101,"Sara","Jones","sarah","sarajones", "sara@gmail.com",33671233);
       Register user1 = new Register(201,"Smith","Walker","smith","smithwalker", "smith@gmail.com",33126633);
       Donor  donor = new Donor (101,18,60,"Healthy","B");
       Roster R = new Roster();
       R.addUser(user);
       R.addUser(user1);
      
      int Result= R.searchUser(donor.getId());  // with this id 
      int expectedresult = user.getId();
      if(Result == -1){
         System.out.println("can't find the donor");
      }
      else{
        Result = donor.getId();
      }
      assertEquals(expectedresult,Result);
    }
    
    
    
    @Test 
    public void test_delete_Donor_with_Valid_USERID(){
       Register user =  new Register(101,"Sara","Jones","sarah","sarajones", "sara@gmail.com",33671233);
       Register user1 = new Register(201,"Smith","Walker","smith","smithwalker", "smith@gmail.com",33126633);
       Donor  donor = new Donor (101,18,60,"Healthy","B+");
       Roster R = new Roster();
       R.addUser(user);
       R.addUser(user1);
       R.addDonor(donor,user.getId());
       
      boolean ActualResult = R.deleteDonor(donor, donor.getId());
      assertTrue(ActualResult);  
    }
    
    @Test 
    public void test_delete_Donor_with_InValid_USERID(){
     Register user =  new Register(101,"Sara","Jones","sarah","sarajones", "sara@gmail.com",33671233);
       Register user1 = new Register(201,"Smith","Walker","smith","smithwalker", "smith@gmail.com",33126633);
       Donor  donor = new Donor (101,18,60,"Healthy","B");
       Donor  donor1 = new Donor (301,18,60,"Healthy","B");
       Roster R = new Roster();
       R.addUser(user);
       R.addUser(user1);
       
      boolean ActualResult = R.deleteDonor(donor, donor.getId());
      assertFalse(ActualResult);  
    
    }
    
}
