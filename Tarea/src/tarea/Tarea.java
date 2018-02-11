/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author Daniel
 */
public class Tarea {

    /**
     * 
     * @param n Número al que se le aplicará el factorial (!)
     * @return El número de dígitos que tiene n!
     */
    public static long calcula(int n) {
        double res=0;
        
        for (int i = 1; i <= n; i++)
            res=res+Math.log10(i);
        
        return (long)(Math.floor(res))+1;
    }
    
    public static void main(String...argv) {
        assertTrue(Tarea.calcula(1)==1);
        assertTrue(Tarea.calcula(2)==1);
        assertTrue(Tarea.calcula(3)==1);
        assertTrue(Tarea.calcula(4)==2);
        assertTrue(Tarea.calcula(5)==3);
        assertTrue(Tarea.calcula(6)==3);
        assertTrue(Tarea.calcula(7)==4);
        assertTrue(Tarea.calcula(8)==5);
        assertTrue(Tarea.calcula(9)==6);
        assertTrue(Tarea.calcula(10)==7);
        assertTrue(Tarea.calcula(11)==8);
        assertTrue(Tarea.calcula(12)==9);
        assertTrue(Tarea.calcula(13)==10);
        assertTrue(Tarea.calcula(14)==11);
        assertTrue(Tarea.calcula(15)==13);
        
        assertTrue(Tarea.calcula(50)==65);
        assertTrue(Tarea.calcula(60)==82);
        assertTrue(Tarea.calcula(70)==101);
        assertTrue(Tarea.calcula(80)==119);
        assertTrue(Tarea.calcula(90)==139);
        assertTrue(Tarea.calcula(100)==158);
        
        assertTrue(Tarea.calcula(500)==1135);
        assertTrue(Tarea.calcula(1000)==2568);
        
        assertTrue(Tarea.calcula(2000)==5736);
        assertTrue(Tarea.calcula(4000)==12674);
        assertTrue(Tarea.calcula(8000)==27753);
        assertTrue(Tarea.calcula(10000)==35660);
        
        assertTrue(Tarea.calcula(20000)==77338);
        assertTrue(Tarea.calcula(50000)==213237);
        assertTrue(Tarea.calcula(100000)==456574);
   }
    
    public static void assertTrue(boolean expression) {
        if(!expression) {
            System.out.println("Error. No se verificó la expresión evaluada !!!");
        }
    }

}