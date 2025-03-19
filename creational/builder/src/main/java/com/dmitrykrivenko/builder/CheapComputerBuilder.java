package com.dmitrykrivenko.builder;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class CheapComputerBuilder extends ComputerBuilder {

    @Override
    public void buildSystemBlock() {
        System.out.println("Building Cheap System Block");
        computer.setSystemBlock("Cheap System Block");
    }

    @Override
    public void buildDisplay() {
        System.out.println("Building Cheap Display");
        computer.setDisplay("Cheap Display");
    }

    @Override
    public void buildManipulators() {
        System.out.println("Building Cheap Mouse and Keyboard");
        computer.setDisplay("Cheap Mouse and Keyboard");
    }
}
