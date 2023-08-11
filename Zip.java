package homework3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;



public class Zip extends Operations{
	
	
	
	
public void zip() throws Exception {
	
	

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Source: ");
	
	 source = sc.next();
	

		System.out.println("Enter the Destination: ");
		
		 destination = sc.next();
	
	
	
	
	
	
	keygen();

	File file = new File(source);
	Scanner in = new Scanner(file);
	
	
	while(in.hasNext()) {
		String word =in.next();	
		words.add(word);	
	}
	
	

	keysput();
	

	duplicatesdeleting();
	

	
	File filenew = new File(destination);

	PrintWriter out = new PrintWriter(destination);
	
	
	for(int i =0; i <newwords.size(); i++) {
		
		if(keys.containsKey(words.get(i))) {
			out.println(newwords.get(i) + ":" + keys.get(words.get(i)));
		
		}

		}
		out.println("*");

	
	out.println("Content:");
		for(int i =0; i <words.size(); i++) {
	
	if(keys.containsKey(words.get(i))) {
		out.print(keys.get(words.get(i)));
	
	}

	}
	
	out.close();
	
	
	if(filenew.length() == file.length()) {
		
		filenew.delete();
		
		throw new Exception("It is not feasible to zip this file. Because file size " + file.length() + " And zipped File size "+ filenew.length());
	}

	
	
if(words.size() == newwords.size()) {
	throw new Exception("It is not feasible to zip this file. Because all the words are distinct.”");
}
	
	
	
	

}
	
	}


		





















