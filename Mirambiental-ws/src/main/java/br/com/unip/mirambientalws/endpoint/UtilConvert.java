package br.com.unip.mirambientalws.endpoint;

import br.com.unip.mirambientalws.modelo.Incidente;
import br.com.unip.mirambientalws.modelo.IncidenteAtributo;
import br.com.unip.mirambientalws.modelo.Usuario;
import br.com.unip.mirambientalws.modelo.UsuarioAtributo;

public class UtilConvert {

	public static Usuario convertUsuario(UsuarioAtributo atributo) {
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(atributo.getIdUsuario());
		usuario.setImagemUsuario(atributo.getImagemUsuario());
		usuario.setNomeUsuario(atributo.getNomeUsuario());
		usuario.setSenhaUsuario(atributo.getSenhaUsuario());
		return usuario;
	}

	public static Incidente convertIncidente(IncidenteAtributo atributo) {
		Incidente incidente = new Incidente();
		incidente.setIdIncidente(atributo.getIdIncidente());
		incidente.setIdUsuario(atributo.getIdUsuario());
		incidente.setIdTipoIncidente(atributo.getIdIncidente());
		incidente.setEndereco(atributo.getEndereco());
		incidente.setImagem(atributo.getImagem());
		return incidente;
	}

	public static UsuarioAtributo convertUsuarioAtributo(Usuario atributo) {
		UsuarioAtributo usuario = new UsuarioAtributo();
		usuario.setIdUsuario(atributo.getIdUsuario());
		usuario.setImagemUsuario(atributo.getImagemUsuario());
		usuario.setNomeUsuario(atributo.getNomeUsuario());
		usuario.setSenhaUsuario(atributo.getSenhaUsuario());
		return usuario;
	}

	public static IncidenteAtributo convertIncidente(Incidente atributo) {
		IncidenteAtributo incidente = new IncidenteAtributo();
		incidente.setIdIncidente(atributo.getIdIncidente());
		incidente.setIdUsuario(atributo.getIdUsuario());
		incidente.setIdTipoIncidente(atributo.getIdIncidente());
		incidente.setEndereco(atributo.getEndereco());
		incidente.setImagem(atributo.getImagem());
		return incidente;
	}
}
