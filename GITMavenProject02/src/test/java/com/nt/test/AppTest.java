package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.nt.service.Arithmetic;

public class AppTest 
{ 
	@Test
    public void testWithPositives()
   {
	   Arithmetic ar=new Arithmetic();
	   int actual=ar.sum(25,25);
	   int expected=50;
	   assertEquals(expected,actual);
   }
}
