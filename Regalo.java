
public class Regalo {
	public static String elegir(int Nvid) {
		String gift= " ";
		switch (Nvid) {
		case 1: gift = "Pasaje al caribe"; break;
		case 2: gift = "Visita al museo más cercano"; break;
		case 3: gift= "Entrada al cine"; break;
		}
		return gift;
	}
}
