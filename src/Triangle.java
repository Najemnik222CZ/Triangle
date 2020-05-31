public class Triangle {

	double a;
	double b;
	double c;
	double Content;
	double Circuit;

	public double getContent() {
		System.out.println("\n");
		System.out.println("Content is:");
		double s = (a + b + c) / 2;
		double k = s * (s - a) * (s - b) * (s - c);
		double ob = Math.sqrt(k);
		return ob;

	}
	public double getCircuit() {
		System.out.println("\n");
		System.out.println("Circuit is;");
		return a + b + c;
	}
	public static Triangle factoryIsoscelesTriangle(double a, double b, double c) {
		if (a < 0 || b < 0 || c < 0) {
			return null;
		}

		if (a == b && a != c && b != c) {
			return new Triangle(a, b, c);
		}
		if (a == c && c != b && a != b) {
			return new Triangle(a, b, c);
		}
		if (c == b && a != c && a != b) {
			return new Triangle(a, b, c);
		}
		return null;
	}
	public static Triangle factoryEquilateralTriangle(double a, double b, double c) {
		if (a == b && a == c && b == c) {
			return new Triangle(a, b, c);
		}
		return null;
	}

	public Triangle(double a, double b, double c) {
		if (a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b) {

			this.a = a;
			this.b = b;
			this.c = c;
		}
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
}
