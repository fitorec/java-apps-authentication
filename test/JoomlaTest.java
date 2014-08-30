package test;
import static org.junit.Assert.*;

import java.security.Security;

import org.junit.Test;

import apps_auth.Joomla;

public class JoomlaTest {

	@Test
	public void test() {
		System.out.println(Security.getProviders());
		String hashEsperado = "";
		String salt = "";
		assertEquals(hashEsperado, Joomla.password("joomla_pass", salt));
	}

}
