package lab3ejercicio8;
import java.util.Scanner;

public class Lab3ejercicio8 {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Ingrese el valor de a: ");
        a = scan.nextInt();
        System.out.println("Ingrese el valor de b: ");
        b = scan.nextInt();
        System.out.println("Ingrese el valor de c: ");
        c = scan.nextInt();
System.out.println("Para la forma: ax^2 + bx + c = 0");

        


double b2 = Math.pow(b, 2);
        
double o1;
        
double m4ac, result, result2, multi;
        
m4ac = (4 * a * c);
        
o1 = b2 - m4ac;

        double resultado = Math.sqrt(o1);
        System.out.println("La raiz es: " + resultado);
        multi = a * 2;
        result = (-(b) + (resultado)) / multi;

        System.out.println("El valor para q1 es:  " + result);
        result2 = (-(b) - (resultado)) / multi;
        System.out.println("El valor para q2 es:  " + result2);
    }

}
