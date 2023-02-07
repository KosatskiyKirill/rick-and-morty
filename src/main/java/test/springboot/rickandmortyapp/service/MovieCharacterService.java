package test.springboot.rickandmortyapp.service;

import test.springboot.rickandmortyapp.model.MovieCharacter;

import java.util.Optional;

public interface MovieCharacterService {
    Optional<MovieCharacter> getRandomInfo();

    Optional<MovieCharacter> getByArgument(String argument);
}
