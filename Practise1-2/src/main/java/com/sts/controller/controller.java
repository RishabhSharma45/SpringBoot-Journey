package com.sts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.entity.Journal;
import com.sts.services.JournalServiceImpl;

@RestController
@RequestMapping("/home")
public class controller {

	@Autowired
	JournalServiceImpl js;
	
	@GetMapping
	public List<Journal> getAllUser() {
		return this.js.getAllUser();
	}
	
	@GetMapping("get/{id}")
	public Optional<Journal> getById(@PathVariable int id) {
		return this.js.getById(id);
	}
	
	@PostMapping("/add")
	public Journal addJournal(@RequestBody Journal j) {
		return this.js.addJournal(j);
	}
	
	@PutMapping("/put")
	public Journal updateJournal(@RequestBody Journal j) {
		return this.js.updateJournal(j);
	}
	
	@DeleteMapping("/del/{id}")
	public void deleteById(@PathVariable int id) {
		this.js.deleteById(id);
	}
	
}
