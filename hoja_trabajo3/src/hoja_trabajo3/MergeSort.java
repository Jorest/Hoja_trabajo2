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
    


 
 
    //funcion que mezcla 2 cadeas y las ordena
    //entradas 2 ArrayList
    //Salida:Cadena ordenada
    
    public MergeSort(){
    
}
    public ArrayList<Integer> Merge(ArrayList<Integer> data1,ArrayList<Integer> data2) 

    {
       ArrayList<Integer> data3 = new ArrayList<Integer>(data1.size()+data2.size());
       Integer a;
       Integer b;
       Integer cont=0;
       Integer conta=0;
       Integer contb=0;
 
       
       for(int i=0;i==data3.size()-1;i++)
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
        
    public ArrayList<Integer> mergeSort(ArrayList<Integer> data1){
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        float tamano=((data1.size()/2));
        int tamano1=  Math.round (tamano);
        int tamano2=  (int)tamano - tamano1;
       
        ArrayList<Integer> temp1 = new ArrayList<Integer>(tamano1);
        ArrayList<Integer> temp2 = new ArrayList<Integer>(tamano2);
        if (data1.size()==1) {
            result=data1;
        }
        else{
            for(int i=0;i==tamano1-1;i++){
                temp1.set(i,data1.get(i));
            }
              for(int i=0;i==tamano2-1;i++){
                temp2.set(i,data1.get(i));
            }
              
            
            
        }
        result=Merge(mergeSort(temp1),mergeSort(temp1));
        return result;
    }
}










