package datastructure;

import java.util.Arrays;


public class ArrayTest {
	public static void main(String[] args) {
		// == se utiliza para igualar
		// = se utiliza para establecer un valor a una variable
		System.out.println(1==1);
		
		
		int[] scores = {1, 12, 78, 8, 45};
		
		reverse(scores);
		
		sumup(scores);

		findMaxMin(scores);
		
		switchValues(scores, 0, 4);
		//{12, 1, 8, 45, 78}
		
		createOnject();
	}

	/**
	 * @param scores
	 */
	private static void reverse(int[] scores) {
		
		
	}

	/**
	 * 
	 */
	private static void createOnject() {
		//Array
				User[] Clients = new User[2];
				User[] users = {new User(), new User()};
				Clients[0] = new User("unknow", 10, "emilianogmail0", "arribadds", 0, false);
				Clients[1] = new User("unknow", 10, "emilianogmail0", "arribadds", 1, false);
				//Imprimir lo que deseemos, (longitud)
				System.out.println(users.length);
				System.out.println("longitud del array del cliente " + Clients.length);
				for (int i = 0; i < Clients.length; i++) {
					Clients[i] = new User("Luis" + i, i, "emilianogmail0", "arribadds", i, false);
				}
				for (int i = 0; i < Clients.length; i++) {
					System.out.println(Clients[i].getName());
				}		
				boolean[] booleans = null;
				
				System.out.println(booleans.length);
				//java.lang.ArrayIndexOutOfBoundsException
				System.out.println(users [2]);
				System.out.println(users.length);
		
	}

	/**
	 * @param arr
	 * @param i
	 * @param j
	 */
	private static void switchValues(int[] arr, int i, int j) {
		// Guarda temporalmente el elemento de posicion i en una variable
		int num = arr[i];
		//sustituye el elemento en posicion i con el elemento en posicion j
		arr[i] = arr[j];
		//asigna el elemento guardado en la variable "num" a la posicion j del array
		arr[j] = num;
		System.out.println(Arrays.toString(arr));
	}

	/**
	 * Encontrar el maximo y el minimo valor en la array
	 * @param scores
	 */
	private static void findMaxMin(int[] scores) {
		// TODO Auto-generated method stub
		int max = scores[0];
		int min = scores[scores.length - 1];
		for (int i = 0; i < scores.length; i++) {
			//si el max es menor que el dato aactual que hemois codigo "scores[i]"
			//max = scores[i]
//			if(condition) {
//				statement;
//			}
//			else {
//				statement;
//			}
			if(max < scores[i]) {
				max = scores[i];
			}
		}
		System.out.println("the maximum value is " + max);
	}

	/**
	 * @param scores
	 */
	private static void sumup(int[] scores) {
		int sum = scores[0] + scores[1] + scores[2] + scores[3];
		System.out.println("the total score is " + sum);
		int totalScore = 0;
		for (int i = 0; i < scores.length; i++) {
			totalScore =scores[i] + totalScore;
		}
		System.out.println("the total score is " + totalScore);
		// TODO Auto-generated method stub
		
	}	
}
