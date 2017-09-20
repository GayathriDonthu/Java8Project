package com.java8.streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class ReadingFile {
	
	public static void main(String[] args) throws IOException{
		
		String fileName = "src/main/resources/Spring Notes.txt";
		
		// before Java 8 
		FileReader file;
		try {
			file = new FileReader(fileName);
			BufferedReader br = new BufferedReader(file);
			while(br.readLine() != null){
				System.out.println(br.readLine());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// in Java 8
		
		final Path path = new File(fileName).toPath();
		try( Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)) {
			lines.onClose( () -> System.out.println("Done!")).forEach(System.out::println);
		}
			
	}
	
}
