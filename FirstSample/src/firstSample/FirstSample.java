package firstSample;

import java.util.Random;
import java.util.Scanner;

public class FirstSample {

	public static void main(String[] args) {
		
		System.out.println("Welcome!");

		Character user = new Character();
		Character enemy = new Character();

		Scanner in = new Scanner(System.in);

		System.out.print("Input User Name : ");
		String temp = in.nextLine();
		user.setName(temp);
		System.out.print("Input Freind Name : ");
		temp = in.nextLine();
		enemy.setName(temp);

		System.out.print("Input User Age : ");
		int iTemp = in.nextInt();
		user.setAge(iTemp);
		System.out.print("Input Freind Age : ");
		iTemp = in.nextInt();
		enemy.setAge(iTemp);

		Random rd = new Random();

		user.setHealth(rd.nextInt(100));
		enemy.setHealth(rd.nextInt(100));

		user.setPower(rd.nextInt(10));
		enemy.setPower(rd.nextInt(10));

		user.setEndurence(rd.nextInt(10));
		enemy.setEndurence(rd.nextInt(10));

		System.out.println("User is " + user);
		System.out.println("Freind is " + enemy.toString());

		int value = 0;
		for (int i = 0; i < 100000; i++) {
			System.out.print("input your command : ");

			String yourCommand = in.nextLine();

			System.out.println(user.getName() + " Say " + yourCommand);

			if (yourCommand.equals("stop")) {
				break;
			} else {
				int check = rd.nextInt(12);

				System.out.println("Check :" +check);
				int damage = 0;
				if(check >=8) {
					damage = (12 - check)*(user.getPower() - enemy.getEndurence());
					enemy.updateHealth(-damage);
				} else if (check < 4) {
					damage = check*(enemy.getPower() - user.getEndurence());
					user.updateHealth(-damage);
				}
			}

			System.out.println("Enemy : " + enemy.getCurrentHealth() + ", your point : " + user.getCurrentHealth());

			if (user.getCurrentHealth() <= 0 || enemy.getCurrentHealth() <= 0) {
				break;
			}

			value += 1;
			System.out.println(user.getName() + " " +value);			
		}

		System.out.println("Enemy : " + enemy.getCurrentHealth() + ", your point : " + user.getCurrentHealth());

		if (enemy.getCurrentHealth() < user.getCurrentHealth()) {
			System.out.println(user.getName() + ", You Win!");
		} else {
			System.out.println(user.getName() + ", You Lose...");
		}

	}

}