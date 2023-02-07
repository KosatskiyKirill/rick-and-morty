package test.springboot.rickandmortyapp.dto.mapper;

import org.springframework.stereotype.Component;
import test.springboot.rickandmortyapp.dto.ApiCharacterDto;
import test.springboot.rickandmortyapp.model.Gender;
import test.springboot.rickandmortyapp.model.MovieCharacter;
import test.springboot.rickandmortyapp.model.Status;

@Component
public class MovieCharacterMapper {
    public MovieCharacter parseApiCharacterResponseDto(ApiCharacterDto dto) {
        MovieCharacter movieCharacter = new MovieCharacter();
        movieCharacter.setName(dto.getName());
        movieCharacter.setGender(Gender.valueOf(dto.getGender().toUpperCase()));
        movieCharacter.setStatus(Status.valueOf(dto.getStatus().toUpperCase()));
        movieCharacter.setExternalId(dto.getId());

        return movieCharacter;
    }
}
