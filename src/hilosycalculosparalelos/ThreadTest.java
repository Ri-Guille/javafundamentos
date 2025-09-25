/**
 * 
 */
package hilosycalculosparalelos;

/**
 * @author G 12 sept 2025
 */
public class ThreadTest {
	public static void main(String[] args) {
		
		Aeropuerto aeropuerto = new Aeropuerto();
		//creacion de un nuevo hilo y le psamos la tarea al hilo
		Thread thread1 = new Thread(new EntranceRegistrationTask(aeropuerto));
		//ejecuta la tarea que tiene el hilo
		thread1.start();
	
		Thread thread2 = new Thread(new ExitRegistrationTask(aeropuerto));
		
		thread2.start();
		
		try {
			//Se duerme durante 4 segundos y despues imprime el valor actual de aeropuerto
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(aeropuerto.getCounter());
		System.out.println(Runtime.getRuntime().availableProcessors());
	}
}


