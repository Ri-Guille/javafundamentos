/**
 * 
 */
package hilosycalculosparalelos.deadlock;

import java.time.Duration;

/**
 * @author G 11 nov 2025
 */
// 1 Se genera en un entorno distribuido o concurrente
// 2 se ocurre si tenemos multiples locks en elk mismo contexto o entorno
// 3 cuando accedemos a un recurso compartidoe protegido por multiples locks y
//   empleamos los locks en diferentes ordenes

// tenemos que emplear siempre los locks en el mismo orden en toda aplicacion
public class DeadLockTasks {
	//Any intance of a class can be used as a lock
	Object lock1 = new Object();
	Object lock2 = new Object();

	Integer lock3 = 3;
	//Protected resource 1
	//Protected by lock 1
	private float balance = 1;
	//Protected resource 2
	//Protected by lock 2
	private int stock = 10;
	
	
	public void task1() {
		synchronized (lock1) {
			System.out.println("Task 1 protected by lock1 starts by thread name " + Thread.currentThread().getName());

			// otras operaciones ignoradas
			// examinar el almacen y reducir la cantidad 
			if (stock <= 0) {
				return;
			}
			
			deductStock();
			

			//una pausa
			try {
				Thread.sleep(Duration.ofMillis(100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (lock2) {
				System.out.println("Task 1 protected by lock2 starts by thread name " + Thread.currentThread().getName());
				deduct();
				System.out.println("Task 1 protected by lock2 has finished by thread name " + Thread.currentThread().getName());

			}
			
			System.out.println("Task 1 protected by lock1 has finished by thread name " + Thread.currentThread().getName());

		}
	}

	public void task2() {
		synchronized (lock1) {
			System.out.println("Task 2, the current thread name" + Thread.currentThread().getName());	
			// otras operaciones ignoradas asociadas con esta tarea
			synchronized (lock2) {
				System.out.println("Task 2 protected by lock1 starts by thread name " + Thread.currentThread().getName());
				deduct();
				System.out.println("Task 2 protected by lock1 has finished by thread name " + Thread.currentThread().getName());

			}
				
			System.out.println("Task 2 protected by lock2 has finished by thread name " + Thread.currentThread().getName());
		}
	}
	
	public void task3() {
		synchronized (lock2) {
			System.out.println("Task 3, the current thread name" + Thread.currentThread().getName());
			//una pausa
			try {
				Thread.sleep(Duration.ofMillis(100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Task 3 has finished, the current thread name" + Thread.currentThread().getName());

		}
	}
	
	public void task4() {
			System.out.println("Task 4, the current thread name" + Thread.currentThread().getName());
			//una pausa
			try {
				Thread.sleep(Duration.ofMillis(100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Task 4 has finished, the current thread name" + Thread.currentThread().getName());

		}
	

	private void deduct() {
		System.out.println("deduct balance");
		balance--;

	}
	
	private void deductStock() {
		System.out.println("deduct balance");
		stock--;
		
	}
}
