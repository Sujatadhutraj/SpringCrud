package com.hefshine.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Mycontroller {
	
	@Autowired
	
	StudentRepo studentRepo;
	
	@PostMapping("save")
	 public Student save(@RequestBody Student stud) {
	  Student e=studentRepo.save(stud);
	  return e;
	 }
	 
	 @GetMapping("find")
	 public List<Student>findAllStudent(){
	  List<Student> listAllE=studentRepo.findAll();
	  return listAllE;
	 }
	 
	 @GetMapping("search/{id}")
	 public Student findStudentById(@PathVariable int id) {
	  Student std=studentRepo.findById(id).get();
	  return std;
	 }
	 
	 @GetMapping("delete/{id}")
	 public void deleteStudentById(@PathVariable int id) {
	 studentRepo.deleteById(id);
	 System.out.println("delete done");
	 }
	 
	 @PutMapping("update")
	 public Student update(@RequestBody Student std) {
	  Student std1=studentRepo.save(std);
	  return std1;
	 }
	 
	 
	}


