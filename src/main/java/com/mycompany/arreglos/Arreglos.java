/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglos;
import java.util.Scanner;
        

public class Arreglos {

    public static void main(String[] args) {
        
        Scanner lectura= new Scanner(System.in);
         final int MAX=10;
          int multiplicacion=0,suma=0;
         int edades []= new int [MAX]; 
         for (int i=0;i<MAX;i++){
         System.out.println("\n ingrese edad"); //mensaje para el usuario
         edades[i]=lectura.nextInt();//puede almacenar sin ingresar ningun tamaño
         }
        // System.out.println("\n la suma de las edades es: ");
         //for (int i=0;i<MAX;i++){
           //  suma=suma+edades[i];
                   Scanner lect = new Scanner (System.in);
        final int M=5; 
        int sum=0;
        int edades2 []= new int [M];
        for (int i=0;i<M;i++){
            System.out.println("\n ingrese la segunda ronda de edades ");
            edades2[i]=lect.nextInt();//PUEDE ALMACENAR SIN INGRESAR NINGUN TAMAÑO
        }   
        for (int i=0;i<M;i++){
            multiplicacion=edades[i]*edades2[i];
           System.out.println("la multiplicaion es: "+multiplicacion);
           suma +=multiplicacion;
        }
                                 System.out.println("la suma es: "+suma);

        }
       // for (int i=0;i<M;i++){
         //    suma = suma+multiplicacion;
                   //  }
        //System.out.println("la suma de las edades es: "+suma);
    }

  
             
         
      
    

