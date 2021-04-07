package projectionusingspringdatajdbc.projection.in.spring.data.jdbc;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {

    @Query(value = "select s.name as name , s.id as id from student s")
    List<StudentProjection> getStudentByNameANId();

    /*here we are using inner join to linked or join two table
    i.e student and address using some predicate (common data/column) in our case
    it is add_id column which is same in both the tables and also add_id is a foreign key.
    in student table.

    and we can use "using" clause if we have same column in both the
    table(we have same table add_id in both the table)*/

    @Query(value = "select s.id as id, s.name as name , a.city as city, a.state as state, a.country as country from Student s inner join address a using(add_id)")
    List<StudentProjection> getStudentAndAddress();
}
