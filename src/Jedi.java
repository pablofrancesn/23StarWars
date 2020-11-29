public class Jedi {
    private String name;
    private int age;
    private int force;
    private String planet;
    private String laserColor;

    public Jedi() {
    }

    public Jedi(String name, int age, int force, String planet, String laserColor) {
        this.name = name;
        this.age = age;
        this.force = force;
        this.planet = planet;
        this.laserColor = laserColor;
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
        if (force >= 0 && force <= 10) {
            this.force = force;
        } else {
            System.out.println("Ese valor es erroneo.");
        }
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public String getLaserColor() {
        return laserColor;
    }

    public void setLaserColor(String laserColor) {
        this.laserColor = laserColor;
    }

    public String toString() {
        return "Jedi {" +
                "Nombre= '" + name + '\'' +
                ", edad= " + age +
                ", fuerza= " + force +
                ", planeta= '" + planet + '\'' +
                ", color espada= '" + laserColor + '\'' +
                '}';
    }
}
