package dev.cloudility.cdc;

import dev.cloudility.cdc.model.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
class PetConfig {

    @Bean
    List<Pet> pets() {
        return List.of(new Pet("Stachu", 5), new Pet("Rysiek", 1));
    }
}
