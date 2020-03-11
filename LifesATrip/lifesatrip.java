package lifesatrip;

import java.util.Scanner;
import java.util.Random;

public class lifesatrip 
{
	
	static int enemy_choice()
	{
		Random r_choice = new Random();
		
		int b_choice = 1+r_choice.nextInt(2);
		return b_choice;
		
	}
	

	static void Enemy_Fight(String player, String s_name, int e_health, int p_power, int k_power, String weapon) throws InterruptedException
	{
		int p_health = 100;

		String PAction;
		
		// Setting Dependencies 
		
		Scanner b_in = new Scanner(System.in);
		Random r_action = new Random();
		
		System.out.println("Hint: Your punches land 70% of the time. Kicks land 50% of the time but are more powerful.");
		System.out.println("You can punch or kick with saying 'punch' or 'kick'!");
		System.out.println("GOOD LUCK!");
		
		while (p_health >= 0 && e_health >= 0)
		{
			System.out.println(player + "'s Health: " + p_health);
			System.out.println(s_name +"'s Health: " + e_health);
			System.out.println("");
			System.out.print("> ");
			
			PAction = b_in.next();
			
			//Player choice logic.
			
			if (PAction.equalsIgnoreCase("punch"))
			{
				int ppunch_perc = 1+r_action.nextInt(10);
				
				
				Thread.sleep(1000);
				if (ppunch_perc <= 7)
				{
					e_health = e_health - 7;
					System.out.println("Punch Landed!");
				}
				else
				{
					System.out.println("Punch missed.");
				}
			}
			
			else if (PAction.equalsIgnoreCase("kick"))
			{
				int pkick_perc = 1+r_action.nextInt(10);
				
				
				if (pkick_perc <= 5)
				{
				e_health = e_health - 15;
					System.out.println("Kick Landed!");
				}
				else
				{
					System.out.println("Kick missed...");
				}
			}
			// Checking if enemy health is less then 0
			if (e_health <= 0)
			{
				Thread.sleep(2500);
				System.out.println("Boom! You delievered the final blow to " + s_name + ". You survived.");
				Thread.sleep(2500);
				
				break;
			}
			
			else
			{
				//Enemy Moves
				System.out.println(s_name+ " selecting his move.");
				Thread.sleep(1500);
				int ai_choice = enemy_choice();
				//Checking if we are fighting crackhead
				if (weapon == "crack")
				{
					
					int crack_rand = 1+r_action.nextInt(15);
					
					if (crack_rand >= 14)
					{
						p_power = 25;
						e_health = e_health + 12;
						k_power = 35;
						System.out.println("OH NO! Crackhead is pulling out his crack pipe!");
						Thread.sleep(2000);
						System.out.println("Smoking the crack pipe allows him to have super strength and gain HP");
						Thread.sleep(2000);
					}
				}
				
				if (ai_choice == 1)
				{
					System.out.println(s_name+ " has selected punch.");
					int bpunch_perc = 1+r_action.nextInt(10);
					
					
					if (bpunch_perc <= 7)
					{
						p_health = p_health - p_power;
						Thread.sleep(2000);
						System.out.println("LOOK OUT!");
						Thread.sleep(800);
						System.out.println(s_name+ " Punch Landed!");
					}
					else
					{
						Thread.sleep(2000);
						System.out.println(s_name+ " Punch missed!");
					}
				}
				
				if (ai_choice == 2)
				{
					System.out.println(s_name +" has selected kick.");
					int bkick_perc = 1+r_action.nextInt(10);
					
					if (bkick_perc <= 4)
					{
						p_health = p_health - k_power;
						Thread.sleep(2000);
						System.out.println("LOOK OUT!");
						Thread.sleep(800);
						System.out.println(s_name+ " Kick Landed!");
					}
					else
					{
						Thread.sleep(2000);
						System.out.println(s_name+ " Kick missed!");
					}
				}
				
				
			}
			// Checking if enemy health is less then 0
			if (p_health <= 0)
			{
				Thread.sleep(2500);
				System.out.println("You are knocked down and try and get to your feet but " + s_name + " is standing over you.");
				System.out.println("He smiles as his foot rises, shielding his face from your view.");
				System.out.println("One swift stomp to the head is enough to take you out.");
				Thread.sleep(5000);
				System.out.println("GAME OVER... Life's a trip huh?");
				System.exit(0);
			}
							
			
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		// Take in multiple strings, manipulate the strings, numerical test, 4 different branches 
		//Setting up the dependencies and declaring variables
		
		
		String s_class, college = null;
		int privlage, s_smarts, money;
		int health = 100;
		int karma = 0;
		String weapon;
		
		Scanner sc = new Scanner(System.in);
		Random l_dice = new Random();
		
		//Born
		
		System.out.println("Welcome to the Game, Life's a trip.");
		System.out.println("------------------------------------");
		System.out.println("First thing is first.. What should we name you?");
		System.out.print("> ");
		
		//Read name
		
		String p_name = sc.nextLine();
		p_name = p_name.toUpperCase()+"007";
		System.out.println("Well.. hello " + p_name + " it's very nice to meet you.");
		
		//Sleep function 
		
		System.out.println("But. As you may know.. not even was created equal and lucky");
		Thread.sleep(2000);
		System.out.println("Let's see how lucky you are in life!");
		System.out.println("Rolling Life's Dice!");
		Thread.sleep(4000);
		
		//Dice Roll
		
		int number = 1+l_dice.nextInt(20);

		
		//Decision making logic 
		
		if (number <= 4)
			
		{
			privlage = 1;
			s_smarts = 3;
			money = 1;
			s_class = "Poor";
			System.out.println("Looks like you were unfortuantly born into a poor family...");
			System.out.println("Your money privalage and money levels will not be as high as other"
					+ "users");
			System.out.println("But sometimes... life has a funny way of working out in your favor");
			Thread.sleep(3000);
			
		}
		else if (number >= 18)
			
		{
			privlage = 3;
			s_smarts = 1;
			money = 3;
			s_class = "Rich";
			System.out.println("Looks like you were born into a rich family. Lucky you!");
			System.out.println("You will have much higher money levels then other players");
			System.out.println("But be careful. Sometimes fortune comes with a price.");
			Thread.sleep(3000);
			
			
		}
		else
			
		{
			privlage = 2;
			s_smarts = 2;
			money = 2;
			s_class = "Middle";
			System.out.println("Like 70% of americans like you were born into a middle class family.");
			System.out.println("Your stats will be pretty average across the board.");
			Thread.sleep(3000);

		}
		
		//Fast forward - Age 6
			
		System.out.println("Now that we know you were born into a " + s_class + " family. Lets fast forward a bit");
		Thread.sleep(3000);
		
		//First Age conflict menu
		
		System.out.println("You are now 7 year's old. You are on the playground and see a boy who is big for his age"
				+ " picking on someone much smaller than him. \nThere are no teachers around. "
				+ "\nWhat do you do?");
		Thread.sleep(3000);
		System.out.println("1. Ignore. Not your problem.\n2. Join. Survival of the fittest.\n3. Tell the bully to pick on someone his own size. ");
		System.out.println("Enter Numerical Value");
		System.out.print("> ");
		//Read int
		int op1 = sc.nextInt();
		
		//Logic for Bully
		
		if (op1 == 1)
		{
			s_smarts++;
			System.out.println("Probably for the best. Keep your head down and don't get involved. Wise choice..");
		}
		else if (op1 == 2)
		{
			karma--;
			System.out.println("You laid your fist into the tortured child's face. As blood spurted out of his now broken\n"
					+ "nose, the bully gave you a twisted smile that burned in your mind for years to come.");
			
		}
		else if (op1 == 3)
		{
			karma++;
			System.out.println(p_name + ": " + "'Hey! Pick on someone your own size!'");
			Thread.sleep(750);
			System.out.println("Bully: " + "'Hahahaha. This was just my warmup. It looks like the REAL wimp is here!'");
			Thread.sleep(2000);
			System.out.println("He's starting to walk towards you now! What do you do now?!");
			System.out.println("1. Kick his ass!\n2. Apologize. Beg for forgivness.\nEnter Numerical value.");
			int op2 = sc.nextInt();
			if (op2 == 1)
			{
				// BULLY FIGHT MOTHA FUCKA
				System.out.println(p_name + ": " + "'LETS DO THIS!!");
				Thread.sleep(3000);
				//Fight function. takes player name, sprite name, enemy health, punch power, kick power
				Enemy_Fight(p_name, "School-Yard Bully", 50, 10, 21, "");
			}
			else
			{
				System.out.println(p_name + ": " + "'Okay. I don't want any more trouble. I'm sorry!'");
				Thread.sleep(750);
				System.out.println("Bully: " + "'Doesn't work like that kid.'");
				Thread.sleep(2000);
				System.out.println("The bully punched you in the face but at least you're not dead.");
				Thread.sleep(1000);
				
			}
			
			
		}
		else
		{
			karma = -3;
			health = 75;
			weapon = "None. Dev's nerfed"; 
			System.out.println("You want to try and choose options that don't exist...");
			Thread.sleep(1000);
			System.out.println("Something tells me the devs dont like that too much.\n"
					+ "Have fun with all your stats completely buffed for the remainder of the game.");
		}
		
		//After first choice 
		System.out.println("12 years later...");
		Thread.sleep(2000);
		System.out.println("After a lot of dedication and hardwork.. you're applying to colleges."
				+ "\nLet's see what is available for you!");
		
		Thread.sleep(1000);
		System.out.println("Sending in applications.");
		
		Thread.sleep(5000);
		System.out.println("You've been a good student and have the oppritunity to go to these colleges!"
				+ "\n1. UC Berkeley\n2. San Diego State (SDSU)\n3. Harvard");
		boolean looper = true;
		while (looper == true)
		{	
		System.out.print("Enter Your option numerically: ");
		int c_college = sc.nextInt();
		if (c_college == 1)
		{
			if (money > 1)
			{
				college = "Berkeley";
				System.out.println("Congrats on yor choice to go to " + college + "!");
				looper = false;
			}
			else
			{
				System.out.println("Sorry.... You don't have the funds to attend this university. Please try again.");
				Thread.sleep(2000);
			}
			
		}
		if (c_college == 2)
		{
		
			college = "SDSU";
			System.out.println("Congrats on yor choice to go to " + college + "!");
			looper = false;
		}
		if (c_college == 3)
		{
			if (money > 2 && karma > 0)
			{
				college = "Harvard";
				System.out.println("Congrats on yor choice to go to " + college + "!");
				looper = false;
			}
			else if (money < 2)
			{
				System.out.println("Sorry.... You don't have the funds to attend this university. Please try again.");
				Thread.sleep(2000);
			}
			//Bad karma line 
			else if (karma < 0);
			{
				System.out.println("Oops! Looks like your application got lost and you can't attend this university..");
			
			}
			
		}
				
		}
		//After college selection
		
		Thread.sleep(4000);
		System.out.println("After years and years of dedication at " + college + " you've finally graduated!");
		System.out.println("2AM: You are walking down the street after your grad party, smile on your face.");
		Thread.sleep(1000);
		System.out.println("SUDDENLY!");
		System.out.println("A CRACKHEAD APPEARS AND IS APPROACHING YOU RAPIDLY");
		System.out.println("WHAT DO YOU DO?!"
				+ "\n1.Fight Him.\n2. RUN AS FAST AS YOU CAN.\n3.Try and reason with him.");
		System.out.print("Numerical Option: ");
		int crackhead_choice = sc.nextInt();
		//CrackHead Options 
		if (crackhead_choice == 1)
		{
			if (s_smarts >= 3)
			{
				System.out.println(p_name + ": Put em up! I can take you.");
				Thread.sleep(2500);
				System.out.println("Crack Head: HAHAHAHA I doubt it. I'm ready for you.");
				Thread.sleep(5000);
				Enemy_Fight(p_name, "Crackhead", 78, 14, 20, "crack");
						
			}
			else
			{
				System.out.println("Before you can put up your hands, the crackhead pulls out his crack pipe.");
				Thread.sleep(2000);
				System.out.println("He breaks the pipe on the ground and stabs you in the neck with it.");
				System.out.println("There you lay on the ground bleeding out as he steals your wallet.");
				Thread.sleep(2000);
				System.out.println("You died at 2:03 AM at 21 years old. This becomes your legacy."
						+ "\nThis is the end for you. Life's a trip huh?");
				Thread.sleep(6000);
				System.exit(0);
			}
		
		}
		if (crackhead_choice == 2)
		{
			if (s_smarts >= 3)
			{
				System.out.println("You ran as fast as you could and got away! Good job!");
						
			}
			else
			{
				System.out.println("You take off as fast as you can but you hear footsteps behind you getting louder and louder.");
				Thread.sleep(2000);
				System.out.println("He catches up wit you and tackles you to the ground ");
				Thread.sleep(3500);
				System.out.println("He breaks his crack pipe on the ground and stabs you in the neck with it.");
				System.out.println("There you lay on the ground bleeding out as he steals your wallet.");
				Thread.sleep(6000);
				System.out.println("You died at 2:05 AM at 21 years old. This becomes your legacy."
						+ "\nThis is the end for you. Life's a trip huh?");
				Thread.sleep(3000);
				System.exit(0);
			}
		}
		if (crackhead_choice == 3)
		{
			System.out.println(p_name + ": Hello Sir, how are you?");
			Thread.sleep(2000);
			System.out.println("Crackhead: Give. Me. Money. NOW.");
			Thread.sleep(1500);
			System.out.println(p_name + ": But is it really money you want? I can offer you some food? Water?");
			Thread.sleep(2000);
			System.out.println("Crackhead: I do not want your food. or water *Pulls out knife* Give me money.");
			Thread.sleep(2000);
			System.out.println(p_name + ": Please sir! This is want you want to do.");
			Thread.sleep(2000);
			System.out.println("Crackhead: If you're not going to give it to me. I'll take it.");
			Thread.sleep(2000);
			System.out.println("The strange man pulls you close and stabs you in the gut with force 10 times.");
			System.out.println("There you lay on the ground bleeding out as he steals your wallet.");
			Thread.sleep(6000);
			System.out.println("You died at 2:05 AM at 21 years old. This becomes your legacy."
					+ "\nThis is the end for you. Life's a trip huh?");
			Thread.sleep(3000);
			System.exit(0);
		}
		
		
		
		
		
		System.out.println("Congratulations on getting away from the crackhead! Unfortunately this is the end of the trial version.");
		System.out.println("Please by the full game 'Life's a Trip' to continue.");
		Thread.sleep(3000);
		System.out.println("Thanks for playing ! :)");
		System.out.println("@TyBEaT's Gaming");
		
		}
	}
