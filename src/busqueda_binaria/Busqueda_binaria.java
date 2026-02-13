package busqueda_binaria;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Busqueda_binaria {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int [] array = new int [50];
		
		for (int i = 0; i < array.length;) {
		    boolean repetido = false;
		    array[i] = rand.nextInt(200);
		    for (int j = 0; j < i; j++) {
		        if (array[i] == array[j]) {
		            repetido = true;	            
		        }
		    }
		    if (!repetido) i++;
		}
		
		Arrays.sort(array);
		
		System.out.println("Introduce un número, entre el 0 y el 200: ");
		int numero = sc.nextInt();
		
		int inicio = 0;
		int fin = array.length - 1;
		boolean posicionEncontrada = false; 
		int mitad = 0;
		
		while (inicio <= fin && !posicionEncontrada) {
		    mitad = inicio + (fin - inicio) / 2;
		    if (array[mitad] == numero) {
		        posicionEncontrada = true;
		    }
		    if (numero < array[mitad]) {
		        fin = mitad - 1;
		    } else {
		        inicio = mitad + 1;
		    }
		}
		
		if (posicionEncontrada) {
		    System.out.println("El número " + numero + " se encuentra en la posición " + mitad);
		} else {
		    System.out.println("El número no está en el array");
		}
		sc.close();
	}
}
