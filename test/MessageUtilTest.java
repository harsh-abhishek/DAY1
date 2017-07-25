import static org.junit.Assert.*;

import org.junit.Test;


public class MessageUtilTest {

	@Test
	public void testqwert() {
		MessageUtil helper=new MessageUtil();
		assertEquals("ABCCD",helper.qwert("ABC"));
	}

}
