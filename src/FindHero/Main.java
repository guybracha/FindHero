package FindHero;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Check original - Enter your character name:");
		String character = in.next();
		String[] heroes = {"Iron Man", "Bloom", "Spider-man", "Batman", "Spawn", "She-ra", "Hulk", "Avengers", "guardains of the galaxy"};
		in.close();
		check(character, heroes);
	}
	public static void check(String character, String[] heroes) {
		boolean exist = false;
		for(int i = 0; i < heroes.length; i++) {
			if(character.equals(heroes[i])) {
				exist = true;
				break;
		}
	}
		if(exist) {
			System.out.println("copy");
		} else {
			System.out.println("original");
		}
	}
}