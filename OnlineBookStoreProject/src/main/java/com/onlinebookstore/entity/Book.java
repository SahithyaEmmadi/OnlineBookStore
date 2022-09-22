package com.onlinebookstore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Book {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int bookId;
private String bookName;
private String Authorname;
private int bookprice;
private int bookquantity;

@ManyToOne
@JoinColumn(name="CustomerId")
private Customer customer;

public Customer getCustomer() {
	return customer;
}

public int getBookId() {
	return bookId;
}

public void setBookId(int bookId) {
	this.bookId = bookId;
}

public String getBookName() {
	return bookName;
}

public void setBookName(String bookName) {
	this.bookName = bookName;
}

public String getAuthorname() {
	return Authorname;
}

public void setAuthorname(String authorname) {
	Authorname = authorname;
}

public int getBookprice() {
	return bookprice;
}

public void setBookprice(int bookprice) {
	this.bookprice = bookprice;
}

public int getBookquantity() {
	return bookquantity;
}

public void setBookquantity(int bookquantity) {
	this.bookquantity = bookquantity;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}

}
