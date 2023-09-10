package com.mendonca.part9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) throws IOException {
		
		String path ="D:\\Programacao\\WorkSpaces-List\\Workspace-udemy\\GenericsReflectionsColectionsMendonca\\src\\com\\mendonca\\part9\\names";
		

		
		 Stream<String> namesStream  =  Files.lines(Paths.get(path));
		
       //  namesStream.forEach(System.out::println);
		 
		 List<String> names = namesStream.filter(value -> value.startsWith("a") ).collect(Collectors.toList());
		 System.out.println(names);
	}

}
