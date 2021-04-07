package projectionusingspringdatajdbc.projection.in.spring.data.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private AddressRepository addressRepository;

    //create student
    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        studentRepository.save(student);
        return "saved";
    }

    @GetMapping("/getStudent")
    public List<StudentProjection> getStudents(){
       return studentRepository.getStudentByNameANId();
    }

    @GetMapping("/getStudentAdd")
    public List<StudentProjection> getStudentsAndAddress(){
        return studentRepository.getStudentAndAddress();
    }


    @PostMapping("/addAddress")
    public String addAddress(@RequestBody Address address){
        addressRepository.save(address);
        return "saved";
    }

    @GetMapping("/getAddress")
    public List<AddressProjection> getAddress(){
        return addressRepository.findAddressByCityAndState();
    }
}
