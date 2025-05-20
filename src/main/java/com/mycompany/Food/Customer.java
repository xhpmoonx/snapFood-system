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
public class Customer {
    String username; 
    String password; 
    String name;
    boolean sex; //true: female false:male
    String[] listOfadress;
    int addressCounter;
    Invoice[] invoicelist;
    int invoiceCounter;
    Invoice currentinvoice;
    public Customer(String tmpu, String tmpP,String tmpN, boolean s){
        addressCounter=0;
        invoiceCounter=0;
        username=tmpu;
        password=tmpP;
        name=tmpN;
        sex=s;
        listOfadress= new String[20];
        invoicelist= new Invoice[50];
        currentinvoice= new Invoice();
    }

    public boolean login(String u , String p){
        boolean isValid=false;
        if(username.equals(u)&&password.equals(p))
            isValid=true;
        return isValid;            
    }
    public int login(String n , String p, Customer[] costumArray){
        int costumerNumber=-1;
        for(int i=0;i<costumArray.length;i++){
            if(costumArray[i].login(n, p)==true)
                costumerNumber=i;
        }
        return costumerNumber;
    }
    
    public void printProfile(){
        System.out.printf("%15s:%30s\n","name",name);
        if(sex==false)
            System.out.printf("%15s:%30s\n","sex","Male");
        else
            System.out.printf("%15s:%30s\n","sex","Female");
        
        for(int i=0;i<listOfadress.length;i++){
            if(listOfadress[i]!=null)
                System.out.printf("\n %10s%3d:%30s","address#\n",i,listOfadress[i]);
        }                            
    }
        public void printarraypro(Customer[] cs,int counter){
        for(int i=0;i<counter;i++){
            System.out.printf("%d|",i);
           cs[i].printProfile();
       } 
    }
    public void addAddress(String newAddress){
        listOfadress[addressCounter]= newAddress;
        addressCounter++;
        
    } 
    public void printInvoiceList(Item[] itemlist){
                    System.out.print(" You had ");

        if(invoiceCounter==0)
            System.out.println("no invoice till now\n");
        else{
            System.out.println("");
             itemlist[invoiceCounter].printInfo2();}

    }
    
}
