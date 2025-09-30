/**
 * 
 */
package hilosycalculosparalelos.searching;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Scanner;

import datastructure.User;

/**
 * @author G 26 sept 2025
 */
public class SearchingTest {

	public static void main(String[] args) {
		
		String targetName = "Luis";
		System.out.println("Luis" == targetName);
		//InputStream in = System.in;

		// 1 Crea un array de objetos de usuario
		// 2 Usamos multiples hilos para encontrar un usuario concreto
		// An array of user
		User[] clients = new User[20000];
		for (int i = 0; i < clients.length; i++) {
			clients[i] = new User("Luis" + i, i, "emilianogmail0", "arribadds", i, false);
		}
		
		searchWithOneThread(targetName, clients);
		searchingWithMultipleThreads(targetName, clients);
	}
		
	
	private static void searchingWithMultipleThreads(String targetName, User[] clients) {
		
		
	}

	private static void searchWithOneThread(String targetName, User[] clients) {
		
		for (int i = 0; i < clients.length; i++) {
			if(clients[i].getName() == targetName);{
				System.out.println("id of the user is " + clients[i].getId());
			}
		}
	}		

}
