public class Main {

	public static void main(String[] args)  throws FormateException {

		Triangle t = new Triangle(5.0, 8.0, 8.0);
		System.out.println(t);
		System.out.println(t.getContent());
		System.out.println(t.getCircuit());

		Triangle tt = Triangle.factoryEquilateralTriangle(10.0, 10.0, 10.0);
		System.out.println(tt);
		System.out.println(tt.getContent());
		System.out.println(tt.getCircuit());

		Triangle ttt = Triangle.factoryIsoscelesTriangle(10.0, 10.0, 5.0);
		System.out.println(ttt);
		System.out.println(ttt.getContent());
		System.out.println(ttt.getCircuit());
	}
}
