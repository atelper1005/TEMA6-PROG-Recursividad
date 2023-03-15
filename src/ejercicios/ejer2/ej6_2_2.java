package Ejercicios;

public class ej6_2_2 {
    public static void main(String[] args) {
        int n=5;
        System.out.println("La suma de los numeros naturales es = "+sumaNumerosNaturales(n));
    }
    private static int sumaNumerosNaturales(int n){
        if(n==1){
            return 1;
        }else
            return n+(sumaNumerosNaturales(n-1));
    }
}
