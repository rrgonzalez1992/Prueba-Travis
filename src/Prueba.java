public class Prueba {

	public static void main(String[] args) {
		try {
			try {
				System.out.println("Hola");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
