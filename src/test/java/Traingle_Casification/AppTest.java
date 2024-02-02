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
		int b = 34;
		int c = 48;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.isosceles.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected, result.toString());
	}
	@Test
	public void TC3_scaleneTriangle() {
		int a = 44;
		int b = 55;
		int c = 66;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.Scalene.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected, result.toString());
	}
	@Test
	public void TC4_notTriangle() {
		int a = 10;
		int b = 20;
		int c = 33;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.Nottriangle.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected, result.toString());
	}
	@Test
	public void TC5_invalidData() {
		int a = -15;
		int b = 700;
		int c = 26;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.ERROR.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected, result.toString());
	}
	
}
