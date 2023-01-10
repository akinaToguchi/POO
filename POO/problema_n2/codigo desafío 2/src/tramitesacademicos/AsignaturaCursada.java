package tramitesacademicos;

public class AsignaturaCursada {

	private double promedio;
	private double Final;
	private String nombre;
	public AsignaturaCursada(String nombre) {
		super();
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "AsignaturaCursada [nombre=" + nombre + "]";
	}
	
	
}
