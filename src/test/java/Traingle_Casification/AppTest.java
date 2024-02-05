package Traingle_Casification;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {
	
	App triangle = new App();
	
	@Test
	public void TC1_equilateralTriangle() {
		int a = 2;
		int b = 2;
		int c = 2;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.equilateral.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected, result.toString());
	}
	@Test
	public void TC2_isoscelesTriangle() {
		int a = 48;
		int b = 48;
		int c = 34;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.isosceles.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected, result.toString());
	}
	@Test
	public void TC3_isoscelesTriangle() {
		int a = 77;
		int b = 25;
		int c = 77;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.isosceles.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected, result.toString());
	}
	@Test
	public void TC4_isoscelesTriangle() {
		int a = 8;
		int b = 5;
		int c = 5;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.isosceles.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected, result.toString());
	}
	@Test
	public void TC5_scaleneTriangle() {
		int a = 44;
		int b = 55;
		int c = 66;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.Scalene.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected, result.toString());
	}
	@Test
	public void TC6_notTriangle() {
		int a = 10;
		int b = 10;
		int c = 30;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.Nottriangle.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected, result.toString());
	}
	@Test
	public void TC7_notTriangle() {
		int a = 1;
		int b = 7;
		int c = 1;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.Nottriangle.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected, result.toString());
	}
	@Test
	public void TC8_notTriangle() {
		int a = 90;
		int b = 10;
		int c = 10;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.Nottriangle.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected, result.toString());
	}
	@Test
	public void TC9_notTriangle() {
		int a = 1;
		int b = 4;
		int c = 6;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.Nottriangle.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected, result.toString());
	}
	
}
