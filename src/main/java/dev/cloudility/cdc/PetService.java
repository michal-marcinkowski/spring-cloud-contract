package dev.cloudility.cdc;

import dev.cloudility.cdc.model.Pet;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
class PetService {

    private final List<Pet> pets;

    List<Pet> getPets() {
        return new ArrayList<>(pets);
    }

}
