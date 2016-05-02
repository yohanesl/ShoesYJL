package edu.saintjoe.cs.yohanesl.ShoesYJL;

public class RetroJordans {
	private String name;
	private int number;
	private int releaseYr;
	
	public RetroJordans(String newName, int newNumber, int newRealeaseYr) {
		name = newName;
		number = newNumber;
		releaseYr = newRealeaseYr;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	public String getName() {
		return name;
	}
	public void setNumber(int newNumber) {
		number = newNumber;
	}
	public int getNumber() {
		return number;
	}
	public void setReleaseYr(int year) {
		releaseYr = year;
	}
	public int getReleaseYr() {
		return releaseYr;
	}
	public String toString() {
		return ("Retro Jordans: " + name + " Number: " + number + " Release Year: " + releaseYr);
		
	}

	}
