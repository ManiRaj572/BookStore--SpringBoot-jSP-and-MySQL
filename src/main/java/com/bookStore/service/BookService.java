package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.Books;
import com.bookStore.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepo;
	
	public void save(Books b) {
		bookRepo.save(b);
	}
	
	public List<Books> getAllBook(){
		return bookRepo.findAll();
	}
	
	public Books getBookById(int id) {
		return bookRepo.findById(id).get();
	}
	public void deleteById(int id) {
		bookRepo.deleteById(id);
	}
}
