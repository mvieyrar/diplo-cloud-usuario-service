package unam.diplomado.pixup.usuarioservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import unam.diplomado.pixup.usuarioservice.domain.Usuario;
import unam.diplomado.pixup.usuarioservice.dto.RegistroUsuarioRequest;
import unam.diplomado.pixup.usuarioservice.service.UsuarioService;

@Controller
public class UsuarioController implements UsuarioApi{

	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public Usuario registrarUsuario(RegistroUsuarioRequest request) {
		return usuarioService.registrarUsuario(request.getUsuario(), request.getDomicilio());
	}

}
