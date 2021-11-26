/*
 Este programa genera presenta el resultado de
 4 elevado a la potencia 3
 Donde número = 4 y potencia es 3

 Agregar los cambios necesarios para que tanto número y potencia sean ingresados
 por teclador por el usuario.
 */
package ejemplos02;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int numero;
        int potencia;
        int resultado;
        resultado = 1;
        int contador = 1;
        
        
        System.out.println("Ingrese el numero");
        numero = entrada.nextInt();
        
        System.out.println("Ingrese la potencia");
        potencia = entrada.nextInt();
        do {
            resultado = resultado * numero;
            contador = contador + 1;
        } while (contador <= potencia);

        System.out.printf("%d\n", resultado);
    }
}
