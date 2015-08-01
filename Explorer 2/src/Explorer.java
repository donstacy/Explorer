import java.util.Random;

import javax.swing.JOptionPane;

import java.util.Scanner;

import Enemies.Enemy;
import Player.Player;
import Weapons.Stone;

import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
public class Explorer
{
	static String caveName = "Name";
	static String selectedWeapon = "";
	static int weaponsUnlocked = 1;
	static Player player1 = new Player();
	public static void main(String[] args ) 
	{
		Scanner playerInput = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		JOptionPane.showMessageDialog(null, "Welcome to Dungeon Explorer Dad v1.8.\nEnter your name and dungeon name.");
		
		//Choosing your name.
		System.out.println("What is your name?");
		player1.playerName = playerInput.nextLine();
		System.out.println("Hello " + player1.playerName + "!");
		
		
		
		//Choosing the dungeon name.
		System.out.println("What is the dungeon's name?");
		caveName = playerInput.nextLine();
		
		
		
		//Menu
		System.out.println("-----Menu-----");
		System.out.println("---Choices:---");
		System.out.println("--------------");
		System.out.println("-----Play-----");
		System.out.println("-----Info-----");
		System.out.println("-----Quit-----");
		
		
		selectedWeapon = playerInput.nextLine();
		if(selectedWeapon.equalsIgnoreCase("play"))
		{
			
		}
		else if(selectedWeapon.equalsIgnoreCase("info"))
		{
			JOptionPane.showMessageDialog(null, "Game made by Ethan\nusing Eclipse Java.");
		}
		else if(selectedWeapon.equalsIgnoreCase("quit"))
		{
			JOptionPane.showMessageDialog(null, "Goodbye");
			System.exit(0);
		}
		
		
		System.out.println("You are going into the " + caveName + ".");
		System.out.println("Good luck!");
		
		
		
		//Starting the adventure.
		System.out.println("A lv. 1 enemy comes to you.");
		Enemy enemy1 = new Enemy();
		Enemy enemy2 = new Enemy();
		enemy1.enemyHealth = 3;
		JOptionPane.showMessageDialog(null, "To play, when told to, enter the weapon you would like to use.\nYou will then attack the enemy. As you progress, the enemies will get harder.");
		while(enemy1.enemyHealth > 0)
		{
			
			amIDead();
			System.out.println("It's your turn to atack.\nEnemy has " + enemy1.enemyHealth + " health left.");
			System.out.println("Which weapon.\nStone");
			selectedWeapon = playerInput.nextLine();
			if(selectedWeapon.equalsIgnoreCase("stone"))
			{
				System.out.println("You attacked with " + selectedWeapon + ".\nIt did 1 damage.");
				enemy1.enemyHealth = enemy1.enemyHealth - 1;
			}
			else
			{
				System.out.println("You attacked with fists.\nIt did no damage.");
			}
			System.out.println("Press anything to contine.");
			selectedWeapon = playerInput.nextLine();
			if (enemy1.enemyHealth > 0)
			{
				System.out.println("Enemy atacking.");
				Random randomGenerator = new Random();
				enemy1.enemyDamage = randomGenerator.nextInt(4);
				player1.playerHealth = player1.playerHealth - enemy1.enemyDamage;
				System.out.println("Enemy used stick and you lost " + enemy1.enemyDamage + " health.\nYou now have " + player1.playerHealth + " health left.");
			}
			else
			{
				weaponsUnlocked = 2;
				break;
			}
		}
		
		
		
		
		System.out.println("You won the battle aginst a level 1 enemy.\nYou picked up a stick that the enemy had.\nNew weapon: Stick");
		System.out.println("Press anything to contine.");
		selectedWeapon = playerInput.nextLine();
		System.out.println("Another lv. 1 enemy comes to you.");
		enemy1.enemyHealth = 3;
		
		
		
		
		while(enemy1.enemyHealth > 0)
		{
			amIDead();
			System.out.println("It's your turn to atack.\nEnemy has " + enemy1.enemyHealth + " health left.");
			System.out.println("Which weapon.\nStone\nStick");
			selectedWeapon = playerInput.nextLine();
			if(selectedWeapon.equalsIgnoreCase("stone"))
			{
				System.out.println("You attacked with " + selectedWeapon + ".\nIt did 1 damage.");
				enemy1.enemyHealth = enemy1.enemyHealth - 1;
			}
			else if(selectedWeapon.equalsIgnoreCase("stick"))
			{
				System.out.println("You attacked with " + selectedWeapon + ".\nIt did 3 damage.");
				enemy1.enemyHealth = enemy1.enemyHealth - 3;
			}
			else
			{
				System.out.println("You attacked with fists.\nIt did no damage.");
			}
			System.out.println("Press anything to contine.");
			selectedWeapon = playerInput.nextLine();
			if (enemy1.enemyHealth > 0)
			{
				System.out.println("Enemy atacking.");
				Random randomGenerator = new Random();
				enemy1.enemyDamage = randomGenerator.nextInt(4);
				player1.playerHealth = player1.playerHealth - enemy1.enemyDamage;
				System.out.println("Enemy used stick and you lost " + enemy1.enemyDamage + " health.\nYou now have " + player1.playerHealth + " health left.");
			}
			else
			{
				weaponsUnlocked = 2;
				break;
			}
		}
		System.out.println("You won the battle aginst a level 1 enemy.");
		System.out.println("Press anything to contine.");
		selectedWeapon = playerInput.nextLine();
		System.out.println("A lv. 2 enemy comes to you.");
		enemy1.enemyHealth = 5;
		
		
		
		while(enemy1.enemyHealth > 0)
		{
			amIDead();
			System.out.println("It's your turn to atack.\nEnemy has " + enemy1.enemyHealth + " health left.");
			System.out.println("Which weapon.\nStone\nStick");
			selectedWeapon = playerInput.nextLine();
			if(selectedWeapon.equalsIgnoreCase("stone"))
			{
				System.out.println("You attacked with " + selectedWeapon + ".\nIt did 1 damage.");
				enemy1.enemyHealth = enemy1.enemyHealth - 1;
			}
			else if(selectedWeapon.equalsIgnoreCase("stick"))
			{
				System.out.println("You attacked with " + selectedWeapon + ".\nIt did 3 damage.");
				enemy1.enemyHealth = enemy1.enemyHealth - 3;
			}
			else
			{
				System.out.println("You attacked with fists.\nIt did no damage.");
			}
			System.out.println("Press anything to contine.");
			selectedWeapon = playerInput.nextLine();
			if (enemy1.enemyHealth > 0)
			{
				System.out.println("Enemy atacking.");
				Random randomGenerator = new Random();
				enemy1.enemyDamage = randomGenerator.nextInt(4);
				player1.playerHealth = player1.playerHealth - enemy1.enemyDamage;
				System.out.println("Enemy used stick and you lost " + enemy1.enemyDamage + " health.\nYou now have " + player1.playerHealth + " health left.");
			}
			else
			{
				weaponsUnlocked = 2;
				break;
			}
		}
		
		
		
		System.out.println("You won the battle aginst a level 2 enemy.\nYou picked up a first aid kit.\nIt healed you by 10 health.");
		player1.playerHealth = player1.playerHealth +10;
		System.out.println("You now have " + player1.playerHealth + " health.");
		System.out.println("Press anything to contine.");
		selectedWeapon = playerInput.nextLine();
		System.out.println("There are two tunnels that you can take, and you take the right one.");
		System.out.println("Press anything to contine.");
		selectedWeapon = playerInput.nextLine();
		
		
		
		
		System.out.println("You go down the tunnel, then stop when you feel something catch your foot.\nYou look down and see a tripwire.\nThere is a big pit in front of you. You can't even see the bottom.");
		System.out.println("With a rattle, a spear shoots out of the wall...");
		System.out.println("You have two choices:\nJump\nBlock.");
		selectedWeapon = playerInput.nextLine();
		if(selectedWeapon.equalsIgnoreCase("Jump"))
		{
			System.out.println("As you try to jump, you catch your foot on the tripwire and fall into the pit.\nThat was the last day anyone ever saw " + player1.playerName + ". You lost!");
			System.exit(0);
		}
		else if(selectedWeapon.equalsIgnoreCase("Block"))
		{
			System.out.println("You raise up the stick and bat the spear out of the way.\nIt slides right by your face and breaks as a result of the rotted wood.\nThe spear the tumbles into the darkness of the pit.\nYou retrace your footsteps and go down the other tunnel.");
		}
		else
		{
			System.out.println("You do nothing and get impaled by the spear.\nThat was the last day anyone ever saw " + player1.playerName + ". You lost!");
			System.exit(0);
		}
		System.out.println("Press anything to contine.");
		selectedWeapon = playerInput.nextLine();
		System.out.println("Another lv. 2 enemy comes to you.");
		enemy1.enemyHealth = 5;
		
		
		
		while(enemy1.enemyHealth > 0)
		{
			amIDead();
			System.out.println("It's your turn to atack.\nEnemy has " + enemy1.enemyHealth + " health left.");
			System.out.println("Which weapon.\nStone\nStick");
			selectedWeapon = playerInput.nextLine();
			if(selectedWeapon.equalsIgnoreCase("stone"))
			{
				System.out.println("You attacked with " + selectedWeapon + ".\nIt did 1 damage.");
				enemy1.enemyHealth = enemy1.enemyHealth - 1;
			}
			else if(selectedWeapon.equalsIgnoreCase("stick"))
			{
				System.out.println("You attacked with " + selectedWeapon + ".\nIt did 3 damage.");
				enemy1.enemyHealth = enemy1.enemyHealth - 3;
			}
			else
			{
				System.out.println("You attacked with fists.\nIt did no damage.");
			}
			System.out.println("Press anything to contine.");
			selectedWeapon = playerInput.nextLine();
			if (enemy1.enemyHealth > 0)
			{
				System.out.println("Enemy atacking.");
				Random randomGenerator = new Random();
				enemy1.enemyDamage = randomGenerator.nextInt(4);
				player1.playerHealth = player1.playerHealth - enemy1.enemyDamage;
				System.out.println("Enemy used stick and you lost " + enemy1.enemyDamage + " health.\nYou now have " + player1.playerHealth + " health left.");
			}
			else
			{
				weaponsUnlocked = 3;
				break;
			}
		}
		
		
		
		System.out.println("You won the battle aginst a level 2 enemy.\nOn the person you killed, you find a first aid kit and a dagger.\nNew weapon: Dagger");
		player1.playerHealth = player1.playerHealth +10;
		System.out.println("You now have " + player1.playerHealth + " health.");
		System.out.println("Press anything to contine.");
		selectedWeapon = playerInput.nextLine();
		System.out.println("A lv. 3 enemy comes to you.");
		enemy1.enemyHealth = 13;
		
		
		
		while(enemy1.enemyHealth > 0)
		{
			amIDead();
			System.out.println("It's your turn to atack.\nEnemy has " + enemy1.enemyHealth + " health left.");
			System.out.println("Which weapon.\nStone\nStick\nDagger");
			selectedWeapon = playerInput.nextLine();
			if(selectedWeapon.equalsIgnoreCase("stone"))
			{
				System.out.println("You attacked with " + selectedWeapon + ".\nIt did 1 damage.");
				enemy1.enemyHealth = enemy1.enemyHealth - 1;
			}
			else if(selectedWeapon.equalsIgnoreCase("stick"))
			{
				System.out.println("You attacked with " + selectedWeapon + ".\nIt did 3 damage.");
				enemy1.enemyHealth = enemy1.enemyHealth - 3;
			}
			else if(selectedWeapon.equalsIgnoreCase("dagger"))
			{
				System.out.println("You attacked with " + selectedWeapon + ".\nIt did 5 damage.");
				enemy1.enemyHealth = enemy1.enemyHealth - 5;
			}
			else
			{
				System.out.println("You attacked with fists.\nIt did no damage.");
			}
			System.out.println("Press anything to contine.");
			selectedWeapon = playerInput.nextLine();
			if (enemy1.enemyHealth > 0)
			{
				System.out.println("Enemy atacking.");
				Random randomGenerator = new Random();
				enemy1.enemyDamage = randomGenerator.nextInt(4);
				player1.playerHealth = player1.playerHealth - enemy1.enemyDamage;
				System.out.println("Enemy used stick and you lost " + enemy1.enemyDamage + " health.\nYou now have " + player1.playerHealth + " health left.");
			}
			else
			{
				weaponsUnlocked = 3;
				break;
			}
		}
		
		
		
		
		System.out.println("You won the battle aginst a level 3 enemy.");
		System.out.println("Press anything to contine.");
		selectedWeapon = playerInput.nextLine();
		System.out.println("A lv. 4 enemy comes to you.");
		enemy1.enemyHealth = 13;
		
		
		
		while(enemy1.enemyHealth > 0)
		{
			amIDead();
			System.out.println("It's your turn to atack.\nEnemy has " + enemy1.enemyHealth + " health left.");
			System.out.println("Which weapon.\nStone\nStick\nDagger");
			selectedWeapon = playerInput.nextLine();
			if(selectedWeapon.equalsIgnoreCase("stone"))
			{
				System.out.println("You attacked with " + selectedWeapon + ".\nIt did 1 damage.");
				enemy1.enemyHealth = enemy1.enemyHealth - 1;
			}
			else if(selectedWeapon.equalsIgnoreCase("stick"))
			{
				System.out.println("You attacked with " + selectedWeapon + ".\nIt did 3 damage.");
				enemy1.enemyHealth = enemy1.enemyHealth - 3;
			}
			else if(selectedWeapon.equalsIgnoreCase("dagger"))
			{
				System.out.println("You attacked with " + selectedWeapon + ".\nIt did 5 damage.");
				enemy1.enemyHealth = enemy1.enemyHealth - 5;
			}
			else
			{
				System.out.println("You attacked with fists.\nIt did no damage.");
			}
			System.out.println("Press anything to contine.");
			selectedWeapon = playerInput.nextLine();
			if (enemy1.enemyHealth > 0)
			{
				System.out.println("Enemy atacking.");
				Random randomGenerator = new Random();
				enemy1.enemyDamage = randomGenerator.nextInt(6);
				player1.playerHealth = player1.playerHealth - enemy1.enemyDamage;
				System.out.println("Enemy used dagger and you lost " + enemy1.enemyDamage + " health.\nYou now have " + player1.playerHealth + " health left.");
			}
			else
			{
				weaponsUnlocked = 3;
				break;
			}
		}
		
		
		
		System.out.println("You won the battle aginst a level 4 enemy.");
		System.out.println("Press anything to contine.");
		selectedWeapon = playerInput.nextLine();
		System.out.println("A lv. 4 enemy and a lv 2 enemy come to you.");
		enemy1.enemyHealth = 13;
		enemy2.enemyHealth = 5;
		
		
		
		while(enemy1.enemyHealth > 0)
		{
			amIDead();
			System.out.println("It's your turn to atack.\nEnemy lv 4 has " + enemy1.enemyHealth + " health left.\nEnemy lv 2 has " + enemy2.enemyHealth + " health left.");
			System.out.println("Which enemy are you atacking:\nlv 4\nlv 2");
			selectedWeapon = playerInput.nextLine();
			if(selectedWeapon.equalsIgnoreCase("lv 4"))
			{
				System.out.println("Which weapon.\nStone\nStick\nDagger");
				selectedWeapon = playerInput.nextLine();
				if(selectedWeapon.equalsIgnoreCase("stone"))
				{
					System.out.println("You attacked with " + selectedWeapon + ".\nIt did 1 damage.");
					enemy1.enemyHealth = enemy1.enemyHealth - 1;
				}
				else if(selectedWeapon.equalsIgnoreCase("stick"))
				{
					System.out.println("You attacked with " + selectedWeapon + ".\nIt did 3 damage.");
					enemy1.enemyHealth = enemy1.enemyHealth - 3;
				}
				else if(selectedWeapon.equalsIgnoreCase("dagger"))
				{
					System.out.println("You attacked with " + selectedWeapon + ".\nIt did 5 damage.");
					enemy1.enemyHealth = enemy1.enemyHealth - 5;
				}
				else
				{
					System.out.println("You attacked with fists.\nIt did no damage.");
				}
				System.out.println("Press anything to contine.");
				selectedWeapon = playerInput.nextLine();
				
				
				
				
					
					
				}
			if(selectedWeapon.equalsIgnoreCase("lv 2"))
			{
				System.out.println("Which weapon.\nStone\nStick\nDagger");
				selectedWeapon = playerInput.nextLine();
				if(selectedWeapon.equalsIgnoreCase("stone"))
				{
					System.out.println("You attacked with " + selectedWeapon + ".\nIt did 1 damage.");
					enemy2.enemyHealth = enemy2.enemyHealth - 1;
				}
				else if(selectedWeapon.equalsIgnoreCase("stick"))
				{
					System.out.println("You attacked with " + selectedWeapon + ".\nIt did 3 damage.");
					enemy2.enemyHealth = enemy2.enemyHealth - 3;
				}
				else if(selectedWeapon.equalsIgnoreCase("dagger"))
				{
					System.out.println("You attacked with " + selectedWeapon + ".\nIt did 5 damage.");
					enemy2.enemyHealth = enemy2.enemyHealth - 5;
				}
				else
				{
					System.out.println("You attacked with fists.\nIt did no damage.");
				}
				System.out.println("Press anything to contine.");
				selectedWeapon = playerInput.nextLine();
				
			}
			if (enemy1.enemyHealth > 0)
			{
				System.out.println("Enemy lv 4 atacking.");
				Random randomGenerator = new Random();
				enemy1.enemyDamage = randomGenerator.nextInt(6);
				player1.playerHealth = player1.playerHealth - enemy1.enemyDamage;
				System.out.println("Enemy lv 4 used dagger and you lost " + enemy1.enemyDamage + " health.\nYou now have " + player1.playerHealth + " health left.");
			}	
			if (enemy2.enemyHealth > 0)
			{
				System.out.println("Enemy lv 2 atacking.");
				Random randomGenerator = new Random();
				enemy1.enemyDamage = randomGenerator.nextInt(4);
				player1.playerHealth = player1.playerHealth - enemy2.enemyDamage;
				System.out.println("Enemy lv 2 used dagger and you lost " + enemy2.enemyDamage + " health.\nYou now have " + player1.playerHealth + " health left.");
			}	
			
		}
		
		
		
		System.out.println("You won the battle aginst a level 4 enemy and a level 2 enemy.\nYou got a first aid kit from the level 2");
		player1.playerHealth = player1.playerHealth +10;
		System.out.println("You now have " + player1.playerHealth + " health.");
		System.out.println("Press anything to contine.");
		selectedWeapon = playerInput.nextLine();
		System.out.println("You also gained a chainmail shirt from the level 4.");
		player1.playerHealth = player1.playerHealth +5;
		System.out.println("You now have " + player1.playerHealth + " health.");
		System.out.println("Press anything to contine.");
		selectedWeapon = playerInput.nextLine();
		
		
		
		
		JOptionPane.showMessageDialog(null, "Congrats!\nYou have beaten Dungeon Explorer.\nMade by Ethan Stacy.");
	}
	public static void amIDead()
	{
		if(player1.playerHealth < 1)
		{
		JOptionPane.showMessageDialog(null, player1.playerName + " has 0 health left.\nYou lost. Sorry!");
		System.exit(0);
		}
		else
		{
		
		}
		
	}
}