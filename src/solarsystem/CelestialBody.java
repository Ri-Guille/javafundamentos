package solarsystem;

public class CelestialBody {
	
	public float getGravity() {
		return gravity;
	}

	public void setGravity(float gravity) {
		this.gravity = gravity;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public boolean isHasOxygen() {
		return hasOxygen;
	}

	public void setHasOxygen(boolean hasOxygen) {
		this.hasOxygen = hasOxygen;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float gravity = 4444444444444444445555544.f;
	protected double mass = 444444444444444444444444444444444444444444444444444444444.444444444;
	private boolean hasOxygen = false;
	String nameString = "unknown";
	float radius = 234234;
	int age = 232676753;
	//memoria se crea cuantos objetos se creen
	public static float MINIMUM_SIZE = 67567.4f;
	
	public static void doSomething() {
		System.out.println("do something");}
}
