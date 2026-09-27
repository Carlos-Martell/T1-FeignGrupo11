package pe.edu.cibertec.t1feigngrupo11.controllers.pregunta_3;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1feigngrupo11.restclient.placeholders.model.pregunta_3.Character;
import pe.edu.cibertec.t1feigngrupo11.services.pregunta_3.CharacterService;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/character")
public class CharacterController {
    private final CharacterService  characterService;

    @GetMapping
    public ResponseEntity<?> listar() {
        List<Character> characters = characterService.getCharactersfilter();
        return ResponseEntity.ok(characters);
    }
}
