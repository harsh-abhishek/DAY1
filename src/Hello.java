import java.io.*;
import java.nio.*;
import java.nio.channels.*;
public class Hello {

	public static void main(String[] args) throws Exception {

		 System.out.println(ret());
	}
	public static String ret() throws Exception
	{
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
	    }
	    aFile.close();
	   
	    return str1;
	    
	}
	
	}


