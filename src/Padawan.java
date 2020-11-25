
public class Padawan {
	private String name;
	private int age;
	private int force;
	private int potential;
	private String planet;

	public Padawan() {

	}

	public Padawan(String name, int age, int force, int potential, String planet) {
		this.name = name;
		this.age = age;
		this.force = force;
		this.potential = potential;
		this.planet = planet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getPotential() {
		return potential;
	}

	public void setPotential(int potential) {
		this.potential = potential;
	}

	public String getPlanet() {
		return planet;
	}

	public void setPlanet(String planet) {
		this.planet = planet;
	}

	public String mostrarDatos() {
		return "Padawan{" + "Nombre:'" + name + '\'' + ", Edad: " + age + ", Fuerza: " + force + ", Potencial: "
				+ potential + ", Planeta: '" + planet + '\'' + '}';
	}

}
