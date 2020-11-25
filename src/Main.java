
public class Main {
	public static void main(String[] args) {
		Jedi[] jedis = new Jedi[5];
		Padawan[] padawans = new Padawan[5];
		jedis[0] = Padawan("Anakin", 15, );
				
		int opc;
		
		do {
			switch (opc) {
			case 1:
				for (int i = 0; i < jedis.length; i++) {
					jedis[i].mostrarDatos();
				}
				break;
			case 2:
				for (int i = 0; i < jedis.length; i++) {
					padawans[i].toString();
				}
				break;

			default:
				break;
			}
		} while (opc!=0);
	}
}
