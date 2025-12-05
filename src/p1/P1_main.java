package p1;

public class P1_main {
	public static void main(String[] args) {
		multFrac(5, 2, 3, 4);
        Bruch b1 = new Bruch(5, 2);
        Bruch b2 = new Bruch(3, 4);
        multFrac(b1, b2); 
		}
		
		public static void multFrac (int z1, int n1, int z2, int n2) {
			System.out.print(z1 * z2);
			System.out.print(" : ");
			System.out.println(n1 * n2);
		}
		public static void multFrac (Bruch a, Bruch b) {
	        int zErg = a.z * b.z;
	        int nErg = a.n * b.n;
	        System.out.println(zErg + " : " + nErg);
		}
}
