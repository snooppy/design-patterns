package com.dmitrykrivenko.builder;

/**
 *
 * @author Dmitry Krivenko <dmitrykrivenko@gmail.com>
 */
public class Computer {

	private String display;
	private String systemBlock;
	private String manipulators;

	public Computer() {
	}

	private Computer(Builder builder) {
		this.display = builder.display;
		this.systemBlock = builder.systemBlock;
		this.manipulators = manipulators;
	}

	/**
	 * @return the display
	 */
	public String getDisplay() {
		return display;
	}

	/**
	 * @param display the display to set
	 */
	public void setDisplay(String display) {
		this.display = display;
	}

	/**
	 * @return the systemBlock
	 */
	public String getSystemBlock() {
		return systemBlock;
	}

	/**
	 * @param systemBlock the systemBlock to set
	 */
	public void setSystemBlock(String systemBlock) {
		this.systemBlock = systemBlock;
	}

	/**
	 * @return the manipulators
	 */
	public String getManipulators() {
		return manipulators;
	}

	/**
	 * @param manipulators the manipulators to set
	 */
	public void setManipulators(String manipulators) {
		this.manipulators = manipulators;
	}

	/**
	 * Another example of Builder.
	 */
	public static class Builder {

		private String display;
		private String systemBlock;
		private String manipulators;

		public Builder display(String display) {
			this.display = display;
			return this;
		}

		public Builder systemBlock(String systemBlock) {
			this.systemBlock = systemBlock;
			return this;
		}

		public Builder manipulators(String manipulators) {
			this.manipulators = manipulators;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}
}
