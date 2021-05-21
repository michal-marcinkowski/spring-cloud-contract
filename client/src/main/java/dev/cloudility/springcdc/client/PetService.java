package dev.cloudility.springcdc.client;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
class PetService {

    private final RestTemplate restTemplate;

    boolean exists(final int id) {
        return restTemplate.getForEntity("http://localhost:8080/pets/"+id, String.class).getStatusCode().is2xxSuccessful();
    }

}