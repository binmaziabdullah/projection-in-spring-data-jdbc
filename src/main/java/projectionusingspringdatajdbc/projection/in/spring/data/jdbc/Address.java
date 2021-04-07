package projectionusingspringdatajdbc.projection.in.spring.data.jdbc;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("address")
@Data
public class Address {

    @Id
    private Long addId;
    private String state;
    private String city;
    private String country;

}
