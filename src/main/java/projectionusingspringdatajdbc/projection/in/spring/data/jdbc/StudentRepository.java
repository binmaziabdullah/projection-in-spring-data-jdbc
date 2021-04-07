package projectionusingspringdatajdbc.projection.in.spring.data.jdbc;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {

    @Query(value = "select s.name as name , s.id as id from student s")
    List<StudentProjection> getStudentByNameANId();

    @Query(value = "select s.id as id, s.name as name , " +
            "a.city as city ,a.state as state,a.country as country " +
            "from student s " +
            "inner join address a on s.add_id = a.add_id")
    List<StudentProjection> getStudentAndAddress();
}
