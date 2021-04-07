package projectionusingspringdatajdbc.projection.in.spring.data.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private final StudentRepository studentRepository;

    @Autowired
    private final AddressRepository addressRepository;

    public MainController(StudentRepository studentRepository, AddressRepository addressRepository) {
        this.studentRepository = studentRepository;
        this.addressRepository = addressRepository;
    }

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        studentRepository.save(student);
        return "saved";
    }

    @GetMapping("/getStudentByNameAndId")
    public List<StudentProjection> getStudents(){
       return studentRepository.getStudentByNameANId();
    }

    @GetMapping("/getStudentAndAddress")
    public List<StudentProjection> getStudentsAndAddress(){
        return studentRepository.getStudentAndAddress();
    }


    @PostMapping("/addAddress")
    public String addAddress(@RequestBody Address address){
        addressRepository.save(address);
        return "saved";
    }

    @GetMapping("/getAddressByCityAndState")
    public List<AddressProjection> getAddress(){
        return addressRepository.findAddressByCityAndState();
    }
}
