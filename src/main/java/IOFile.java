package main.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.RFC4180Parser;
import com.opencsv.RFC4180ParserBuilder;
import com.opencsv.bean.CsvToBeanBuilder;

public class IOFile {
	public static List<Book> readCSV(String path) throws FileNotFoundException {
		RFC4180Parser rfc4180Parser = new RFC4180ParserBuilder().build();
		CSVReader csvReader = new CSVReaderBuilder(new FileReader(path)).withCSVParser(rfc4180Parser).build();
		return new CsvToBeanBuilder<Book>(csvReader).withType(Book.class).build().parse(); 
	}
}
