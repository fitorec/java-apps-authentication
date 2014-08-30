package apps_auth;


/**
 * @Link: http://fitorec.wordpress.com/2010/09/25/como-joomla-genera-sus-passwords/
 **/
public class Joomla {
	public static String password(String txt, String salt) {
		return Hash.md5(txt + salt);
	}
}
