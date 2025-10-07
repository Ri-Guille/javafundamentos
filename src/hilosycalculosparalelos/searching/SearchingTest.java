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

		String targetName = "Luis3000000";
		System.out.println("Luis30" == targetName);
		// InputStream in = System.in;

		// 1 Crea un array de objetos de usuario
		// 2 Usamos multiples hilos para encontrar un usuario concreto
		// An array of user
		User[] clients = new User[20000000];
		for (int i = 0; i < clients.length; i++) {
			clients[i] = new User("Luis" + i, i, "emilianogmail0", "arribadds", i, false);                                                
		}
		
		long startTime = System.currentTimeMillis();
		searchWithOneThread(targetName, clients);
		long endTime = System.currentTimeMillis();
		System.out.println("The time used by the single thread mode is " + (endTime - startTime));
		
		startTime = System.currentTimeMillis();
		searchingWithMultipleThreads(targetName, clients);
		try {
			/*
			 * El hilo main entra en el modo sleep,
			 *  va a ser despertado por otro hilo cuando este haya encontrado el usuario que estamos buscando
			 */
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		endTime = System.currentTimeMillis();
		System.out.println("The time used by the multiple thread mode is " + (endTime - startTime));

		
	}

	private static void searchingWithMultipleThreads(String targetName, User[] clients) {
		
//		Thread thread1 = new Thread(new UserSearchingTask(targetName, clients, 0, index));
//		Thread thread2 = new Thread(new UserSearchingTask(targetName, clients, index, 2 * index));
//		Thread thread3 = new Thread(new UserSearchingTask(targetName, clients, 2 * index, 3 * index));
//		Thread thread4 = new Thread(new UserSearchingTask(targetName, clients, 3 * index, 4 * index));

//		thread1.start();
//		thread2.start();
//		thread3.start();
//		thread4.start();
		
		int numOfThreads = Runtime.getRuntime().availableProcessors();
		int index = clients.length / numOfThreads;
		for (int i = 0; i < numOfThreads; i++) {
			Thread thread5 = 
					new Thread(new UserSearchingTask(targetName, clients, i * index, i * index + index, Thread.currentThread()));
			thread5.start();
		}
	}

	private static void searchWithOneThread(String targetName, User[] clients) {
		/*
		 * Recorremos el array de usuarios, si el nombre de un usuario es igual que el
		 * que estamos buscando, imprimimos su id.
		 */
		for (int i = 0; i < clients.length; i++) {
			if (clients[i].getName().equals(targetName))
			{
				System.out.println("id of the user is " + clients[i].getId());
			}
		}
	}

}
