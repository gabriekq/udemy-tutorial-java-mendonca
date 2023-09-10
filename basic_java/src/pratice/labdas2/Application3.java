package pratice.labdas2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Application3 {

	public static void main(String[] args) throws IOException {
		
	Stream<String>  lines = Files.lines(Paths.get("myfile.txt"));
	
	lines
	.filter(line -> line.length() > 6  )
	.sorted()
	.forEach(x -> System.out.println(x)  );
	
	lines.close();
	

	}

}
