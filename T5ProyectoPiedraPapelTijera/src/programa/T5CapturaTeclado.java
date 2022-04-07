package programa;

import java.util.Scanner;

/**
 * 
 * @author RVS
 *
 */
public class T5CapturaTeclado {

	/**
	 * 
	 * @return
	 */
	public static String getRespuesta() {
		Scanner sc = null;
		String respuesta = null;
		try {
			sc = new Scanner(System.in);
			respuesta = sc.nextLine();
		} catch (Exception e) {
			System.out.println(" ⛔ Mensaje de error : " + e.getMessage());
		}
		sc.close();
		return respuesta;
	}

	/**
	 * 
	 * @return
	 */
	public static String getNumero() {
		Scanner sc = null;
		String numero = "";
		try {
			sc = new Scanner(System.in);
			numero = sc.nextLine();
		} catch (Exception e) {
			System.out.println(" ⛔ Mensaje de error : " + e.getMessage());
		}
		sc.close();
		return numero;
	}

}
