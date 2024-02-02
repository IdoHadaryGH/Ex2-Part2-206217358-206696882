package Traingle_Casification;

enum Triangle_Types {
	equilateral, isosceles, Scalene, Nottriangle, ERROR

}

class App {
	
	private static Triangle_Types triangle;

	public static void classifyTriangle(int a, int b, int c) {
		
		if (isInvalidData(a, b, c)) {
			triangle = Triangle_Types.ERROR;
		}
		else if (isEquilateral(a, b, c)) {
			triangle = Triangle_Types.equilateral;
		} 
		else if (isIsosceles(a, b, c)) {
			triangle = Triangle_Types.isosceles;
		} 
		else if (!isTriangle(a, b, c)) {
			triangle = Triangle_Types.Nottriangle;
		} 
		else {
			triangle = Triangle_Types.Scalene;
		}

	}
	private static boolean isInvalidData(int a, int b, int c) {
		return !((a >= 0 && a <= 100) && (b >= 0 && b <= 100) && (c >= 0 && c <= 100));
	}
	
	private static boolean isTriangle(int a, int b, int c) {
		return a + b > c && a + c > b && b + c > a;
	}

	private static boolean isIsosceles(int a, int b, int c) {
		return a + b > c && a + c > b && b + c > a && ((a == b) || (a == c) || (b == c));
	}

	private static boolean isEquilateral(int a, int b, int c) {
		return a + b > c && b + c > b && b + c > a && a == b && b == c;
	}

	public static Triangle_Types get_type() {
		return triangle;
	}

}
