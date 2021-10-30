package Login;
import java.util.ArrayList;

public class bloodbag
{
     private int bagID;        //ID number of the BAG
     private String CDate;        // Collection date 
     private String ExpDate;      // Expiry Date 

    // constructor to initialize the data members depending on the parameters that are passed to the method
    public bloodbag(int bagID, String CDate, String ExpDate) {
        this.bagID = bagID;
        this.CDate = CDate;
        this.ExpDate = ExpDate;
        
    }
    
    // default constructor to initialize the data members to default values
    public bloodbag() {
        bagID=0;
        CDate="";
        ExpDate="";
       
    }
    // method to return Id number of the student
    public int getbagID() {
        return bagID;
    }

    // method to set Id number of the student
    public void setbagID(int bagID) {
        this.bagID = bagID;
    }
    
     public void setCDate(String CDate) {
        this.CDate = CDate;
    }
     
     public String getCDate() {
        return CDate;
    }
     
    // method to return first name  of the student
    public String getExpDate() {
        return ExpDate;
    }

    // method to set first name  of the student
    public void setExpDate(String ExpDate) {
        this.ExpDate = ExpDate;
    }

   
  
     

   
}












