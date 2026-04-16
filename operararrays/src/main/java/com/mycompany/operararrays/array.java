/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operararrays;

/**
 *
 * @author admin
 */
public class array {
    
    public int[] rellenaArrays(int[] array){
            for (int i = 0; i < array.length; i++) {
                array[i]=(int)(Math.random()*19)+1;
            }
            
            return array;
    
        }


        public void imprimirarray() {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
