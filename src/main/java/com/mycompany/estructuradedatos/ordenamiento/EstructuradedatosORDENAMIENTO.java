/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estructuradedatos.ordenamiento;

/**
 *
 * @author 1004580979
 */
public class EstructuradedatosORDENAMIENTO {

    public static void main(String[] args) {
int [] numeros={8,10,6,2,4};
for (int i=0;i<numeros.length-1;i++){
    for (int j=0;j<numeros.length-i-1;j++){
        if (numeros[j]>numeros[j+1]){
            //intercambia elementos
            int temp=numeros[j];
            numeros[j]=numeros[j+1];
            numeros[j+1]=temp;
        }
    }
}
        System.out.println("arreglo ordenado: ");
        for (int numero:numeros){
            System.out.println(numero+" ");
        }
    }
}
