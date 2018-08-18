package com.addcode.nissan;

import org.junit.*;

public class addcode_test {
	private addcode add;
	
	@Before
	public void setup() {
		add = new addcode() ;
	}

	@Test
	public void bothValidInt() {
		Assert.assertEquals( "Pass", "1060", addcode.func( "50", "1010" ) ) ;
	}
	
	@Test
	public void invalidInput() {
		Assert.assertEquals( "Fail", "InvalidInput", addcode.func( ",", "Hello" ) ) ;
	}
	
	@Test
	public void moreInvalidInput() {
		Assert.assertEquals( "Fail", "InvalidInput", addcode.func( "7.5", "1.07.8" ) ) ;
	}
	
	@Test
	public void bothValidFloat() {
		Assert.assertEquals( "Pass", "10009.507", addcode.func( "9999.5", "10.007" ) ) ;
	}
	
	@Test
	public void bothValidFloatInt() {
		Assert.assertEquals( "Pass", "97910.065", addcode.func( "15553.065", "82357" ) ) ;
	}
}
