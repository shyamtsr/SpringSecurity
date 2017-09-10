package com.pluralisght.test;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

import junit.framework.TestCase;


public class UserEncoderMD5 extends TestCase{
	
	
	public void testMd5Encoder() {
		
		String upassword="shyam";
		String apassword="manager";
		Md5PasswordEncoder passwordEncode=new Md5PasswordEncoder();
		
		String uhashcode=passwordEncode.encodePassword(upassword, null);
		String ahashcode=passwordEncode.encodePassword(apassword, null);
		System.out.println("MD5 User Password : "+uhashcode);
		System.out.println("MD5 Admin Password : "+ahashcode);
		
	}

}
