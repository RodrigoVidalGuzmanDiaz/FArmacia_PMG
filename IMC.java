import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner alturaDelUsuario = new Scanner(System.in);
		System.out.println("Ingresar altura en mts: ");
		double datoEnMts = alturaDelUsuario.nextDouble();
		
		Scanner numeroDeAltura = new Scanner(System.in);
		System.out.println("Ingresar masa en lbs: ");
		double masaEnLbs = numeroDeAltura.nextDouble();
		
		
		
		double MasaEnKg = masaEnLbs/2;
		
		double Imc = MasaEnKg/(datoEnMts*datoEnMts);
		
		System.out.println("");
		
		if(Imc<=18.5) {
			System.out.println("Tu IMC identifica que tienes delgadez severa");
			}else if(Imc>=18.5 && Imc <= 24.9) {
			System.out.println("Tu IMC identifica que es normal");
			}else if(Imc>=25 && Imc <=30) {
				System.out.println("Tu IMC identifica que tienes sobrepeso");
				}else {
					System.out.println("Tu IMC identifica que tienes obesidad");
				}
		System.out.println("");
		
		System.out.println("Tu IMC es de " + Imc);
		System.out.println("╔═══════════════╦══════════════╦══════════════╗");
		System.out.println("║ Clasificación ║     Imc      ║      Peso    ║");
		System.out.println("║   Normal      ║  18.5 - 24.9 ║    Promedio  ║");
		System.out.println("║  Sobrepeso    ║  25   - 29.9 ║    Sobrepeso ║");
		System.out.println("║  Obesidad     ║  30   - 34.9 ║    Moderada  ║");
		System.out.println("╚═══════════════╩══════════════╩══════════════╝");
	}

}
