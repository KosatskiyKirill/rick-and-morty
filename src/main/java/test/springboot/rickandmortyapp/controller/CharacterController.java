package test.springboot.rickandmortyapp.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import test.springboot.rickandmortyapp.model.MovieCharacter;
import test.springboot.rickandmortyapp.service.MovieCharacterService;

@Log4j2
@RestController
@RequestMapping("/info")
public class CharacterController {
    private final MovieCharacterService movieCharacterService;

    public CharacterController(MovieCharacterService movieCharacterService) {
        this.movieCharacterService = movieCharacterService;
    }

    @GetMapping("/random")
    public ResponseEntity<MovieCharacter> getRandomInfo() {
        return movieCharacterService.getRandomInfo()
                .map(ResponseEntity::ok)
                .orElseGet(ResponseEntity.notFound()::build);
    }

    @GetMapping
    public ResponseEntity<MovieCharacter> getCharacterByArgument(@RequestParam(name = "argument") String argument) {
        return movieCharacterService.getByArgument(argument)
                .map(ResponseEntity::ok)
                .orElseGet(ResponseEntity.notFound()::build);
    }
}
