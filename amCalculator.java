/*
 * amcalculator.java
 * 
 * Copyright 2016 Alexandro <alexandro@alexandro-U43F>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.io.*;
import java.util.Scanner;

public class amCalculator {
	
	public static void main (String args[]) {
		System.out.println("This is a text calculator, \nEnter your values using white spaces between numbers and operator ===>   \nExample ===> 5 + 5");
		
		Scanner reader = new Scanner(System.in);
		float A = reader.nextFloat();
		String operator = reader.next();
		float B = reader.nextFloat();
		
		amMath answer = new amMath();
		
		System.out.println("You entered: " + A + " " + operator + " " + B);
		System.out.println("The answer is: " + answer.mathCalculation(operator, A , B) );
	}
}

