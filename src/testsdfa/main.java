package testsdfa;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.io.Reader;
import java.util.Scanner;

public class main {

	  public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   
		File file = new File("C:\\dasadsdsa.txt");
        FileInputStream stream = new FileInputStream(file);
        InputStreamReader in = new InputStreamReader(stream);
		BufferedReader reader = new BufferedReader(in);
		
		
		String txt;
		int slovo = 0;
		int mezera = 0;
		
		  while((txt = reader.readLine()) != null) {
			  String[] counter = txt.split("\\s+");
              slovo = slovo + counter.length;
              mezera += slovo -1;
		  }
		System.out.println("Pocet mezer: " + mezera);
		  System.out.println("Pocet slov: " + slovo);
		
		
	}
	  
}