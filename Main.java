
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Main {
public static void main(String [] args) throws IOException  {
	int pocetmezer = 0;
	String data = "";
	int pocetslov=0;
	try {
	File file = new File("C:\\Users\\Dominik\\Desktop\\text.txt");
	Scanner sc = new Scanner(file);
	while (sc.hasNextLine()) {
         data = sc.nextLine();
     	for (char c : data.toCharArray()) {
    		if(c == ' ') {
    			pocetmezer++;
    		}
    		
     	}
      }
	try(Scanner pepiq2= new Scanner(new FileInputStream(file))){
	    while(pepiq2.hasNext()){
	        pepiq2.next();
	        pocetslov++;
	    }
	}
	} catch (FileNotFoundException a) {
	      System.out.println("Soubor nemohl být pøeèten");
	      a.printStackTrace();
	    }
	System.out.println("Poèet mezer je " + pocetmezer);
	System.out.println("Poèet slov je " + pocetslov);
	}
	
}