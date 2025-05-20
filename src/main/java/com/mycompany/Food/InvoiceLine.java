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
public class InvoiceLine { 
    String code;
    String name;
    int price;
    int totalpriceLine;
    int quantity;
    
    public InvoiceLine(String c, String n, int p,int q){
        code=c;
        name=n;
        price=p;
        quantity=q;
        totalpriceLine=quantity*price;
    }
    public void printInfo(){
        System.out.printf("|%40s|%40s|%10d|%10d|%30d|\n",
                code,name,price,quantity,totalpriceLine
                );
    }
    
    
    
    
}
