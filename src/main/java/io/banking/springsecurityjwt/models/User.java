package io.banking.springsecurityjwt.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "users")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Field("_id")
    @JsonProperty("_id")
    private String id;
    private String username;
    private String password;

}
