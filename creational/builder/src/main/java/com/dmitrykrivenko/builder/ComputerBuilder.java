package com.dmitrykrivenko.builder;

/**
 *
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public abstract class ComputerBuilder {

    protected Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void createNewComputer() {
        this.computer = new Computer();
    }

    public abstract void buildSystemBlock();

    public abstract void buildDisplay();

    public abstract void buildManipulators();
}
