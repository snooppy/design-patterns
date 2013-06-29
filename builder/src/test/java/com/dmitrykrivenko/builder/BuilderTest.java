package com.dmitrykrivenko.builder;

import org.junit.Test;
import org.junit.Assert;

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
}
