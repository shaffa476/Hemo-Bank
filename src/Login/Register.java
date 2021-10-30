package Login;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Register{
    /* Variables */
    private int Id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String emailId;
    private long   phoneNo;
    private ArrayList<Donor> donors_registered ;
     
    /* Constructor*/
    Register(Integer Id,String firstName, String lastName, String userName, String password, String emailId, long phoneNo) {
        this.Id=Id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.emailId = emailId;
        this.phoneNo = phoneNo;
        donors_registered = new ArrayList<>();
    }
    /* Default Constructor*/
    Register(){
        this(0,"Empty","empty","empty","empty","empty",00000000);
    }

    /* set and get*/
    
    public ArrayList<Donor> getDonors_registered(){
     return donors_registered;
    }
     public void getDonors_registered(ArrayList<Donor> d) {
        donors_registered=d;
    }
    public Integer getId() {
        return Id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public long getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
    @Override
    public String toString() {
        return "Register [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", password=" +
            password + ", emailId=" + emailId + ", phoneNo=" + phoneNo + "]";
    }

    
        
    /* Compare two users */
    public boolean equals(Register user) {
        return (Id==user.Id);
    }
    
     public void printDonor_Details( ) {
        for (int i = 0; i < donors_registered.size(); i++){
            if (donors_registered.get(i)!=null)
            {
                System.out.println((i+1) +" User_ID : " + getId() + ", Age : " + donors_registered.get(i).getAge() + ", Weight : "
                + donors_registered.get(i).getWeight() + ", Medical_Condition: " + donors_registered.get(i).getMedical_condition()  +
                ", Blood_Group : " + donors_registered.get(i).getBlood_group() );
            }
        }
        
        
     
     
     
     }

}

   