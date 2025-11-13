/**
 * 
 */
package hilosycalculosparalelos.deadlock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author G 11 nov 2025
 */
public class DeadLockTest {

	public static void main(String[] args) {
		// Crear un objeto de clase @link{DeadLockTasks}
		DeadLockTasks tasks = new DeadLockTasks();
		// Crear un objeto que nos administra un grupo de hilos reutilizables
		ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		// Entregamos las tareas a traves de "submit" para ejecutarlas en los hilos
		// paralelamente
		
//		for (int i = 0; i < 2; i++) {
//			executor.submit(() -> {
//				tasks.task3();
//			});
//		}
//		
//		for (int i = 0; i < 2; i++) {
//			executor.submit(() -> {
//				tasks.task4();
//			});
//		}
		
		for (int i = 0; i < 2; i++) {
			executor.submit(() -> {
				tasks.task1();
			});
		}
		for (int i = 0; i < 2; i++) {
			executor.submit(() -> {
				tasks.task2();
			});
		}
		
		try {
			executor.awaitTermination(200, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
