package com.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/students")
public class StudentQuery {

    @Autowired  //(Make Object)
            StudentImp studentImp;

    @GetMapping
    private List<Student> readStudents() {

        return studentImp.findAll();
    }

    @PostMapping
    private List<Student> createStudents(@RequestBody Student student) {
        studentImp.save(student);

        return studentImp.findAll();
    }

    @PutMapping(path = "/{id}")
    private List<Student> updateStudents(@PathVariable Integer id, @RequestBody Student student) {



        studentImp.save(student);
        return studentImp.findAll();
    }

    @DeleteMapping(path = "/{id}")
    private List<Student> deleteStudents(@PathVariable Integer id) {

        studentImp.deleteById(id);

        return studentImp.findAll();
    }
}
