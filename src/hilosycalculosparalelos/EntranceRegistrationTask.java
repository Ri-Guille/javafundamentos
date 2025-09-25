/**
 * 
 */
package hilosycalculosparalelos;

import java.util.Iterator;

/**
 * @author G 16 sept 2025
 */
public class EntranceRegistrationTask implements Runnable{

	
	private Aeropuerto aeropuerto;
	
	/**
	 * @param aeropuerto
	 */
	public EntranceRegistrationTask(Aeropuerto aeropuerto) {
		this.aeropuerto = aeropuerto;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println("Start the task");
		try {
			//Obtener el nombre del hilo que se esta ejecutando e imprimimos su nombre.
			System.out.println("The thread name is " + Thread.currentThread().getName());
			//hacer que este hilo se duerma 2 segundos
			System.out.println("The thread " + Thread.currentThread().getName()+ " has entered the sleep mode");
			Thread.sleep(2000);
			Thread.currentThread().getName();
			for (int i = 0; i < 100; i++){
			aeropuerto.increment();
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The task is finished");
	}
	
}
