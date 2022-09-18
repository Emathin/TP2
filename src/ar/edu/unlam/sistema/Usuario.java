package ar.edu.unlam.sistema;

import java.util.Objects;

public class Usuario {
	private String nombreDeUsuario;
	private String contrase�a;
	private Boolean logeado;
	private Boolean bloqueado;
	private Integer edad;

	public Usuario(String nombreDeUsuario, String contrase�a, Integer edad) {
		this.nombreDeUsuario = nombreDeUsuario;
		this.edad = edad;
		this.logeado = false;
		this.bloqueado = false;
		this.contrase�a = contrase�a;

	}

	////// Setter and getters///////
	public Boolean getLogeado() {
		return logeado;
	}

	public void setLogeado(Boolean logeado) {
		this.logeado = logeado;
	}

	public Boolean getBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(Boolean bloqueado) {
		this.bloqueado = bloqueado;
	}

	public Integer getEdad() {
		return edad;
	}

	public String getContrase�a() {
		return contrase�a;
	}
	
	public String getNombreDeUsuario() {
		return nombreDeUsuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombreDeUsuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nombreDeUsuario, other.nombreDeUsuario);
	}

}
