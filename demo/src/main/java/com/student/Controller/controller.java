package com.student.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.student.Entity.student;
import com.student.Repository.StudentRepository;

@Controller
public class controller {

	@Autowired
	private StudentRepository repo;
	
	@GetMapping("/students")
	public ResponseEntity<List<student>> getUsers()
	{
		List<student> list=(List<student>)repo.findAll();
		return ResponseEntity.of(Optional.of(list));		
	}
	
	@GetMapping("/students/id/{id}")
	public ResponseEntity<student> getUserByID(@PathVariable( "id")int id)
	{
		student s=repo.getStudentById(id);
		
		return ResponseEntity.of(Optional.of(s));
				
	}
	
	@GetMapping("/students/name/{name}")
	public ResponseEntity<student> getUserByName(@PathVariable( "name")String name)
	{
		student s=repo.getStudentByName(name);
		
		return ResponseEntity.of(Optional.of(s));
				
	}
	@RequestMapping(value = "/home")
	public String frontPage(Model m)
	{
		System.out.println("into frontEnd page");
		//m.addAttribute("name","Ashish Singh");
		return "check";
	}
	
    @GetMapping("/getStudent")
	public ResponseEntity<student> getUserByIdOnHTMLPage(@RequestParam("StudentID")int id)
	{
		student s=repo.getStudentById(id);
		
		return ResponseEntity.of(Optional.of(s));
				
	}
	
	@GetMapping("/each")
	public String eachStudent(@RequestParam("StudentID")int id,Model m)
	{
		boolean idExist=repo.existsById(id);
		student s=repo.getStudentById(id);
		
		if(idExist==false)
		{
			m.addAttribute("noRecord"," No Record found with Id = "+ id);
			return "noRecord";
		}
			
		else
		{
		   m.addAttribute("name",s.getStudentName());
		   m.addAttribute("Id",s.getStudentID());
		   m.addAttribute("age",s.getStudentAge());
		   m.addAttribute("address",s.getStudentAdress());
		   m.addAttribute("branch",s.getStudentBranch());
		   m.addAttribute("college",s.getStudentCollege());
		   m.addAttribute("gmail",s.getStudentGmail());
		   m.addAttribute("phone",s.getStudentNumber());
		   m.addAttribute("Id1",s.getStudentID());
		}
		//m.addAttribute("name","Ashish Singh");
		return "EachStudent";
	}

}
