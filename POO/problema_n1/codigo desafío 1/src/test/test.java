package test;

import modelo.Cliente;
import modelo.Elemento;
import modelo.Sistema;

public class test {

	public static void main(String[] args) {

		Sistema sis = new Sistema();

		Cliente cliente = new Cliente(1);
		
		
		// ----------------------------ejemplo de devolver elemento--------------------
		// sis.devolverElemento(cliente "lata", 10);
		// sis.devolverElemento(cliente, "botella", 2);
		// sis.devolverBotella(cliente, "vidrio", 3, 1);
		// -------------------------------------------------------------------------------

		System.out.println("Botellas devueltas : \n");
		System.out.println(sis.getLstBotellas());

		System.out.println("------------------------------------------------------------------------------------");

		System.out.println("Datos de otros  elementos que se devolvieron:\n" + sis.getLstElementosDevueltos());

		System.out.println("\nCantidad de elementos devuelto :" + sis.totalElementosDevueltos());

		Elemento MetodoSobrecargado = new Elemento(cliente, "vidrio", 1);
		Elemento MetodoSimple = new Elemento("vidrio", 50);
		
	}

}
