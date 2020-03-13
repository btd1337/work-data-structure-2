package main.java;

import com.opencsv.bean.CsvBindByName;

public class Book {
	@CsvBindByName
	private String ISBN;
	
	@CsvBindByName
	private String Title;
	
	@CsvBindByName
	private String Author;
	
	@CsvBindByName
	private int Year;
	
	@CsvBindByName
	private String Publisher;
	
	@CsvBindByName
	private String Blurb;

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public String getBlurb() {
		return Blurb;
	}

	public void setBlurb(String blurb) {
		Blurb = blurb;
	}

	@Override
	public String toString() {
		return "ISBN=" + ISBN + ", Title=" + Title + ", Author=" + Author + ", Year=" + Year + ", Publisher="
				+ Publisher + ", Blurb=" + Blurb;
	}
	
	
}
