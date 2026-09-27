package pe.edu.cibertec.t1feigngrupo11.services.pregunta_1;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1feigngrupo11.restclient.placeholders.iclients.pregunta_1.UserClient;
import pe.edu.cibertec.t1feigngrupo11.restclient.placeholders.model.pregunta_1.UserPlaceHolder;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserService {

    private final UserClient userClient;

    /**
     * La API https://jsonplaceholder.typicode.com/users no expone un atributo "userid",
     * por lo que el "userid" del enunciado corresponde al campo "id" de la respuesta.
     * Se obtiene la lista completa de usuarios y se devuelven los que tienen userid par.
     */
    public List<UserPlaceHolder> getUsuariosConUserIdPar() {
        List<UserPlaceHolder> usuarios = userClient.getUsers();
        List<UserPlaceHolder> usuariosFiltrados = usuarios.stream()
                .filter(usuario -> esUserIdPar(usuario.getId()))
                .toList();
        log.info("Usuarios recibidos: {} | usuarios con userid par: {}",
                usuarios.size(), usuariosFiltrados.size());
        return usuariosFiltrados;
    }

    private boolean esUserIdPar(int userId) {
        return userId % 2 == 0;
    }
}
