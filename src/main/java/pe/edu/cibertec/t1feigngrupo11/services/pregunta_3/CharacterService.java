package pe.edu.cibertec.t1feigngrupo11.services.pregunta_3;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import pe.edu.cibertec.t1feigngrupo11.restclient.placeholders.iclients.pregunta_3.CharacterClient;
import pe.edu.cibertec.t1feigngrupo11.restclient.placeholders.model.pregunta_3.Character;
import pe.edu.cibertec.t1feigngrupo11.restclient.placeholders.model.pregunta_3.CharacterRM;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CharacterService {
    private final CharacterClient characterClient;

    public List<Character> getCharactersfilter() {
         CharacterRM characterRM = characterClient.getCharacters("alive","human");
         return characterRM.getResults();
    }
}
