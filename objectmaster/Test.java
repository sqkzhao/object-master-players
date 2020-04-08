package objectmaster;

public class Test {
	public static void main(String[] args) {
		Wizard playerW = new Wizard();
		Ninja playerN = new Ninja();
		Samurai playerS = new Samurai();
		Samurai player2 = new Samurai();
		Samurai player3 = new Samurai();
		playerW.heal(playerN);
		playerW.fireball(playerN);
		playerN.runAway();
		playerN.steal(playerW);
		playerS.deathBlow(playerN);
		playerN.getHealth();
		System.out.println(Samurai.howMany());
	}
}
