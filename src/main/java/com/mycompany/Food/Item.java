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
public class Item {
    String code;
    String name;
    int mojoodi;
    int price;
    public Item(String c,String n, int p, int m){
        code=c;
        name=n;
        price=p;
        mojoodi=m;
    }
    public void printInfo(){
        System.out.printf("|%30S|%30s|%10d|%10d|\n",code,name,price,mojoodi);
    }
     public void printInfo2(){
        System.out.printf("|%30S|%30s|%10d|\n",code,name,price);
    }
    public void printListInfo(Item[] itemlist,int counter){
       System.out.printf("|%30S|%30s|%10s|%10s|\n","code","name","price","mojoodi");
        for(int i=0;i<counter;i++){
            System.out.printf("%4d|",i);
           itemlist[i].printInfo();
       } 
    }


        
}
