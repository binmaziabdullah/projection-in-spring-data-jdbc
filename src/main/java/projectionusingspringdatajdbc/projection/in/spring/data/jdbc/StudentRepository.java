package projectionusingspringdatajdbc.projection.in.spring.data.jdbc;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {

    @Query(value = "select s.name as name , a.name from student s")
    //@Query(value = "SELECT s.name as name, s.Address.id FROM Student s")
    List<StudentProjection> getStudentByNameANdAddId();
}
