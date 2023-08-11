package homework3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

import homework2.CreateCommand;
import homework2.ListCommand;

public class FileZipperS018752 {

	public static void main(String[] args) throws Exception {
	
		
		Welcome le = new Welcome();
		le.doing();
	
		//First of all, I had the file that wrote the sentences read and saved them with special keys.
		 //I threw it. When I ran the zip command, I printed the file with the special keys I assigned to them and reduced the size of the file. 
		 //I also read the zipped file with the unzip method and replaced the private keys with words, so it was restored.
		
		
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Enter the Command: ");
		
		String command = sc.next();
	
		if(command.equals("zip")) {
			
		Operations zip = new Zip();
	
		zip.zip();
	
		}else if(command.equals("unzip")) {
	Operations unzip = new Unzip();
	    		
	  unzip.unzip();
		}
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	}
}


}