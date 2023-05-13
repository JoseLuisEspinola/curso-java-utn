package modelo;

import java.time.LocalDate;

public class Inscripcion {
	private Alumno alumno;
	private Materia materia;
	private LocalDate fecha;
	// en espera, aprobada, desaprobada
	private EstadoDeInscripcion estado;

	public EstadoDeInscripcion estadoDeInscripcion() {
		if(this.materia.puedeCursar(this.alumno)) {
			this.estado = EstadoDeInscripcion.APROBADA;
		} else {
			this.estado = EstadoDeInscripcion.DESAPROBADA;
		}
		return this.estado;
	}
	
	public Inscripcion(Alumno alumno, Materia materia, LocalDate fecha) {
		this.alumno = alumno;
		this.materia = materia;
		this.fecha = fecha;
		this.estado = EstadoDeInscripcion.EN_ESPERA_DE_APROBACION;
	}
	
	public boolean aprobada() {
		return this.materia.puedeCursar(this.alumno);
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	

	@Override
	public String toString() {
		return "Inscripcion [alumno=" + alumno + ", materia=" + materia + ", fecha=" + fecha + "]";
	}
	


}
