package main.java;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("Lendo CSV...");
			List<Book> books = IOFile.readCSV("data.csv");
			for (Book book : books) {
				System.out.println(book.toString());
			}
		} catch (FileNotFoundException erro) {
			System.out.println(erro.toString());
		}
		
	}
}
