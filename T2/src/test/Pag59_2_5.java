 package test;

public class Pag59_2_5 {

	public static void main(String[] args) {
		int uno = 1;
		int res = suma(uno, suma(uno + uno, suma(-uno, uno * uno)));
		System.out.println(res);
	}

	private static int suma(int a, int b) {
		return a + b;
	}
}
