package datastructure;


public class ArrayTest {
	public static void main(String[] args) {
		// == se utiliza para igualar
		// = se utiliza para establecer un valor a una variable
		System.out.println(1==1);
		
		
		int[] scores = {1, 12, 78, 8};
		
		sumup(scores);
		sumup(scores);
		sumup(scores);

		findMaxMin(scores);
		
		//Array
		User[] Clients = new User[2];
		User[] users = {new User(), new User()};
		Clients[0] = new User("unknow", 10, "emilianogmail0", "arribadds", 0, false);
		Clients[1] = new User("unknow", 10, "emilianogmail0", "arribadds", 1, false);
		//Imprimir lo que deseemos, (longitud)
		System.out.println(scores.length);
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
