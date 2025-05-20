/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Food;

/**
 *
 * @author ASUS
 */
public class Client {
    String username; 
    String password; 
    String name;
    boolean sex; //true: female false:male
    
    public Client(String tmpuser, String tmpPass,String tmpName, boolean se){
        username=tmpuser;
        password=tmpPass;
        name=tmpName;
        sex=se;
    }
    
    public boolean login(String u , String p){
        boolean isValid=false;
        if(username.equals(u)&&password.equals(p))
            isValid=true;
        return isValid;            
    }
    public int login(String n , String p, Client[] clArray){
        int clnumber=-1;
        for(int i=0;i<clArray.length;i++){
            if(clArray[i].login(n, p)==true)
                clnumber=i;
        }
        return clnumber;
    }
    
    public void printProfile(){
        System.out.printf("%15s:%30s\n","name",name);
        if(sex==false)
            System.out.printf("%15s:%30s\n","sex","Male");
        else
            System.out.printf("%15s:%30s\n","sex","Female");
                            
    }
        public void printarraypro(Client[] cl ,int counter){
        for(int i=0;i<counter;i++){
            System.out.printf("%d|",i);
           cl[i].printProfile();
       } 
    }

}
