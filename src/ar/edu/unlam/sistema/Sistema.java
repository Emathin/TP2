package ar.edu.unlam.sistema;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sistema {
	private String nombreDelSistema;
	private int cantidadMaximaDeUsuarios;
	private Set<Usuario> usuariosss;

	public Sistema(String nombreDelSistema, int cantidadMaximaDeUsuarios) {
		this.nombreDelSistema = nombreDelSistema;
		this.cantidadMaximaDeUsuarios = cantidadMaximaDeUsuarios;
		this.usuariosss = new HashSet<Usuario>();

	}

	///// Métodos private////

	private Boolean usuarioExistente(String nombre) {
		Boolean hayUnUsuarioConElMismoNombre = false;
		for (Usuario usuario : usuariosss) {
			if (usuario.getNombreDeUsuario() == nombre) {
				hayUnUsuarioConElMismoNombre = true;
			}
		}
		return hayUnUsuarioConElMismoNombre;
	}
	
	private Usuario obtenerUsuario(String nombre) {
		if(usuarioExistente(nombre))
		
	}

	private Boolean agregarUsuario(Usuario unNuevoUsuario) {
		this.usuariosss.add(unNuevoUsuario);
		return false;
	}

	////// Métodos public//////////

	public Integer calcularLaCantidadDeUsuariosLogueados() {
		Integer cantidadDeUsuariosLogueados = 0;
		for (Usuario usuario : usuariosss) {
			if (usuario.getLogeado() == true)
				cantidadDeUsuariosLogueados++;
		}
		return cantidadDeUsuariosLogueados;
	}

	public Integer calcularLaCantidadDeUsuariosBloqueados() {
		Integer cantidadDeUsuariosBlogueados = 0;
		for (Usuario usuario : usuariosss) {
			if (usuario.getBloqueado() == true)
				cantidadDeUsuariosBlogueados++;
		}
		return cantidadDeUsuariosBlogueados;
	}

	public Integer calcularElPorcentajeDeUsuariosLogueados() {
		Integer porcentajeDeUsuariosLogueados = calcularLaCantidadDeUsuariosLogueados() / this.usuariosss.size();
		return porcentajeDeUsuariosLogueados;
	}

	public Double calcularEdadPromedio() {
		Integer sumatoriaDeEdades = 0;
		for (Usuario usuario : usuariosss) {
			sumatoriaDeEdades += usuario.getEdad();
		}
		Double edadPromedio = (double) (sumatoriaDeEdades / this.usuariosss.size());
		return edadPromedio;
	}

	public Boolean loguearUsuario(String usuario, String contraseña) {
		Integer intentosFallidos=0;
		if (usuarioExistente(usuario)) {
			if(usuario.)
		}else {
			System.out.println("\n Usuario inexistente, registrese por favor. ");
		}
		
		
		
		
		
		/*Boolean logeado = false;
		/// El numero de intentos para loguearse es de tres.///
		for (int i = 0; i < 3; i++) {
			for (Usuario usuario2 : usuariosss) {
				if (usuarioExistente(usuario)&& usuario2.getContraseña() == contraseña) {
					usuario2.setLogeado(true);
					logeado = true;
				}
			}
		}
		
		return logeado;*/
	}

	public void registrarNuevosUsuariosEnElSistema(String nombreDeUsuario, String contraseña, Integer edad) {
		if (!usuarioExistente(nombreDeUsuario)) {
			Usuario nuevoUsuario = new Usuario(nombreDeUsuario, contraseña, edad);
			agregarUsuario(nuevoUsuario);
		}
	}

	public void verLasEstadisticasDelSistema() {
		System.out.println("\n Cantidad de usuarios logueados; "+calcularLaCantidadDeUsuariosLogueados()+
				"\n Cantidad de usuarios bloqueados: "+);
	}
}
