
import java.util.Scanner;
public class Principal {
	
	public static String elegir(int vida) {
		String gift="";
		switch (vida) {
		case 1: gift = "Pasaje al caribe"; break;
		case 2: gift = "Visita al museo más cercano"; break;
		case 3: gift = "Entrada al cine"; break;
		}
		return gift;
	}

	public static void main(String[] args) {

		int numer;
		int Nvid=0;
		boolean cond=false;
		Scanner sc = new Scanner(System.in);
		int var1=5;
		
		do {
			System.out.println("Ingrese numero");
			numer = sc.nextInt();
			if (numer==var1) {
				cond=true;
			}
			else{
				System.out.println("Mala suerte");
			}
			Nvid ++;
		}while(cond!=true);
		String premio=elegir(Nvid);
		System.out.println("Premio:"+premio);
}
}
