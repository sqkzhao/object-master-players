package objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		Human user = new Human();
		Human someone = new Human();
		user.attack(someone);
		System.out.println(someone.getHealth());;
	}

}
