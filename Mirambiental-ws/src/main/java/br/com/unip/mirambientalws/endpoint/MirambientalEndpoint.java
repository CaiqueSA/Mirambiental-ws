package br.com.unip.mirambientalws.endpoint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import br.com.unip.mirambientalws.modelo.AlterarIncidenteRequest;
import br.com.unip.mirambientalws.modelo.AlterarIncidenteResponse;
import br.com.unip.mirambientalws.modelo.AutenticarUsuarioRequest;
import br.com.unip.mirambientalws.modelo.AutenticarUsuarioResponse;
import br.com.unip.mirambientalws.modelo.BuscarIncidenteRequest;
import br.com.unip.mirambientalws.modelo.BuscarIncidenteResponse;
import br.com.unip.mirambientalws.modelo.BuscarIncidentesRequest;
import br.com.unip.mirambientalws.modelo.BuscarIncidentesResponse;
import br.com.unip.mirambientalws.modelo.DeletarIncidenteRequest;
import br.com.unip.mirambientalws.modelo.DeletarIncidenteResponse;
import br.com.unip.mirambientalws.modelo.Incidente;
import br.com.unip.mirambientalws.modelo.IncidenteAtributo;
import br.com.unip.mirambientalws.modelo.IncluirIncidenteRequest;
import br.com.unip.mirambientalws.modelo.IncluirIncidenteResponse;
import br.com.unip.mirambientalws.modelo.IncluirUsuarioRequest;
import br.com.unip.mirambientalws.modelo.IncluirUsuarioResponse;
import br.com.unip.mirambientalws.modelo.Usuario;
import br.com.unip.mirambientalws.modelo.UsuarioExisteRequest;
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

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "usuarioExisteRequest")
	@ResponsePayload
	public UsuarioExisteResponse usuarioExiste(@RequestPayload UsuarioExisteRequest request) {
		UsuarioExisteResponse response = new UsuarioExisteResponse();
		List<Usuario> usuarios = mirambientalUsuarioRepository.findBynomeUsuario(request.getUsuario().getNomeUsuario());
		if (usuarios.size() > 0) {
			response.setCodigo(01);
			response.setDescricao("Usuário já existe!");
		} else {
			response.setCodigo(0);
			response.setDescricao("Usuário não existe!");
		}
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "incluirUsuarioRequest")
	@ResponsePayload
	public IncluirUsuarioResponse incluirUsuario(@RequestPayload IncluirUsuarioRequest request) {
		IncluirUsuarioResponse response = new IncluirUsuarioResponse();
		try {
			Usuario usuario = UtilConvert.convertUsuario(request.getUsuario());
			mirambientalUsuarioRepository.save(usuario);
			response.setCodigo(01);
			response.setDescricao("Usuário " + usuario.getNomeUsuario() + ", incluido com sucesso!");
		} catch (Exception e) {
			response.setCodigo(03);
			response.setDescricao("Falha ao incluir o usuário " + request.getUsuario().getNomeUsuario());
			e.printStackTrace();
		}
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "autenticarUsuarioRequest")
	@ResponsePayload
	public AutenticarUsuarioResponse autenticarUsuario(@RequestPayload AutenticarUsuarioRequest request) {
		AutenticarUsuarioResponse response = new AutenticarUsuarioResponse();
		try {
			Usuario usuario = UtilConvert.convertUsuario(request.getUsuario());
			List<Usuario> usuarios = mirambientalUsuarioRepository.findBynomeUsuario(usuario.getNomeUsuario());
			if (usuarios.size() == 0) {
				response.setCodigo(02);
				response.setDescricao("Usuario " + usuario.getNomeUsuario() + " não existe!");

			} else {
				if (usuarios.get(0).getSenhaUsuario().equals(usuario.getSenhaUsuario())) {
					response.setCodigo(01);
					response.setDescricao("Usuário " + usuario.getNomeUsuario() + ", autenticado com sucesso!");
				} else {
					response.setCodigo(02);
					response.setDescricao("Senha invalida!");
				}
			}

		} catch (Exception e) {
			response.setCodigo(01);
			response.setDescricao("Falha ao coletar informações do usuario: " + request.getUsuario().getNomeUsuario());
			e.printStackTrace();
		}
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "incluirIncidenteRequest")
	@ResponsePayload
	public IncluirIncidenteResponse incluirIncidente(@RequestPayload IncluirIncidenteRequest request) {
		IncluirIncidenteResponse response = new IncluirIncidenteResponse();
		try {
			mirambientalIncidenteRepository.save(UtilConvert.convertIncidente(request.getIncidente()));
			response.setCodigo(01);
			response.setDescricao("Incidente, incluido com sucesso!");
		} catch (Exception e) {
			response.setCodigo(03);
			response.setDescricao("Falha ao incluir incidente ");
			e.printStackTrace();
		}
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "alterarIncidenteRequest")
	@ResponsePayload
	public AlterarIncidenteResponse alterarIncidente(@RequestPayload AlterarIncidenteRequest request) {
		AlterarIncidenteResponse response = new AlterarIncidenteResponse();
		try {
			mirambientalIncidenteRepository.save(UtilConvert.convertIncidente(request.getIncidente()));
			response.setCodigo(01);
			response.setDescricao("Incidente, alterado com sucesso!");
		} catch (Exception e) {
			response.setCodigo(03);
			response.setDescricao("Falha ao alterado incidente ");
			e.printStackTrace();
		}
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "deletarIncidenteRequest")
	@ResponsePayload
	public DeletarIncidenteResponse deletarIncidente(@RequestPayload DeletarIncidenteRequest request) {
		DeletarIncidenteResponse response = new DeletarIncidenteResponse();
		try {
			mirambientalIncidenteRepository.delete(UtilConvert.convertIncidente(request.getIncidente()));
			response.setCodigo(01);
			response.setDescricao("Incidente, deletado com sucesso!");
		} catch (Exception e) {
			response.setCodigo(03);
			response.setDescricao("Falha ao deletar incidente ");
			e.printStackTrace();
		}
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "buscarIncidenteRequest")
	@ResponsePayload
	public BuscarIncidenteResponse buscarIncidente(@RequestPayload BuscarIncidenteRequest request) {
		BuscarIncidenteResponse response = new BuscarIncidenteResponse();
		try {
			List<Incidente> incidentes = mirambientalIncidenteRepository
					.findByidIncidente(UtilConvert.convertIncidente(request.getIncidente()).getIdIncidente());
			if (incidentes.size() == 0) {
				response.setCodigo(02);
				response.setDescricao("Incidente não encontrado!");

			} else {
				List<IncidenteAtributo> incidentesAtributo = new ArrayList<IncidenteAtributo>();
				for (Incidente incidente : incidentes) {
					incidentesAtributo.add(UtilConvert.convertIncidente(incidente));
				}
				response.getRetornoBusca().addAll(incidentesAtributo);
				response.setCodigo(01);
				response.setDescricao("Incidente(s) encontrado(s)");
			}

		} catch (Exception e) {
			response.setCodigo(01);
			response.setDescricao("Falha ao buscarIncidente");
			e.printStackTrace();
		}
		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "buscarIncidentesRequest")
	@ResponsePayload
	public BuscarIncidentesResponse buscarIncidentes(@RequestPayload BuscarIncidentesRequest request) {
		BuscarIncidentesResponse response = new BuscarIncidentesResponse();
		try {
			List<Incidente> incidentes = (List<Incidente>) mirambientalIncidenteRepository.findAll();
			if (incidentes.size() == 0) {
				response.setCodigo(02);
				response.setDescricao("Incidente não encontrado!");

			} else {
				List<IncidenteAtributo> incidentesAtributo = new ArrayList<IncidenteAtributo>();
				for (Incidente incidente : incidentes) {
					incidentesAtributo.add(UtilConvert.convertIncidente(incidente));
				}
				response.getRetornoBusca().addAll(incidentesAtributo);
				response.setCodigo(01);
				response.setDescricao("Incidente(s) encontrado(s)");
			}

		} catch (Exception e) {
			response.setCodigo(01);
			response.setDescricao("Falha ao buscarIncidente");
			e.printStackTrace();
		}
		return response;
	}
}
