/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Food;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MainClass {
    public static void main(String[] args){
        /*user customer*/
        ///////////HELP nhelp=new HELP(); NO CUN
        HELP[]  needhelp = new HELP[1];
        needhelp[0]=new HELP(true);
        Customer [] customArray= new Customer[10];
        customArray[0]=new Customer("sara","sarah23","ahmadi", true);
        customArray[1]=new Customer("ali","alik900","kazemi",false);
        customArray[2]= new Customer("mahshad","mah237","sharifi",true);
        customArray[3]= new Customer("arman","AR20AK","akbari",false);
        customArray[4]= new Customer ("kimia","km555","sare", true);
        customArray[5]= new Customer ("maryam","mrm","atefi", true);
        customArray[6]= new Customer ("hossein","hos100","khorami", false);
        customArray[7]=new Customer("mohamad","m666","mousavi",false);
        customArray[8]=new Customer ("fateme","fate24","rahaea",true);
        int cscounter=9;
        /*user customer*/
        /*user clients*/
        Client [] ClientArray= new Client[3];
        ClientArray[0]=new Client("marii","mar100","maryam",true);
        ClientArray[1]=new Client("mmd","mmd100","mohammad",false);
        ClientArray[2]=new Client("fate","fate100","fatemeh",true);
        int clcounter=3;
        /*user clients*/
        /*item lists*/
         Item[] itemList= new Item[40];
         itemList[0]= new Item("vsdvs","pizza",67000,23);
         itemList[20]= new Item("sfssd","pizza",57000,40);
         itemList[1]=new Item("dhth","mohito",20000,47);
         itemList[21]=new Item("fjgfjy","mohito",25000,27);
         itemList[2]=new Item("sefs", "kebab", 58000, 20);
         itemList[22]=new Item("kafj", "kebab", 60000, 10);
         itemList[3] = new Item ("nfgj", "burger", 47000, 20);
         itemList[23] = new Item ("kake", "burger", 57000, 40);
         itemList[4]=new Item("fyjg", "pasta",57000,90);
         itemList[24]=new Item("keao", "pasta",47000,20);
         itemList[5]= new Item("trjt","soup",35000,47);
         itemList[25]= new Item("lsne","soup",30000,100);
         itemList[6]= new Item("sees","salad",33000,45);
         itemList[26]= new Item("ekks","salad",32000,43);
         itemList[7]= new Item("dfgh","chicken",60000,50);
         itemList[27]= new Item("rgks","chicken",65000,40);
         itemList[8]= new Item("pkop","french fries",23000,150);
         itemList[28]= new Item("iehr","french fries",20000,100);
         itemList[9]= new Item("0sgr","joje kebab",70000,358);
         itemList[29]= new Item("wgwr","joje kebab",50000,38);
         itemList[10]= new Item("ilhl","stake",99000,25);
         itemList[30]= new Item("rgrw","stake",90000,35);
         itemList[11]= new Item("jgyj","sperso",23000,30);
         itemList[31]= new Item("osur","sperso",20000,10);
         itemList[12]= new Item("0llo","latte",21000,74);
         itemList[32]= new Item("shcs","latte",21000,54);
         itemList[13]= new Item("0err","moka",20000,23);
         itemList[33]= new Item("skrj","moka",22000,33);
         itemList[14]= new Item("0kuy","hot chocklate",25000,22);
         itemList[34]= new Item("kajf","hot chocklate",24000,23);
         itemList[15]= new Item("ouio","ghorme",40000,70);
         itemList[35]= new Item("ldir","ghorme",41000,77);
         itemList[16]= new Item("riyu","gheime",43000,77);
         itemList[36]= new Item("skig","gheime",41000,70);
         itemList[17]= new Item("iopi","mahi",78000,30);
         itemList[37]= new Item("kdty","mahi",78000,20);
         itemList[18]= new Item("jhkk","lazania",65000,50);
         itemList[38]= new Item("dsht","lazania",68000,60);
         itemList[19]= new Item("sgfr","chocklate cake",32000,30);
         itemList[39]= new Item("ehdr","chocklate cake",31000,35);
         int itemCounter=40;
         /*item lists*/
        boolean ex = true ; 
        Scanner input= new Scanner(System.in);  
        System.out.println("WELCOME TO Resturant Reservation!");
        int karbari = 0 ;
        do{
        System.out.println("|  LOG-IN as user  | "); 
        System.out.println("press 1  as CUSTOMER\npress 2  as CLIENT ");       
        boolean isright=false;
        do{
        try{
        karbari =input.nextInt(); 
         isright=true;
        }catch(InputMismatchException e){
          System.out.println("enter a number not alphabet ");
          karbari=0;
            }}while(isright&&!(karbari==1||karbari==2||karbari==3||karbari==4||karbari==5||karbari==6||karbari==7||karbari==8||karbari==9||karbari==10));
         switch(karbari){
            //////////customer
            case 1:
        System.out.println("Please enter userName:");
        String n= input.nextLine();
        if(n.length()==0||n==null)
        n= input.nextLine();
        System.out.println("Please enter password:");
        String p= input.nextLine();
        if(p.length()==0||p==null)
        p= input.nextLine();
        int costumerNumber=-1;
        for(int i=0;i<cscounter;i++){
            if(customArray[i].login(n, p)==true)
                costumerNumber=i;
        }
        if(costumerNumber==-1)
            System.out.println("invalid user name & password");
        else
            System.out.println("Hello: "+customArray[costumerNumber].name);
           if(costumerNumber>=0){
           int operation=0;
           do{
            System.out.println("\n What do you want to do now:");
            System.out.println("1: check my profile");
            System.out.println("2: add a new address");
            System.out.println("3: see my previous invoice");
            System.out.println("4: see current invoices");
            System.out.println("5: add a new item to current invoice");
            System.out.println("6: search if partition available ");
            System.out.println("7: need help?");
            System.out.println("8: exit");
            try{
            operation= input.nextInt(); }catch(InputMismatchException e){
                      System.out.println("enter valid number");
                      operation=8;
  }
            switch(operation){
                case 1:
                    customArray[costumerNumber].printProfile();
                    break;
                case 2: 
                    System.out.println("Please enter your new address:");
                    String tmpaddress= input.nextLine();
                    if(tmpaddress==null||tmpaddress.length()==0)
                        tmpaddress=input.nextLine();
                    customArray[costumerNumber].addAddress(tmpaddress);
                    break;
                case 3:
                    customArray[costumerNumber].printInvoiceList(itemList);
                    break;
                case 4: 
                    customArray[costumerNumber].currentinvoice.printInfo();
                    break;
                case 5:
                    itemList[0].printListInfo(itemList, itemCounter);
                    System.out.println("Which item do you want:");
                    int itemNumber=input.nextInt();
                    if(itemNumber<0||itemNumber>40){
                    System.out.println("not valid");
                    break;
                    }
                    System.out.println("quantity:");
                    int quantity=input.nextInt();
                    String c= itemList[itemNumber].code;
                    String tmpn= itemList[itemNumber].name;
                    int tmpP= itemList[itemNumber].price;
                    if(quantity<=itemList[itemNumber].mojoodi){
                    customArray[costumerNumber].currentinvoice.addItemToinvoice(c, tmpn,tmpP,quantity);
                    itemList[itemNumber].mojoodi -=quantity;
                   customArray[costumerNumber].invoiceCounter=itemNumber;
                    }
                    else 
                        System.out.println(" not enough number");
                    break;
                case 6:
               System.out.println("enter categuary:");
               String ct=input.nextLine();
              if(ct.length()==0||ct==null)
               ct= input.nextLine();
                System.out.println("search result:");
                boolean found=true;
                for(int i=0;i< itemList.length;i++) {
                if(itemList[i].name.equalsIgnoreCase(ct)){
                  itemList[i].printInfo();
                  found = false;
                }
                      }
                if(found)  
                System.out.printf("\nthere is no %s\n",ct);
                    break;
                case 7:
                       needhelp[0].HELPCS();  
                    break;
                case 8:
                    break;
                
                default:
                    System.out.println("invalid operation");
                    break;
           }
            
           }while(operation!=8);
        }
                break;
            case 2 :
       //////client
        System.out.println("Please enter userName:");
        n= input.nextLine();
        if(n.length()==0||n==null)
        n= input.nextLine();
        System.out.println("Please enter password:");
         p= input.nextLine();
        if(p.length()==0||p==null)
        p= input.nextLine();
        int clientNumber=-1;
        for(int i=0;i<clcounter;i++){
            if(ClientArray[i].login(n, p)==true)
                clientNumber=i;
        }
        if(clientNumber==-1)
            System.out.println("invalid user name & password");
        else
            System.out.println("Hello: "+ClientArray[clientNumber].name);
           if(clientNumber>=0){
           int operation=0;
           do{
            System.out.println("\n What do you want to do now:");
            System.out.println("1: check my profile");
            System.out.println("2: view customers");
            System.out.println("3: view co-workers(client list)");
            System.out.println("4: view available items");
            System.out.println("5: add quantity to items");
            System.out.println("6: search if partition available ");
            System.out.println("7: need help?");
            System.out.println("8: exit");
                       try{
            operation= input.nextInt(); }catch(InputMismatchException e){
                      System.out.println("enter valid number");
                      operation=8;
  }
            switch(operation){
                case 1:
                    ClientArray[clientNumber].printProfile();
                    break;
                case 2: 
                  customArray[0].printarraypro(customArray,cscounter);
                    break;
                case 3:
                   ClientArray[0].printarraypro(ClientArray,clcounter);

                    break;
                case 4: 
                    itemList[0].printListInfo(itemList, itemCounter);

                    break;
                case 5:
                    itemList[0].printListInfo(itemList, itemCounter);
                    System.out.println("Which item do you want to be added:");
                    int itemNumber=input.nextInt();
                    if(itemNumber<0||itemNumber>40){
                    System.out.println("not valid");
                    break;
                    }
                    System.out.println("quantity:");
                    int quantity=input.nextInt();
                    if(quantity>0)
                        itemList[itemNumber].mojoodi +=quantity;
                    else 
                        System.out.println(" not valid ");
                    break;
                case 6:
               System.out.println("enter categuary:");
               String ct=input.nextLine();
              if(ct.length()==0||ct==null)
               ct= input.nextLine();
                System.out.println("search result:");
                boolean found=true;
                for(int i=0;i< itemList.length;i++) {
                if(itemList[i].name.equalsIgnoreCase(ct)){
                  itemList[i].printInfo();
                  found = false;
                }
                      }
                if(found)  
                System.out.printf("\nthere is no %s\n",ct);
                    break;
                 case 7:
                   needhelp[0].HELPCL(); 
                    break;
                 case 8:
                    break;                
                default:
                    System.out.println("invalid operation");
                    break;
           }
            
           }while(operation!=8);
        }
        
                break;
            default: 
           //////////////def     
             System.out.println("press exit if want to quiet");
             String anykey=input.nextLine();
             if(anykey==null||anykey.length()==0)
             anykey=input.nextLine();
             if(anykey.equalsIgnoreCase("exit"))
             ex=false;
             break;
        }}while(ex);

         
         
    }

       
    
}
