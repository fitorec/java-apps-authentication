
import static org.junit.Assert.*;
import org.junit.Test;


public class HashTest {

	@Test
	public void test() {
		String txt = "Hello World";
		assertEquals("b10a8db164e0754105b7a99be72e3fe5", Hash.md5(txt));
		assertEquals("0a4d55a8d778e5022fab701977c5d840bbc486d0", Hash.sha1(txt));
	}

}