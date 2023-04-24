package encapsulamiento;

public class Examen {
	private float calificaciones;
	private int numeroDePreguntas;
	private boolean activo;

	public float getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(float calificaciones) {
		this.calificaciones = calificaciones;
	}

	public int getNumeroDePreguntas() {
		return numeroDePreguntas;
	}

	public void setNumeroDePreguntas(int numeroDePreguntas) {
		this.numeroDePreguntas = numeroDePreguntas;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

}
