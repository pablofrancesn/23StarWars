import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        Jedi[] jedis = new Jedi[5];
        Padawan[] padawans = new Padawan[5];
        int opc, potential = 10, force, maxForce = 0, counter = 0;
        String name;
        jedis[0] = new Jedi("Qui-Gon Jinn", 40, 9, "Coruscant", "Verde");
        jedis[1] = new Jedi("Obi-Wan Kenobi", 57, 8, "Stewjon", "Azul");
        jedis[2] = new Jedi("Yoda", 900, 10, "Unknown", "Verde");
        jedis[3] = new Jedi("Mace Windu", 28, 8, "Haruun Kai", "Morado");
        jedis[4] = new Jedi("Ki-Adi-Mundi", 73, 6, "Cerea", "Azul");

        padawans[0] = new Padawan("Anakin Skywalker", 9, 3, 10, "Tatooine");
        padawans[1] = new Padawan("Quinlan Vos", 4, 2, 7, "Kiffu");
        padawans[2] = new Padawan("Ahsoka Tano", 14, 5, 8, "Shili");
        padawans[3] = new Padawan("Bairdon Jace", 18, 4, 6, "Unknown");
        padawans[4] = new Padawan("Nahdar Vebb", 16, 3, 9, "Unknown");

        do {
            System.out.print("1. Mostrar datos de todos los Jedis.\n" +
                    "2. Mostrar datos de todos los Padawans.\n" +
                    "3. Mostrar datos de 1 Jedi (Buscalo por su nombre).\n" +
                    "4. Mostrar datos de 1 Padawan (Buscalo por su nombre).\n" +
                    "5. Mostrar un listado con los nombres de los padawans que tengan un potencial superior a un valor\n" +
                    "pedido al usuario.\n" +
                    "6. Mostrar los datos de los 2 Jedis que tengan más nivel de fuerza.\n" +
                    "7. Mostrar los datos del Padawan con menor potencial.\n" +
                    "8. Mostrar los datos de todos los Padawans que su nombre empiece o termine por una letra pedida\n" +
                    "al usuario.\n" +
                    "9. Modifica todos los nombres de los Jedis y ponlos en mayúsculas.\n" +
                    "10. Modifica los nombres de los padawans y ponlos todos en minúsculas.\n" +
                    "11. Salir.\n" +
                    "Elige una opción: ");
            switch (opc = sn.nextInt()) {
                case 1:
                    for (int i = 0; i < jedis.length; i++) {
                        System.out.println(jedis[i].toString());
                    }
                    break;
                case 2:
                    for (int i = 0; i < jedis.length; i++) {
                        System.out.println(padawans[i].toString());
                    }
                    break;
                case 3:
                    System.out.print("Introduce un nombre: ");
                    name = sc.nextLine();
                    for (int i = 0; i < jedis.length; i++) {
                        if (jedis[i].getName().equalsIgnoreCase(name)) {
                            System.out.println(jedis[i].toString());
                        }
                    }
                    break;
                case 4:
                    System.out.print("Introduce un nombre: ");
                    name = sc.nextLine();
                    for (int i = 0; i < padawans.length; i++) {
                        if (padawans[i].getName().equalsIgnoreCase(name)) {
                            System.out.println(padawans[i].toString());
                        }
                    }
                    break;
                case 5:
                    System.out.print("Introduce un potencial: ");
                    potential = sn.nextInt();
                    for (int i = 0; i < padawans.length; i++) {
                        if (padawans[i].getPotential() > potential) {
                            System.out.println(padawans[i].toString());
                        }
                    }
                    break;
                case 6:
                    for (int i = 0; i < jedis.length; i++) {
                        if (jedis[i].getForce() > maxForce) {
                            maxForce = jedis[i].getForce();
                            counter = i;
                        }
                    }
                    System.out.println(jedis[counter].toString());
                    force = maxForce;
                    maxForce = 0;
                    for (int i = 0; i < jedis.length; i++) {
                        if (jedis[i].getForce() > maxForce && jedis[i].getForce() != force) {
                            maxForce = jedis[i].getForce();
                            counter = i;
                        }
                    }
                    System.out.println(jedis[counter].toString());
                    break;
                case 7:
                    for (int i = 0; i < padawans.length; i++) {
                        if (padawans[i].getPotential() < potential) {
                            potential = padawans[i].getPotential();
                            counter = i;
                        }
                    }
                    System.out.println(padawans[counter].toString());
                    break;
                case 8:
                    System.out.print("Introduce una letra: ");
                    String letter = sc.nextLine();
                    for (int i = 0; i < padawans.length; i++) {
                        if (padawans[i].getName().startsWith(letter) || padawans[i].getName().endsWith(letter)) {
                            System.out.println(padawans[i].toString());
                        }
                    }
                    break;
                case 9:
                    for (int i = 0; i < jedis.length; i++) {
                        name = jedis[i].getName();
                        jedis[i].setName(name.toUpperCase());
                    }
                    break;
                case 10:
                    for (int i = 0; i < padawans.length; i++) {
                        name = padawans[i].getName();
                        padawans[i].setName(name.toLowerCase());
                    }
                    break;
                case 11:
                    System.out.println("Ha salido del sistema.");
                default:
                    System.out.println("Error");
                    break;
            }
        } while (opc != 0);
    }
}
