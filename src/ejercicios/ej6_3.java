package Ejercicios;

import java.util.HashSet;
import java.util.Set;

public class ej6_3 {
    public static void main(String[] args) {

        /**
         * Ejercicio 1
         * Realiza un algoritmo que dado un conjunto de números, encuentre el número más grande.
         * */

        Set<Integer> ejer1Conjunto=new HashSet<>();
        ejer1Conjunto.add(15);
        ejer1Conjunto.add(35);
        ejer1Conjunto.add(6);
        ejer1Conjunto.add(2);
        ejer1Conjunto.add(29);
        ejer1Conjunto.add(12);
        ejer1Conjunto.add(8);


        metodoConjunto(ejer1Conjunto);

        // Intento de ejercicio 4
        int[] ejer4={1,2,5,3,4,6,9,7};
        misterioso(ejer4);
    }
    private static void metodoConjunto(Set<Integer> a){
        Integer mayor=0;
        for (Integer e:
                a) {
            if(e>mayor){
                mayor=e;
            }
        }
        System.out.println("El número más grande es " + mayor);
    }
    private static void misterioso(int[] array){
        for (int i = 0; i < array.length; i++) {
            int indiceMenor=i;
            for (int j = i+1; j < array.length ; j++) {
                if (array[j]< array[indiceMenor]){
                    indiceMenor=j;
                }
            }
            int temp=array[i];
            array[i] = array[indiceMenor];
            array[indiceMenor]=temp;
        }
    }
}