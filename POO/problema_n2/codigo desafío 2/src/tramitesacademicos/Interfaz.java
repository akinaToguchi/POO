package tramitesacademicos;

import java.sql.Date;
import java.util.ArrayList;

public class Interfaz {

	
	public static void main(String[] args) {
		
		alumno.setCarrera(c);
		System.out.println("-------------------------");
		System.out.println("Datos del Alumno:");
		System.out.println("Nombre: " + alumno.getNombre());
		System.out.println("DNI: " + alumno.getDni());
		System.out.println("Direccion: " + alumno.getDireccion() );
		System.out.println("Asignaturas cursadas: " + alumno.getAsignaturasCursadas());
		System.out.println("-------------------------");
		
		
		Date d= new Date(2020, 06, 9);
		Tramite t = new Tramite(5695221, d, alumno );
		System.out.println("-------------------------");
		System.out.println("Datos del Recibo:");
		System.out.println("Numero de tramite: " + t.getID() );
		System.out.println("Fecha: " + t.getFecha());
		System.out.println("Nombre del alumno: " + alumno.getNombre());
		System.out.println("DNI: " + alumno.getDni());
		System.out.println("-------------------------");
	}
}
		
		
		Carrera c= new Carrera("desarrollador","flores");
		ArrayList<AsignaturaCursada> asignaturasCursadas = new ArrayList<AsignaturaCursada>();
		asignaturasCursadas.add(new AsignaturaCursada("sistemas operativos"));
		asignaturasCursadas.add(new AsignaturaCursada("programacion"));
		asignaturasCursadas.add(new AsignaturaCursada("orientado a objetos"));
		Alumno alumno = new Alumno(45678987, "akina", "honduras 1880", asignaturasCursadas);
		
		


