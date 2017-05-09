package com.example.sdg.listviewpor;

public class Car {
	private int numWheel;
	private String model;
	private String num;
	private int numSeat;

	public Car() {
		model = "";
		num = "";
	}

	public int getNumWheel() {
		return numWheel;
	}

	public void setNumWheel(int numWheel) {
		this.numWheel = numWheel;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public int getNumSeat() {
		return numSeat;
	}

	public void setNumSeat(int numSeat) {
		this.numSeat = numSeat;
	}

	@Override
	public String toString() {
		return getNum() + "\n" + getModel();
	}
}

