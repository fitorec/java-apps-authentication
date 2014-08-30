package apps_auth;
/**
 * Convert Strings to Hashes
 *
 * @author fitorec
 * @url  https://github.com/fitorec/java-hashes
 */
public class Hash {
	/**
	 * Get a hash by txt and hashType
	 * 
	 * @param txt, text in plain format
	 * @param hashType MD5 OR SHA1, etc..
	 * Note: check list of algorithms
	 *    http://docs.oracle.com/javase/8/docs/technotes/guides/security/StandardNames.html#MessageDigest
	 * 
	 * @return hash in hashType
	 */
	public static String getHash(String txt, String hashType) {
		try {
	        java.security.MessageDigest md = java.security.MessageDigest.getInstance(hashType);
	        byte[] array = md.digest(txt.getBytes());
	        StringBuffer sb = new StringBuffer();
	        for (int i = 0; i < array.length; ++i) {
	          sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
	       }
	        return sb.toString();
	    } catch (java.security.NoSuchAlgorithmException e) {
	    	//error action
	    }
	    return null;
	}

	public static String md2(String txt) {
		return Hash.getHash(txt, "MD2");
	}
	public static String md5(String txt) {
		return Hash.getHash(txt, "MD5");
	}
	public static String sha1(String txt) {
		return Hash.getHash(txt, "SHA1");
	}
	public static String sha224(String txt) {
		return Hash.getHash(txt, "SHA-224");
	}
	public static String sha256(String txt) {
		return Hash.getHash(txt, "SHA-256");
	}
	public static String sha384(String txt) {
		return Hash.getHash(txt, "SHA-384");
	}
	public static String sha512(String txt) {
		return Hash.getHash(txt, "SHA-512");
	}
}
