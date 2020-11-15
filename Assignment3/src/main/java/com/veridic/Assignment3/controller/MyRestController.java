package com.veridic.Assignment3.controller;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veridic.Assignment3.Pojo.Student;

@RestController
@RequestMapping("/veridic")
public class MyRestController {
	private List<Student> list = new LinkedList();

	@PostConstruct
	private void loadStudents() {
		list.add(new Student("lalit", 1));
		list.add(new Student("priya", 2));
	}

	@GetMapping(value = "/students", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	// @GetMapping("/getStudents")
	public List<Student> showStudents() {
		// System.out.println(list.get(0));
		return list;
	}

	@PostMapping("/students")
	public void addStudent(@RequestBody Student stu) {
		list.add(stu);
	}

	@PutMapping("/students/{updateById}")
	public void updateStudent(@PathVariable int searchById, @RequestBody Student stu) {

		for (Student s : list) {
			if (s.getRollno() == searchById) {
				list.set(list.indexOf(s), stu);
			}
		}
	}

	@DeleteMapping("/students/{deleteById}")
	public void deleteStudent(@PathVariable int searchById) {

		for (Student s : list) {
			if (s.getRollno() == searchById) {
				list.remove(list.indexOf(s));
			}
		}
	}
}
