package drivessolutions;

import org.apache.commons.net.util.Base64;

public class EncodingandDecodingStrings {
			
			 
	public static void main(String[] args)  {
	
	 String str= "HareKrishna@2021";

      byte[] encodedstring = Base64.encodeBase64(str.getBytes());
	
	System.out.println("Encoded password =" +new String (encodedstring));
	
	
	byte[] decodedstring = Base64.decodeBase64(encodedstring);
	
	System.out.println("Decodedpassword =" +new String (decodedstring));
	}
	}
