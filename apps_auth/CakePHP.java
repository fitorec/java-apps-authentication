package apps_auth;

public class CakePHP {
	public static String security_salt = null;

	/*
	 * 
	 * @link http://book.cakephp.org/2.0/en/core-utility-libraries/security.html#Security::hash
	 */
	public static String password(String txt) {
		return Hash.sha1(CakePHP.security_salt + txt);
	}
}
