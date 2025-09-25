package TransportesPorMotor;

public class Main {
	public static void main(String[] args) {
		Moto Moto = new Moto("Moto ", 0, 100, 0, null, null);
		System.out.print(Moto.getName());	
		System.out.print(Moto.getWeight());	
	}
}
