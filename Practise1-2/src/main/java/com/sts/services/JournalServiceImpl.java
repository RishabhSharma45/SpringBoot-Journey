package com.sts.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sts.entity.Journal;
import com.sts.repository.JournalRepository;

@Service
public class JournalServiceImpl {
   
	@Autowired
	JournalRepository jrp;
	
	public List<Journal> getAllUser() {
		return (List<Journal>) jrp.findAll();
	}
	
	public Optional<Journal> getById(int id) {
		return jrp.findById(id);
	}
	
	public Journal addJournal(Journal j) {
		return jrp.save(j);
	}
	
	public Journal updateJournal(Journal j) {
		return jrp.save(j);
	}
	
	public void deleteById(int id) {
		jrp.deleteById(id);
	}
	
}
