package ejercicios.ejer2;

public class ej6_2_1 {
    public static void main(String[] args) {
        int x=5;
        System.out.print("Para "+x+"= ");
        ejer1(x);
        System.out.println();
    }
    public static void ejer1(int x){
        if(x>1) {
            System.out.print(x+",");
            ejer1(x - 1);
        }else
            System.out.print(x);
    }
}
