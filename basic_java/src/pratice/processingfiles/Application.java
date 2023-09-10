package pratice.processingfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		try {

			Scanner input = new Scanner(new File("c:\\file.txt"));

			while (input.hasNext()) {

				String line = input.nextLine();

				System.out.println(line);
			}
			input.close();

		} catch (FileNotFoundException fileNotFoundException) {
			System.out.println("fileNotFoundException" + fileNotFoundException.toString());
		}

		MyFileUtils myFileUtils = new MyFileUtils();

		try {
			myFileUtils.subtract10FromLargerNumber(9);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
