package tramitesacademicos;

import java.sql.Date;

public class Tramite {
	
	private Integer ID;
	private Date fecha;
	private Alumno alumno;
	
	

	public Tramite(Integer iD, Date fecha, Alumno alumno) {
		super();
		ID = iD;
		this.fecha = fecha;
		this.alumno = alumno;
	}
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Alumno getAlumno() {
		return alumno;
	}
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

}
