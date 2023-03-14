package ejercicios;

public class ej6_1 {
    public static void main(String[] args) {
 /*
 String[] array_string=new String[25];
 System.out.println(array_string[3].length());
 */
 /*
 String aux = "hola";
 int aux2 = Integer.parseInt (aux);
 */
            System.out.println("Inicio del programa");
            try{
                String ex1="Hola caracola";
                int ex2=30;
                System.out.println("Caracter: "+caracterEn(ex1,ex2));
            }catch (StringIndexOutOfBoundsException ser){
                ser.printStackTrace();
                ser.getMessage();
            }finally {
                System.out.println("FIN DE LA EJECUCIÓN DEL PROGRAMA");
            }
        }
        public static char caracterEn(String a,int b){
            if (b<0&&b>a.length()){
                throw new StringIndexOutOfBoundsException("Fuera de la cadena");
            }else
                return a.charAt(b);
    }
}
