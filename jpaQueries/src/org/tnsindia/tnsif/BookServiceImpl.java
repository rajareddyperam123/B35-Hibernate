package org.tnsindia.tnsif;

import java.util.List;

public class BookServiceImpl extends BookService {
private BookServiceImpl dao;
	

	public BookServiceImpl() {
		super();
		dao=new BookServiceImpl();
	}

	@Override
	public Book getBookById(int id) {
		
		return dao.getBookById(id);
	}

	@Override
	public org.tnsindia.tnsif.List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}

	@Override
	public List<Book> getAuthorBooks(String author) {
		// TODO Auto-generated method stub
		return dao.getAuthorBooks(author);
	}

	@Override
	public Long getBooksCount() {
		// TODO Auto-generated method stub
		return dao.getBooksCount();
	}

	@Override
	public List<Book> getBookByPrice(int low, int high) {
		// TODO Auto-generated method stub
		return dao.getBookByPrice(low, high);
	}


}
