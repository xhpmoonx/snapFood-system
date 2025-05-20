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
public class Invoice {
    int totalPrice;
    boolean Buystatues;
    InvoiceLine[] lines;
    int Linecounter;
    String address;

    public Invoice() {
        totalPrice = 0;
        lines = new InvoiceLine[100];
        address = "default";
        Linecounter =0;
        Buystatues = false;
    }
        public void addItemToinvoice(String code, String name, int p, int q) {
        lines[Linecounter]
                = new InvoiceLine(code, name, p, q);
        Linecounter++;
    }

    
    public void caltotalalPrice() {
        totalPrice=0;
        for (int i = 0; i < Linecounter; i++) {
            totalPrice =totalPrice+ lines[i].totalpriceLine;
        }
    }

    public void printInfo() {
        if (Linecounter > 0) {
            System.out.printf("address|%100s\n", address);
            for (int i = 0; i < 100; i++) {
                System.out.print("-");
            }
            System.out.printf("\n|%40s|%40s|%10s|%10s|%30s|\n",
                    "code", "name", "price", "quantity", "totallinePrice");
            for (int i = 0; i < Linecounter; i++) {
                lines[i].printInfo();
            }
            for (int i = 0; i < 100; i++) {
                System.out.print("-");
            }
            System.out.printf("\ntotalPrice|%20s\n", totalPrice);
        } else {
            System.out.println("Empty invoice");
        }
    }



}
