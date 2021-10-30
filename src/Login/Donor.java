package Login;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.*;
public class Donor 
{
   
    private int Id;
    private int age;
    private int weight;
    private String medical_condition;
    private String blood_group;
    

    
    public Donor(int Id, int age, int weight, String medical_condition, String blood_group  ) {
       
        this.Id=Id;
        this.age = age;
        this.weight = weight;
        this.medical_condition = medical_condition;
        this.blood_group = blood_group;
        
    }

    public Donor(int Id){
        
        this.Id=Id;
    }
    
    public int getId() {
        return Id;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMedical_condition() {
        return medical_condition;
    }

    public void setMedical_condition(String medical_condition) {
        this.medical_condition = medical_condition;
    }

    public String getBlood_group() {
        return blood_group;
    }

    public void setBlood_group(String blood_group) {
        this.blood_group = blood_group;
    }
    
    
    
    
}
