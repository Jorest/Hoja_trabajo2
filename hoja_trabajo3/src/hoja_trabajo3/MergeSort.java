/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja_trabajo3;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Irene
 */
public class MergeSort {

//area de datos
  ArrayList<Integer> dato1 = new ArrayList<Integer>(200);
  ArrayList<Integer> dato2 = new ArrayList<Integer>(200);
  ArrayList<Integer> dato3 = new ArrayList<Integer>(200);
   
    //funcion que mezcla 2 cadeas y las ordena
    //entradas 2 ArrayList
    //Salida:Cadena ordenada
    
    public ArrayList<Integer> Merge(ArrayList<Integer> data1,ArrayList<Integer> data2) 

    {
       ArrayList<Integer> data3 = new ArrayList<Integer>(data1.size()+data2.size());
       Integer a;
       Integer b;
       Integer cont=0;
       Integer conta=0;
       Integer contb=0;
 
       
       for(int i=0;i==data3.size();i++)
       {
           a=data1.get(conta);
           b=data2.get(contb);
           if (a<=b){
            data3.set(cont,a);
            conta++;
                    }
           else{
            data3.set(cont,a);
            contb++;
               }
           cont++;
       }
     return data3;   
    }
        
    public void mergeSort(ArrayList<Integer> data1){
        
        dato3=Merge(dato1,dato2);
    }
}










