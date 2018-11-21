package com.fdmgroup.test;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fdmgroup.model.Arithmetic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
public class ArithmeticTest {
	
	static Arithmetic ar;
	
	@BeforeClass
	public static void init(){
		ar= new Arithmetic(20,10);
		System.out.println("Constructing");
		
	}
	
	@Before
	public void initBegin(){
		System.out.println("Initial Stage");
		
	}
	
	@Test
	public void addTest(){
		assertEquals(30, ar.add(20,10));
	}
	
	@Test
	public void subTest(){
		assertEquals(10, ar.sub(20,10));
	}
	
	@After
	public void finish(){
		System.out.println("Finishing");;
	}
	@AfterClass
	public static void destroy(){
		System.out.println("Destroy Object");;
	}
	
}

