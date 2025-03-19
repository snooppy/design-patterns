package com.dmitrykrivenko.builder;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public class ExpensiveComputerBuilder extends ComputerBuilder {

    @Override
    public void buildSystemBlock() {
        System.out.println("Building Expensive System Block");
        computer.setSystemBlock("Expensive System Block");
    }

    @Override
    public void buildDisplay() {
        System.out.println("Building Expensive Display");
        computer.setDisplay("Expensive Display");
    }

    @Override
    public void buildManipulators() {
        System.out.println("Building Expensive Mouse and Keyboard");
        computer.setDisplay("Expensive Mouse and Keyboard");
    }
}
