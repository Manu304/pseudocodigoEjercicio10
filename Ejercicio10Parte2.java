import java.util.Scanner;

//202030799 Manuel Rojas
//Se leen desde teclado n�meros hasta que la suma de los mismos llegue a 1000. Mientras tanto debe hallar:
//a. La cantidad de n�meros m�ltiplos de 6.
//b. La suma de los n�meros que se encuentran entre el 1 y el 10 (incluidos).
public class Ejercicio10Parte2 {
    public static void main(String[] args) {
        int multiplo6 = 0, suma110 = 0, suma = 0;
        while (suma < 1000) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese un numero: ");
            int num = scanner.nextInt();
            suma += num;

            if ((num%6) == 0) {
                multiplo6++;
            }
            if ((num >= 1) && (num <= 10)) {
                suma110 += num;
            }
        }

        System.out.println("De los numeros ingresados: " +  multiplo6 +  " son multiplos de 6. Y La suma de los numeros que se encuentran entre el 1 y el 10 es: " +  suma110);
    }
}