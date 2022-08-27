
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		int Nvidas=3;
		boolean cond=false;
		String prem1="Yakuza Song of Life";
		Scanner sc = new Scanner(System.in);
		int var1=5;
		
		do {
			System.out.println("Ingrese numero");
			num = sc.nextInt();
			if (num==var1) {
				System.out.println("Premio: "+prem1);
				break;
			}
			if (cond==false) {
				System.out.println("Mala suerte");
				Nvidas --;
			}
		}while(Nvidas!=0);
		
}
}
