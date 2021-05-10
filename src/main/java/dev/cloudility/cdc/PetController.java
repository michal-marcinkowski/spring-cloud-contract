package dev.cloudility.cdc;


import dev.cloudility.cdc.model.Pet;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PetController {

    private final PetService petService;

    @GetMapping(path = "pets", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pet> getPets() {
        return petService.getPets();
    }

}

