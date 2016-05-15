/*
 * amMath.java
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


public class amMath {
	float mathCalculation(String operator, float A, float B){
		float answer = 0;
		
		switch (operator){
			case "+": answer= A+B;
					break;
			case "-": answer= A-B;
					break;
			case "x": answer= A*B;
					break;
			case "*": answer= A*B;
					break;
			case "/": answer= A/B;
					break;			
		}
	
		return answer;
	}
}

