import java.util.Scanner; 
import java.io.File; 
import java.io.FileNotFoundException; 

public class readFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "metro-bike-share-trip-data.csv";  
		File file = new File(fileName); 
		
		try {
			Scanner inputStream = new Scanner(file); 
			while(inputStream.hasNext()) {
			String data = inputStream.next(); 
			String[] values = data.split(","); 
			System.out.println(data); 
			}
			inputStream.close(); 
		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
		}
		
		
	}

}
