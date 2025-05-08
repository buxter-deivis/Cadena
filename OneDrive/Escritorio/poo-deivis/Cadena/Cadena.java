import java.util.Scanner;
public class Cadena {
    public static void main (String [] args){
    Scanner scanner = new Scanner (System.in);
    System.out.println("Ingresa tu nombre(s) ");
    String nombre = scanner.nextLine();
    System.out.println("Ingresa tu apellido paterno" );
    String apellidopat = scanner.nextLine();
    System.out.println("Ingresa tu apellido materno " );
    String apellidomat = scanner.nextLine();
    System.out.println("Tu nombre completo es = " +nombre+"" +apellidopat+" "+apellidomat );

    }
}