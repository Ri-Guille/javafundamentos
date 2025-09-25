package TransportesPorMotor;

public class Vehiculo {

	private String name = "unknown";
	private float cv = 0;
	private float weight = 0;
	private float wheels = 0;
	private String modelo = "unknown";
	private String tipodecombustible = "unknown";
	
	
	//Constructors
	
	public Vehiculo(String name, float cv, float weight, float wheels, String modelo, String tipodecombustible) {
		this.name = name;
		this.cv = cv;
		this.weight = weight;
		this.wheels = wheels;
		this.modelo = modelo;
		this.tipodecombustible = tipodecombustible;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getCv() {
		return cv;
	}


	public void setCv(float cv) {
		this.cv = cv;
	}


	public float getWeight() {
		return weight;
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}


	public float getWheels() {
		return wheels;
	}


	public void setWheels(float wheels) {
		this.wheels = wheels;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getTipodecombustible() {
		return tipodecombustible;
	}


	public void setTipodecombustible(String tipodecombustible) {
		this.tipodecombustible = tipodecombustible;
	}
	
	
}

