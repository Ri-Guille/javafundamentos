package solarsystem;

public class Test {
	public static void main(String[] args) {
		Planeta Planeta = new Planeta();
		System.out.println(Planeta.age);
		Planeta.doSomething();
		Planeta.setAge(100);
		Planeta.MINIMUM_SIZE = 234;
		
		//Los miembros estaticos de una clase se acceden con el nombre de la clase, no los nombres de los objetos
		//de la misma clase, porque los estaticos no estan asociados con cualquier objeto especifico.
	}
}
