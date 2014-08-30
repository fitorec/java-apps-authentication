package test;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import apps_auth.CakePHP;


public class CakePhpTest {

	@BeforeClass
	public void prepare() {
		CakePHP.security_salt = "my.Securyty.Salt Hash";
	}

	@Test
	public void test() {
		assertEquals("05b52a966c813c66b7f35642e0de320c2f99305e", CakePHP.password("secret"));
	}

}
