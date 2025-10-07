/**
 * 
 */
package basics;

/**
 * @author G 26 sept 2025
 */
public class OperatorsTest {
	
	public static void main(String[] args) {
		
		arithmeticOperations();
		arithmeticOperations();

		
		logicalOperatorsTest();
		

	}

	/**
	 * 
	 */
	private static void logicalOperatorsTest() {
		//logical or || significa o 
		System.out.println("operator or");		
		System.out.println(true || false);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || true);
		
		//logical or && significa o 
		System.out.println("operator and");
		System.out.println(true && false);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && true);
		
		boolean eyeClosed = false;
		boolean breathSlow = true;
		if(eyeClosed && breathSlow)	
			System.out.println("Is sleeping");
		
		else {
			System.out.println("Not sleeping");
		}
	}
	

	/**
	 * 
	 */
	private static void arithmeticOperations() {
		// TODO Auto-generated method stub
		//Declaring three variables of the same type
				float num1 = 10, num2 = 20.234f, num3;
				System.out.println(num1);
				num1 = 23.34f;
				System.out.println(num1);
				//addition
				float result = num1 + num2;
				System.out.println("The result is " + result);
				/*
				 * Una operacion la cual es una resta
				 * 1 La cpu lee el valor de la variable "result"
				 * 2 Se realiza la resta con el numero 1
				 * 3 Se guarda el resultado en la misma variable "result"
				 * 
				 * El orden de la operacion es de derecha a izquierda
				 */
				result = result- 1;
				System.out.println("The result is " + result);
				result -= 1;//Es lo mismo que "result = result -1"
				System.out.println("The result is " + result);
				//multiplicacion
				result = result * 2;
				System.out.println("The result is " + result);
				result *= 2;//Es lo mismo que "result = result * 2"
				System.out.println("The result is " + result);
				result = result / 2;
				System.out.println("The result is " + result);
				result /= 2;//Es lo mismo que "result = result / 2"
				System.out.println("The result is " + result);
		
	}
}
