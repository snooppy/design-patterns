package com.dmitrykrivenko.builder;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class BuilderTest {

	@Test
	public void testBuilder() {
		Director director = new Director();

		ComputerBuilder cheapComputerBuilder = new CheapComputerBuilder();
		ComputerBuilder expensiveComputerBuilder = new ExpensiveComputerBuilder();

		director.setComputerBuilder(cheapComputerBuilder);
		director.constructComputer();

		Computer computer = director.getComputer();

		Assert.assertEquals("Cheap System Block", computer.getSystemBlock());

		director.setComputerBuilder(expensiveComputerBuilder);
		director.constructComputer();

		computer = director.getComputer();

		Assert.assertEquals("Expensive System Block", computer.getSystemBlock());
	}

	@Test
	public void testBuilder2() {
		Computer computer = new Computer.Builder().display("Powerfull computer")
				.manipulators("Powerfull Mouse and Keyboard")
				.systemBlock("Powerfull System Block")
				.build();
		Assert.assertEquals("Powerfull System Block", computer.getSystemBlock());
	}
}
