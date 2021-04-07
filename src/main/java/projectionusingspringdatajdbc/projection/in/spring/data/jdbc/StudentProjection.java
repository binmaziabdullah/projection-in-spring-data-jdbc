package projectionusingspringdatajdbc.projection.in.spring.data.jdbc;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentProjection {
    private Long id;
    private String name;
    private String state;
    private String city;
    private String country;

}
