package solarsystem;

public class Planeta extends CelestialBody{
	
	public Planeta(float gravity) {
        //llamar el constructor de la superclass CelestialBody
        //asignar valores a las propiedades heredadas de la superclass
        super("Tierra");
		this.gravity = gravity;
	}

    public Planeta(float mass , String name) {
        //llamar el constructor de la superclass CelestialBody
        //asignar valores a las propiedades heredadas de la superclass
        super(name, mass);
    }
}
