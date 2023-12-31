package pratice.processingfiles.advanced;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
        File file = new File("myfile.txt");

		
		try (FileReader fileReader = new FileReader(file);
			 BufferedReader	bufferedReader = new BufferedReader(fileReader);  ) {

			String line = bufferedReader.readLine();

			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}

		} catch (FileNotFoundException fileNotFoundException) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("problem to reading the file");

		} 

	}

}
