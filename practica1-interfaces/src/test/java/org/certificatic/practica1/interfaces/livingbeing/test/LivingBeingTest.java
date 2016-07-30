package org.certificatic.practica1.interfaces.livingbeing.test;

import org.certificatic.practica1.interfaces.livingbeing.api.IBugEater;
import org.certificatic.practica1.interfaces.livingbeing.api.ILivingBeing;
import org.certificatic.practica1.interfaces.livingbeing.api.impl.Aardvark;
import org.certificatic.practica1.interfaces.livingbeing.api.impl.Animal;
import org.certificatic.practica1.interfaces.livingbeing.api.impl.Plant;
import org.certificatic.practica1.interfaces.livingbeing.api.impl.VenusFlyTrap;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LivingBeingTest {

	@Test
	public void livingBeingTest() {
		log.info("livingBeingTest -------------------");

		ILivingBeing livingBeing1 = new VenusFlyTrap("venus fly trap");
		ILivingBeing livingBeing2 = new Aardvark("aardvark");
		
		log.info("living being 1: {}", livingBeing1);
		
		livingBeing1.born();
		livingBeing1.grow();
		livingBeing1.breed();
		livingBeing1.die();
		
		((IBugEater)livingBeing1).eatBug();
		
		log.info("living being 2: {}", livingBeing2);
		
		livingBeing2.born();
		livingBeing2.grow();
		livingBeing2.breed();
		livingBeing2.die();
		
		((IBugEater)livingBeing2).eatBug();
		
		Assert.assertTrue(livingBeing1 instanceof IBugEater);
		Assert.assertThat(VenusFlyTrap.class.getSimpleName(), 
				CoreMatchers.is(livingBeing1.getClass().getSimpleName()));
		
		Assert.assertTrue(livingBeing2 instanceof Animal);
		Assert.assertThat(Aardvark.class.getSimpleName(), 
				CoreMatchers.is(livingBeing2.getClass().getSimpleName()));
		
	}

}
