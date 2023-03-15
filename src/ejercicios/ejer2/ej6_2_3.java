package Ejercicios;

public class ej6_2_3 {
    public static void main(String[] args) {
        int x=5;
        System.out.println(fibonnaci(x));
    }
    public static int fibonnaci (int x){
        if((x==0) || (x==1)){
            return 1;
        }else
            return fibonnaci(x-1)+fibonnaci(x-2);
    }
}
