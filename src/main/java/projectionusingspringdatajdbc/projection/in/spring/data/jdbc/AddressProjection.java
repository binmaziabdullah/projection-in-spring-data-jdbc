package projectionusingspringdatajdbc.projection.in.spring.data.jdbc;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressProjection {
    private String city;
    private String state;
    @JsonIgnore
    private String country;
}
