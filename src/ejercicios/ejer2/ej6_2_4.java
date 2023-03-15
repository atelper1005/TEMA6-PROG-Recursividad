package Ejercicios;

public class ej6_2_4 {
    public static void main(String[] args) {
        int x=5;
        int y=10;
        System.out.println(euclidea(x,y));
    }
    public static int euclidea(int x, int y){
        if (y==0){
            return y;
        }else
            return euclidea(y,x%y);
    }
}