/**
 * 
 */
package hilosycalculosparalelos;


/**
 * @author G 16 sept 2025
 */
public class Aeropuerto {
	
	private int counter = 0;

	
	public synchronized void increment() {
		//Incrementar el valor de la variable de counter por uno
		//Counter++ y este de abajo son los mismo pero escrito de manera diferente
		//Paso 1: leer el valor actual de la variable "counter, la mete en la memoria
		//Paso 2: hacer la suma con el valor actual de "counter" con 1
		//Paso 3: actualizar el valor guardado en la variable con el valor nuevo
		counter = counter +1;
	}
	
	public void decrease() {
		//Decrece el valor de la variable de counter por uno
		synchronized (this) {
			counter--;
		}
	}
	
	public int getCounter() {
		return counter;
	}
}
