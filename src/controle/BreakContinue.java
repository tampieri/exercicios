package controle;

public class BreakContinue {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Break");
		
		for (int i = 0; i < 10; i++) {
			
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Continue");
	}
}
