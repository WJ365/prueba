package primerosPasos;

public class PruebaApp {

	public static void main(String[] args) {
		int precioProducto = 300;
		
		final double IVA = 0.21;
		System.out.println("Informacion del producto");
		System.out.println("El Precio del producto es" +precioProducto);
		System.out.println("el precio del producto, incluyendo el IVA, es"
		+(precioProducto+(precioProducto*IVA)));
		
		

	}

}
