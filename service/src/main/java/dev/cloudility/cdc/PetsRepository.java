package dev.cloudility.cdc;

import dev.cloudility.cdc.model.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetsRepository extends CrudRepository<Pet, Integer> {

    //marker interface

}
