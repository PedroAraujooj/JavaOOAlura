package testes;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class TesteUnicodeEEncoding {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str = "C";
		System.out.println(str.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = str.getBytes("windows-1252");
		System.out.println(bytes.length + "  " + "windows-125");
		
	}

}
