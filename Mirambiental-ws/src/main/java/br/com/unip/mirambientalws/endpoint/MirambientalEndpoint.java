package br.com.unip.mirambientalws.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.com.unip.mirambientalws.modelo.Incidente;
import br.com.unip.mirambientalws.modelo.MirambientalBuscaResponse;
import br.com.unip.mirambientalws.modelo.MirambientalResponse;
import br.com.unip.mirambientalws.modelo.TipoIncidente;
import br.com.unip.mirambientalws.modelo.Usuario;
import br.com.unip.mirambientalws.modelo.UsuarioExisteResponse;
import br.com.unip.mirambientalws.repository.MirambientaUsuariolRepository;
import br.com.unip.mirambientalws.repository.MirambientalIncidenteRepository;

@Endpoint
public class MirambientalEndpoint {

	private static final String NAMESPACE_URI = "modelo.mirambientalws.unip.com.br";

	private MirambientaUsuariolRepository mirambientalUsuarioRepository;

	private MirambientalIncidenteRepository mirambientalIncidenteRepository;

	@Autowired
	public MirambientalEndpoint(MirambientaUsuariolRepository mirambientalRepository,
			MirambientalIncidenteRepository mirambientalIncidenteRepository) {
		this.mirambientalUsuarioRepository = mirambientalRepository;
		this.mirambientalIncidenteRepository = mirambientalIncidenteRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "usuarioExiste")
	@ResponsePayload
	public UsuarioExisteResponse usuarioExiste(@RequestPayload Usuario usuario) {
		UsuarioExisteResponse response = new UsuarioExisteResponse();
		boolean existe = mirambientalUsuarioRepository.verificarUsuarioExiste(usuario);
		response.setExiste(existe);
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "incluirUsuario")
	@ResponsePayload
	public MirambientalResponse incluirUsuario(@RequestPayload Usuario usuario) {
		return mirambientalUsuarioRepository.incluirUsuario(usuario);
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "autenticarUsuario")
	@ResponsePayload
	public MirambientalResponse autenticarUsuario(@RequestPayload Usuario usuario) {
		return mirambientalUsuarioRepository.autenticarUsuario(usuario);
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "incluirIncidente")
	@ResponsePayload
	public MirambientalResponse incluirIncidente(@RequestPayload Usuario usuario, Incidente incidente,
			TipoIncidente tipoIncidente) {
		return mirambientalIncidenteRepository.incluirIncidente(usuario, incidente, tipoIncidente);
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "alterarIncidente")
	@ResponsePayload
	public MirambientalResponse alterarIncidente(@RequestPayload Incidente incidente) {
		return mirambientalIncidenteRepository.alterarIncidente(incidente);
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "buscarIncidente")
	@ResponsePayload
	public MirambientalBuscaResponse buscarIncidente(@RequestPayload Incidente incidente) {
		return mirambientalIncidenteRepository.buscarIncidente(incidente);
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "buscarIncidentes")
	@ResponsePayload
	public MirambientalBuscaResponse buscarIncidentes() {
		return mirambientalIncidenteRepository.buscarIncidentes();
	}
}
