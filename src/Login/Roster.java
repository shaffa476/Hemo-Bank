package Login;
import java.util.*;
import java.util.regex.Pattern;
import java.util.ArrayList;
public class Roster {
    /**
     *This class has following data members.
     */
    private LinkedList<Register> user_DonorList; 
    
     ArrayList<String> list_details = new ArrayList<String>();
     ArrayList<String> user_list_blood_bag_details = new ArrayList<String>();
    
    private int size;

     public Roster() 
   {
        
        
        user_DonorList= new LinkedList<>();
        size=0;
    
           
    } 
    
    public int listSize() {return size;}
    
   
    /* Search donor by ID -- change it to blood Group search*/
    public int searchUser(int Id) 
    {
        for(int i=0;i<size;i++) 
        {
            if(user_DonorList.get(i).getId()==Id) 
            {
                return i;
            }
        }
        return -1 ;
        
    } 
    
     private int searchDonor(int Id) 
    {
        for(int i=0;i<size;i++) 
        {
            if(user_DonorList.get(i).getId()==Id) 
            {
                return i;
            }
        }
        return -1 ;
    }
     
    public boolean addUser(Register r) 
    {
        int id = r.getId();
        if(searchDonor(id) != -1) {
            System.out.println("User already exists.");
            return false;
        }
      
   // end method validateLastName
        String email= r.getEmailId();
        boolean b1 = Pattern.matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b" , email); 
        if(b1 == false){
            System.out.println("Invalid Email ! please try valid email syntax only .");
            return false;
        }
        
        String fname= r.getFirstName();
        boolean b2 = Pattern.matches("[a-zA-z]+([ '-][a-zA-Z]+)*" , fname); 
        if(b2 == false){
             System.out.println("Invalid Name !please try alphabets only .");
             return false;
             
        }
        
        String lname= r.getLastName();
        boolean b3 = Pattern.matches("[a-zA-z]+([ '-][a-zA-Z]+)*" , lname); 
        if(b3 == false){
          System.out.println("Invalid Name !please try alphabets only .");
          return false;
        }
        
        String userName=  r.getUserName();
        boolean b4 = Pattern.matches("^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$" , userName); 
        if(b4 == false) {
         System.out.println("Invalid Username !please try atleast 6 digits .");
         return false;
        }
        
        String password=  r.getPassword();
        boolean b5 = Pattern.matches("^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$" , password); 
        if(b5 == false) {
         System.out.println("Invalid Password ! please try atleast 6 digits .");
         return false;
        }
        
        user_DonorList.add(r);
        size++;
        return true;
    }
    public boolean addDonor(Donor d , int Id)
    {
        int index=searchDonor(Id);
        
        if(index==-1) 
        {
            System.out.println("User doesn't exist.");
            return false;
        }
        
        Register user = user_DonorList.get(index);
       
        for(int i=0;i<user.getDonors_registered().size();i++) {
            if(user.getDonors_registered().get(i).getId()==(d.getId())) 
            {
                System.out.println("Donor already exists.");
                return false;
            }
            
        }
        
        if((d.getAge() < 18 ) || (!(d.getMedical_condition().equalsIgnoreCase("Healthy")))) 
             {    
                   System.out.println(" Not Suitable for Blood Donation  ");
                   return false;
             }
        
           String bloodtype= d.getBlood_group();
           boolean b7 = Pattern.matches("^(A|B|AB|0)(\\+|-)$" , bloodtype); 
            
            if(b7 == false) {
               System.out.println("Invalid Blood Group");
               return false;
           }
        user_DonorList.get(index).getDonors_registered().add(d);
        System.out.println("Donor added successfully.");
        return true;
  }
  
   
    public boolean deleteDonor(Donor d,int Id) 
    {
        int index=searchDonor(Id);
        boolean found = false;
        if(index==-1) 
        {
            System.out.println("User doesn't exist.");
            return false;
        }
        
         Register user = user_DonorList.get(index);
       
        for(int i=0;i<user.getDonors_registered().size();i++) {
            if(user.getDonors_registered().get(i).getId()==(d.getId())) 
            {
                found = true;
                user_DonorList.get(index).getDonors_registered().remove(i);
                System.out.println("Donor Deleted Successfully");
                return true;
            }
            
        }
      if(!found)
      {  
         System.out.println("Donor ID"+ d.getId()+"\n"+"index"+index);
        System.out.println("Donor doesn't exist.");
        return false;
      }
      return true;
    }
    
    
    public boolean add_blood_bag_info(Donor D , int Id , bloodbag B){ 
        
        int index=searchDonor(Id);
        if(index==-1)
        {
            System.out.println("User doesn't exist.");
            return false;
        }
        else
        {
           
           list_details.add(String.valueOf(D.getId()));
            String bloodtype= D.getBlood_group();
            boolean b6 = Pattern.matches("^(A|B|AB|0)(\\+|-)$" , bloodtype); 
            if(b6 == false) {
               System.out.println("Invalid Blood Group");
               return false;
           }
           list_details.add(D.getBlood_group());
           list_details.add(B.getCDate());
           list_details.add(B.getExpDate());  
         
        }
       
        System.out.println(list_details);  // Will invoke overrided `toString()` method

        return true;
     
    }

    
   
}
    


