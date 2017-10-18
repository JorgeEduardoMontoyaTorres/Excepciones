import com.sun.java.util.jar.pack.Package;

import java.io.FileNotFoundException;
import java.util.*; //Comodin, Pone todas las clases del paquete.

public class EjemploExcepciones
{
    public static void main(String[] arg) {
        try
        {
            File archivo = new("Entrada.txt");
            Scanner teclado = new Scanner(archivo);
            Scanner teclado = new Scanner(System.in);
            System.out.println("Dame el primer numero: ");
            int num1 = teclado.nextInt();
            System.out.println("Dame el segundo numero: ");
            int num2 = teclado.nextInt();
            System.out.println("La division es: " + num1 / num2);

            //Correr el programa y probarlo con diferentes valores
            // ¿Que ocurre con las excepciones?
        }
        catch (ArithmeticException excepcionAritmetica) {
            System.out.println("Division por cero");
        }
        catch (InputMismatchException excepcionEntrada) {
            System.out.println("Entrada incorrecta");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("No existe el archivo");
        }
    }
}