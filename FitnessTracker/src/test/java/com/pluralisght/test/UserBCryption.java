package com.pluralisght.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import junit.framework.TestCase;

public class UserBCryption extends TestCase{
	
public void testMd5Encoder() {
		
		String upassword="shyams";
		String apassword="manager";
		String buser="sundar";
		BCryptPasswordEncoder passwordEncode=new BCryptPasswordEncoder();
		
		String uhashcode=passwordEncode.encode(upassword);
		String ahashcode=passwordEncode.encode(apassword);
		String bhashcode=passwordEncode.encode(buser);
		System.out.println("BCryption User Password : "+uhashcode);
		System.out.println("BCryption Admin Password : "+ahashcode);
		System.out.println("BCryption Bad User Password : "+bhashcode);
		
	}

}
