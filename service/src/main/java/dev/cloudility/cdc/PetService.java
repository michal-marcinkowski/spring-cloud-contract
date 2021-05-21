package dev.cloudility.cdc;

import dev.cloudility.cdc.model.Pet;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
class PetService {

    private final PetsRepository repository;

    List<Pet> getPets() {
        final List<Pet> result = new ArrayList<>();
        repository.findAll().forEach(result::add);
        return result;
    }

    public Pet createPet(final String name, final int age) {
        final Pet pet = new Pet(getPets().stream().mapToInt(Pet::getId).max().orElse(0) + 1, name, age);
        repository.save(pet);
        return pet;
    }

    public Pet get(int id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("nothing here"));
    }

}
