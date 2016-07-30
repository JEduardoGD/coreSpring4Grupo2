package org.certificatic.practica1.interfaces.operations.test;

import java.text.DecimalFormat;

import org.certificatic.practica1.interfaces.operations.api.IKidsCalculator;
import org.certificatic.practica1.interfaces.operations.api.impl.KidsCalculator;
import org.junit.Assert;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class KidsCalculatorTest {

	private DecimalFormat df = new DecimalFormat("#.00##");

	@Test
	public void kidsCalculatorTest(){
		log.info("kidsCalculatorTest -------------------");
		
		IKidsCalculator kidsCal = new KidsCalculator();
		
		final double expectedValue = 6D;

		kidsCal.set(5).add(5).add(5).add(-5).subtract(4);
		
		log.info("kidsCal.result(): {}", df.format(kidsCal.result()));

		Assert.assertEquals(expectedValue, kidsCal.result(), 0.0001);
	}
	
}
