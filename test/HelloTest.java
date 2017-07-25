import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class HelloTest {

	@Test
	public void test() throws Exception {
	    String expected = "lbaeovboeavjkaol";
	    Hello h1 = new Hello();
	    String actual  = h1.ret();
	    assertEquals(expected, actual);
	}

}