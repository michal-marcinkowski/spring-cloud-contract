package dev.cloudility.cdc.model.input;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreatePetRequest {

    public String name;
    public int age;

}
