import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.junit.Test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class io1Test {

	@Test
	public void test() throws Exception  {
		File f = new File("D:/io1.txt");

        BufferedReader b = new BufferedReader(new FileReader(f));

        String readLine = "";
        String str="";	

        while ((readLine = b.readLine()) != null) {
            str=str+readLine;
            str=str+"\n";
        }
        io1 h1 = new io1();
		String actual  = h1.out();
		assertEquals(str, actual);
	}

}
