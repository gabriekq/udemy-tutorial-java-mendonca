package com.mendonca;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;


public class FP05Files {

	public static void main(String[] args) throws IOException {
		
		
		Files.lines(Paths.get("file.txt"))
		.map(str -> str.split(" "))
		.flatMap(Arrays::stream)
		.distinct()
		.forEach(a -> System.out.println(a));
		
		Files.list(Paths.get("."))
		.filter(Files::isDirectory)
		.forEach(a -> System.out.println(a));

	}

}
