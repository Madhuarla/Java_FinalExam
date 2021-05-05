/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Madhu Babu Arla <your.name at your.org>
 */
public class ComparableCircle extends Circle 
		implements Comparable<ComparableCircle> {

	public ComparableCircle() {
	}

	public ComparableCircle(double radius) {
		super(radius);
	}

	public ComparableCircle(double radius, String color, boolean filled) {
		super(radius, color, filled);
	}

	@Override 
	public int compareTo(ComparableCircle o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

	@Override 
	public String toString() {
		return super.toString() + "\nArea: " + getArea();}}

