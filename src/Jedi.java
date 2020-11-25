
public class Jedi {
	private String name;
	private int age;
	private int force;
	private String planet;
	
	public Jedi() {
	}

	public Jedi(String name, int age, int force, String planet) {
		this.name = name;
		this.age = age;
		this.force = force;
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

	public String getPlanet() {
		return planet;
	}

	public void setPlanet(String planet) {
		this.planet = planet;
	}
	
	public String mostrarDatos() {
		return "Jedi{" + "Nombre:'" + name + '\'' + ", Edad: " + age + ", Fuerza: " + force + ", Planeta: '" + planet + '\'' + '}';
	}	
	
}
