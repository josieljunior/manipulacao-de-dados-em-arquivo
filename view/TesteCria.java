package view;

public class TesteCria {
	


		public static int S(int num, int x) {
			if (num < 1)
				return x;
			x += (num % 10);
			System.out.println(x);
			System.out.println(num);
			return S(num / 10, x);
		
		}

		public static void main(String[] args) {
			int num = 700;
			int x = S(num, 0);

			System.out.println("O valor de x é: " + x);
		}

}

