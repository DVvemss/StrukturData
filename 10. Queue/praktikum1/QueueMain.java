/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.stukturdata.minggu10.praktikum1;

import java.util.Scanner;

/**
 *
 * @author DVvemsss
 */
public class QueueMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int choose;
        
        System.out.print("Masukan kapasitas Queue : ");
        int n = sc.nextInt();
        
        Queue Q = new Queue(n);
        
        
        do {
            menu();
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("Masukan data baru : ");
                    int dataIn = sc.nextInt();
                    Q.Enqueue(dataIn);
                    break;
                case 2:
                    int dataOut = Q.Dequeue();
                    if (dataOut != 0) {
                        System.out.print("Data yang dikeluarkan : " + dataOut);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                default:
                    throw new AssertionError();
            }
  
        } while (choose ==1 || choose == 2 || choose == 3 || choose == 4 || choose == 5);
    }
    
    public static void menu() {
        System.out.println("Masukan operasi yang diinginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("----------------");
    }
    
}
