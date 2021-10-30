package Login;
import java.util.*;

public class main_call {
   public static void main (String [] args) {
        Scanner kb=new Scanner(System.in);
        Roster R =new Roster();
        Register u = null;
        Donor    d = null;
        while(true) {
            System.out.println("Enter A to Add User");
            System.out.println("Enter C to Add Donor");
            System.out.println("Enter D to Delete Donor");
            System.out.println("Enter F to Exit");
            System.out.println("Enter P to Print Donor Details");
            System.out.println("Enter B to View Blood Bags");
            
            String code = kb.next().toUpperCase();
            char c = code.charAt(0);
            
            switch(c){
                case 'A' :
                    System.out.println("Enter  ID: ");
                    int id =kb.nextInt();
                    System.out.println("Enter  First Name:");
                    String FN =kb.next();
                    System.out.println("Enter  Last Name: ");
                    String LN =kb.next();
                    System.out.println("Enter username: ");
                    String UN =kb.next();
                 
                    System.out.println("Enter password: ");
                    String PS=kb.next();
                    
                    System.out.println("Enter EMAIL: ");
                    String E=kb.next();
                    
                    System.out.println("Enter Phone: ");
                    Long T= kb.nextLong();
                    
                    u = new Register(id,FN,LN,UN,PS,E,T);
                    
                    if(R.addUser(u))
                    
                      System.out.println("User added successfully");
                    else
                        System.out.println("Error. User couldn't be added.");
                    break;
                case 'C':
                    System.out.println("Enter Donor ID; -- user id");
                    int ID2=kb.nextInt();
                    System.out.println("Enter Age; ");
                    int a = kb.nextInt();
                    System.out.println("Enter weight; ");
                    int w = kb.nextInt();
                    System.out.println("Enter medical record; ");
                     String mr=kb.next();
                    System.out.println("Enter blood_group; ");
                    String bg=kb.next();
                    d=new Donor(ID2,a,w,mr,bg);// 
                    R.addDonor(d, ID2);
                    break;
                 case 'D':
                    System.out.println("Enter Donor ID; -- user id");
                    int ID3=kb.nextInt();
                    Donor D=new Donor(ID3);
                    R.deleteDonor(D, ID3);
                    break;
              case 'F':
                    System.exit(0);
                    break;
                case 'P':
                    u.printDonor_Details();
                    break;
                case 'B':
                    System.out.println("Enter User ID -- BagID");
                    int id4 = kb.nextInt();
                    System.out.println("Enter Expiry");
                    String exp = kb.next();
                    System.out.println("Enter Collected On");
                    String col = kb.next();
                    System.out.println("Blood Bag Information:");
                    
                    bloodbag b1= new bloodbag(id4,exp,col);
                    
                    R.add_blood_bag_info(d , id4 , b1);
                    
                    
                    break;
                default:
                    System.out.println("Invalid code.");
        }
  }

}
   
}
