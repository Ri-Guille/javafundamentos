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
	
	/**
	 * @param targetName
	 * @param clients2
	 * @param i
	 * @param j
	 */
	public UserSearchingTask(String targetName, User[] clients2, int i, int j) {
		this.target = targetName;
		this.clients = clients2;
		this.beginning = i;
		this.end = j;
	}

	@Override
	public void run() {
		for (int i = beginning; i < end; i++) {
			if(clients[i].getName() == target);{
				System.out.println("id of the user is " + clients[i].getId());
			}
		}
		
	}

}
