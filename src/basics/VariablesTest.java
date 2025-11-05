/**
 * 
 */
package basics;

/**
 * @author G 24 oct 2025
 */
public class VariablesTest {

	//class variable
	boolean isRunning = false;
	public static void main(String[] args) {
		//una variable  de tipo boolean ocupa un byte de espacio
		//tipo + nombre de la variable = el valor concreto
		//variable local
		boolean isRunning = true;
		isRunning = false;
		byte number0 = -10;
		//una variable de tipo short ocupa dos bytes
		short number1 = 23;//se usa para almacenar numeros enteros
		//conversion de un tipo mayor a un tipo que ocupa menos espacio
		number0 = (byte)number1;
		System.out.println("number0 = " + number0);
		number1 = number0;
		//una variable de tipo int ocupa 4 bytes
		int number2 = 9999990;
	}
	
	void stop() {
		isRunning = false;
	}
}
