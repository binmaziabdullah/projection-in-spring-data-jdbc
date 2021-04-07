package projectionusingspringdatajdbc.projection.in.spring.data.jdbc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentProjection {
    private Long id;
    private String name;
    private Long add_id;
    private String state;
    private String city;
    private String country;

}
