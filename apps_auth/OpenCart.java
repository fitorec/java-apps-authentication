package apps_auth;

/*
 * Link: https://github.com/opencart/opencart/issues/1269
 */
public class OpenCart {
	public static String password(String txt, String salt) {
		return Hash.sha1(salt +  Hash.sha1(salt + Hash.sha1(txt)));
	}
}
