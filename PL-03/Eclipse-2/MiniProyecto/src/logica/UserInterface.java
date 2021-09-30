package logica;

public class UserInterface {
	private static final int EXIT = 0;
	
	private Menu menu = new Menu();
	private Pedido pedido = new Pedido();
	private Carta carta = new Carta();
	
	public void show() {
		int option = EXIT;
		do {
			menu.show();
			option = menu.readOption();
			try {
				processOption(option);
			} catch (RuntimeException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (option != EXIT);
		
	}

	private void processOption(int option) throws InterruptedException {
		switch (option) {
			case EXIT: return;
			case 1: hacerPedido(); break;
			case 2: mostrarPedido(); break;
			case 3: mostrarCarta(); break;
		}
	}
	
	
	private void hacerPedido() throws InterruptedException {
		mostrarCarta();
		Thread.sleep(5000);
		String type = Console.readString("Tipo: ");
		String nombre = Console.readString("Nombre: ");
		int cantidad = Console.readInteger("Unidades: ");
		Articulo art = getArticulo(type, nombre, cantidad);
		if (!art.equals(null)) {
			pedido.add(art, cantidad);
		}
	}
	
	private Articulo getArticulo(String type, String nombre, int cantidad) {
		Articulo[] art = carta.getArticulos();
		for (Articulo articulo : art) {
			if (articulo.getTipo().equals(type) && articulo.getDenominacion().equals(nombre)) {
				return new Articulo(articulo.getCodigo(), type, nombre, articulo.getPrecio(), cantidad);
			}
		}
		return null;
	}

	private void mostrarPedido() {
		pedido.grabarPedido();
		System.out.println(pedido.getTotal());
	}
	
	private void mostrarCarta() {
		Articulo[] art = carta.getArticulos();
		for (Articulo articulo : art) {
			System.out.println(articulo);
		}
	}

	
	
}
