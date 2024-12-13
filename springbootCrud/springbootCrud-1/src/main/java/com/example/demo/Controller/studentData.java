package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.studentEntity;

import com.example.demo.Repository.studentRepos;

@RestController
public class studentData {
	
	@Autowired
	studentRepos repo;
           
	@GetMapping("/getall")
	public List<studentEntity> getAll(){
		List<studentEntity> student = repo.findAll(); 
		return student;
		
	}
	
	@GetMapping("/getById/{rollNo}")
	public studentEntity getById(@PathVariable int rollNo) {
		studentEntity student = repo.findById(rollNo).get();
		return student;
		}
		
	@PostMapping("/add")
	public void add(@RequestBody studentEntity student) {
		repo.save(student);
	}
	
	@PutMapping("/update/{rollNo}")
	public studentEntity update(@PathVariable int rollNo) {
		studentEntity student = repo.findById(rollNo).get();
		student.setName("soundhu");
		return student;
		
	}
	
	@DeleteMapping("/delete/{rollNo}")
	public void delete(@PathVariable int rollNo) {
		studentEntity student = repo.findById(rollNo).get();
		repo.delete(student);
	}
}
