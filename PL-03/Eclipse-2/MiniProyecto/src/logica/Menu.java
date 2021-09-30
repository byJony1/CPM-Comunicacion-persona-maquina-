package logica;

public class Menu {

	private String[] options = {
			"Hacer pedido",
			"Visualizar pedido",
			"Visualizar carta",
			""
	};
	
	public int readOption() {
		return Console.readInteger("Option");
	}
	
	public void show() {
		int i = 1;
		for(String line: options) {
			if ( "".equals(line) ) {
				Console.println("");
				continue;
			}
			
			Console.printf("\t%2d- %s\n", i++, line);
		}
		Console.printf("\n\t%2d- %s\n", 0, "Exit");
	}
}
