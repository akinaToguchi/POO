package tramitesacademicos;

import java.util.ArrayList;

public  class Alumno extends Persona{
	

	private Carrera carrera;
	private ArrayList<AsignaturaCursada> asignaturasCursadas;
	
	public Alumno(int dni, String nombre, String direccion, ArrayList<AsignaturaCursada> asignaturasCursadas) {
		super(dni, nombre, direccion);
		this.setCarrera(carrera);
		this.asignaturasCursadas = asignaturasCursadas;
	}

	public void inscribirAsignaturas() {
		
	}
	
    public void darDeBajaAsignaturas() {
		
	}
    
    public void iniciarTramite() {
		
	}
    

	public ArrayList<AsignaturaCursada> getAsignaturasCursadas() {
		return asignaturasCursadas;
	}
	public void setAsignaturasCursadas(AsignaturaCursada asignaturasCursadas) {
		this.asignaturasCursadas.add(asignaturasCursadas);
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	
	

}
