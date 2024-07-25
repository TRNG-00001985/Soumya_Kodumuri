import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionClass {
     public void writeToFile(String text) throws IOException{
    	 PrintWriter out=new PrintWriter(new FileWriter("output-file.txt"));
    	 out.println(text);
    	 
    	 out.close();
     }
     public void readFromFile() throws FileNotFoundException,IOException
     {
    	 BufferedReader br=new BufferedReader(new FileReader("output-file.txt"));
     }
     public static void main(String[] args) throws IOException {
    	 ExceptionClass ec=new ExceptionClass();
		String[] arr= {"hello", "welcome", "thankyou"};
		try {
		for(int i=0;i<=5; i++)
		{
			ec.writeToFile(arr[i]);
		}
	}
		catch (IOException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
}
}

-------------------------------------

public class MultiTryCatch {

	public static void main(String[] args) {
		try {
			int []a=new int[5];
			a[5]= 50/0;
			
			
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bound Exception occurs");
		}
		catch (Exception e) {
			System.out.println("Parent Excepyion occurs");
		}
		
		System.out.println("rest of the code");

	}

}
