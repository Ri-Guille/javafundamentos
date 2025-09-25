package datastructure;


public class ArrayTest {
	public static void main(String[] args) {
		// == se utiliza para igualar
		// = se utiliza para establecer un valor a una variable
		System.out.println(1==1);
		
		
		int[] scores = {12, 123123, 435, 324};
		int sum = scores[0] + scores[1] + scores[2] + scores[3];
		System.out.println("the total score is " + sum);
		int totalScore = 0;
		for (int i = 0; i < scores.length; i++) {
			totalScore =scores[i] + totalScore;
		}
		System.out.println("the total score is " + totalScore);
		
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
}
