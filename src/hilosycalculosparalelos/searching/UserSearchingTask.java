/**
 * 
 */
package hilosycalculosparalelos.searching;

import datastructure.User;

/**
 * @author G 30 sept 2025
 */
public class UserSearchingTask implements Runnable{

	private String target = null;
	
	private User[] clients = null;
	
	private int beginning = -1, end = -1;
	
	private Thread main;
	
	/**
	 * @param targetName
	 * @param clients2
	 * @param i
	 * @param j
	 * @param thread 
	 */
	public UserSearchingTask(String targetName, User[] clients2, int i, int j, Thread thread) {
		this.target = targetName;
		this.clients = clients2;
		this.beginning = i;
		this.end = j;
		this.main = thread;
	}

	@Override
	public void run() {
		for (int i = beginning; i < end; i++) {
			if(clients[i] != null && clients[i].getName().equals(target)){
				System.out.println("id of the user is " + clients[i].getId());
				this.main.interrupt();
				break;
			}
		}
		
	}

}
