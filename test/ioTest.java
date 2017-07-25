import static org.junit.Assert.*;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ioTest {

	@Test
	public void test() throws Exception {
		RandomAccessFile aFile = new RandomAccessFile("temp.txt", "rw");
	    FileChannel inChannel = aFile.getChannel();

	    ByteBuffer buf = ByteBuffer.allocate(48);

	    int bytesRead = inChannel.read(buf);
	    String str1 ="";
	    while (bytesRead != -1) {

	      buf.flip();
	      
	      while(buf.hasRemaining()){
	          str1  = str1 + (char)buf.get();
	      }

	      buf.clear();
	      bytesRead = inChannel.read(buf);
		  io h1 = new io();
		  String actual  = h1.out();
		  assertEquals(str1, actual);
	    }
	    aFile.close();	    
	}

}