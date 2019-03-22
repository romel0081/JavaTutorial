package oppsconcept;

public class WhileloopDemo {

	public static void main(String[] args) {
		int i = 10;
		while(i<20) {
			if(i ==17) {
				break;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("This is Outside Of My Loop::::::");
		
		do {
			System.out.println(i);
			i++;
		}while(i<10);

	}

}
