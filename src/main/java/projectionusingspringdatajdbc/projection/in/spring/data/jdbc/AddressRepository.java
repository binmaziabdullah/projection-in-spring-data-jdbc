package projectionusingspringdatajdbc.projection.in.spring.data.jdbc;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

    @Query(value = "SELECT a.city as city, a.state as state FROM Address a")
    List<AddressProjection> findAddressByCityAndState();
}
