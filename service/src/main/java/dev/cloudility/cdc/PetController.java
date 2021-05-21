package dev.cloudility.cdc;


import dev.cloudility.cdc.model.Pet;
import dev.cloudility.cdc.model.input.CreatePetRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "pets", produces = MediaType.APPLICATION_JSON_VALUE)
public class PetController {

    private final PetService petService;

    @GetMapping
    public List<Pet> getPets() {
        return petService.getPets();
    }

    @GetMapping(path = "/{id}")
    public Pet getPet(final @PathVariable int id) {
        return petService.get(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> addPet(final @RequestBody CreatePetRequest createPetRequest) {
        final int id = petService.createPet(createPetRequest.getName(), createPetRequest.getAge()).getId();

        return ResponseEntity.created(createLocationHeaderValue(id)).build();
    }

    private URI createLocationHeaderValue(final int id) {
        return ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(id)
                .toUri();
    }

}

