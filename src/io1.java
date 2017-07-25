import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class io1{
	public static void main(String[] args) throws Exception {

		 System.out.println(out());
	}

	public static String out() throws Exception 
	{

       

            File f = new File("D:/io1.txt");

            BufferedReader b = new BufferedReader(new FileReader(f));

            String readLine = "";
            String str="";	

            while ((readLine = b.readLine()) != null) {
                str=str+readLine;
                str=str+"\n";
            }
            return str;	
        }}