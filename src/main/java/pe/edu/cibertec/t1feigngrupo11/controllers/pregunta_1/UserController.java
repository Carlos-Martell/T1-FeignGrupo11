package pe.edu.cibertec.t1feigngrupo11.controllers.pregunta_1;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1feigngrupo11.restclient.placeholders.model.pregunta_1.UserPlaceHolder;
import pe.edu.cibertec.t1feigngrupo11.services.pregunta_1.UserService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<UserPlaceHolder>> listar() {
        List<UserPlaceHolder> users = userService.getUsuariosConUserIdPar();
        return ResponseEntity.ok(users);
    }
}
