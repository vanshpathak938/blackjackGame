import java.util.Random;
import java.util.Scanner;
public class blackjack
{
    public static void main(String[] args)
    {
    {
        String blue = "\033[104m\033[94m00000000000000000000000000000000000000000000000000000000000\033[30m\033[30m";
        String blue2 = "\033[104m\033[94m000000000000000000000000000000000000000000000000\033[30m\033[30m";
        System.out.println(blue);
        System.out.println(blue);
        System.out.println(blue);
        String blue3 = "\033[104m\033[94m0000000000\033[30m\033[30m";
        String white = "\033[107m\033[97m000000000000000000000000000000000000000\033[30m\033[30m";
        System.out.println(blue3 + white + blue3);
        String blue4 = "\033[104m\033[94m000000000\033[30m\033[30m";
        String white2 = "\033[107m\033[97m00000000000000000000000000000000000000000\033[30m\033[30m";
        System.out.println(blue4 + white2 + blue4);
        String blue5 = "\033[104m\033[94m00000000\033[30m\033[30m";
        String white3 = "\033[107m\033[97m0000000000000000000000000000000000000000000\033[30m\033[30m";
        System.out.println(blue5 + white3 + blue5);
        System.out.println(blue5 + white3 + blue5);
        System.out.println(blue5 + white3 + blue5);
        System.out.println(blue5 + white3 + blue5);
        System.out.println(blue5 + white3 + blue5);
        System.out.println(blue5 + white3 + blue5);
        System.out.println(blue5 + white3 + blue5);
        System.out.println(blue5 + white3 + blue5);
        String red = "\033[41m\033[31m000\033[30m\033[30m";
        String white4 = "\033[107m\033[97m00000000000000000000\033[30m\033[30m";
        System.out.println(blue5 + white4 + red + white4 + blue5);
        String red2 = "\033[41m\033[31m00000\033[30m\033[30m";
        String white5 = "\033[107m\033[97m0000000000000000000\033[30m\033[30m";
        System.out.println(blue5 + white5 + red2 + white5 + blue5);
        String red3 = "\033[41m\033[31m0000000\033[30m\033[30m";
        String white6 = "\033[107m\033[97m000000000000000000\033[30m\033[30m";
        System.out.println(blue5 + white6 + red3 + white6 + blue5);
        String red4 = "\033[41m\033[31m000000000\033[30m\033[30m";
        String white7 = "\033[107m\033[97m00000000000000000\033[30m\033[30m";
        System.out.println(blue5 + white7 + red4 + white7 + blue5);
        System.out.println(blue5 + white6 + red3 + white6 + blue5);
        System.out.println(blue5 + white5 + red2 + white5 + blue5);
        System.out.println(blue5 + white4 + red + white4 + blue5);
        System.out.println(blue5 + white3 + blue5);
        System.out.println(blue5 + white3 + blue5);
        System.out.println(blue5 + white3 + blue5);
        System.out.println(blue5 + white3 + blue5);
        System.out.println(blue5 + white3 + blue5);
        System.out.println(blue5 + white3 + blue5);
        System.out.println(blue5 + white3 + blue5);
        System.out.println(blue5 + white3 + blue5);
        System.out.println(blue4 + white2 + blue4);
        System.out.println(blue3 + white + blue3);
        System.out.println(blue);
        System.out.println(blue);
        
        
        System.out.println("-----------------------------------------------------------");
        System.out.println("\033[107m\033[97m00000000000000000000000000000000000000000000000000000000000\033[30m\033[30m");
    }
        Scanner start = new Scanner(System.in);
        System.out.println("Wanna play a game?");
        String start1 = start.nextLine();
        Scanner instructions = new Scanner(System.in);
        System.out.println("Do you need instructions on how to play blackjack?");
        String instructions1 = instructions.nextLine();
        
        
        if (instructions1.equals("yes"))
        {
            System.out.println("Your goal is for the sum of your cards to equal 21 or as close as you can get to 21 hit is to get another card and stand is to stay where you are gamble your coins wisely.");
        }    
        else 
        {
            System.out.println("Okay! you are ready to play!");
        }
        int coins = 1000;
        String line = "_______________________________________________________________";
        System.out.println(line);
        System.out.println("You will start with 1000 coins! you need to put in a value of   coins to gamble so we can start playing");
        int loop = 10;
        for (int i = 0; i < loop; i++)
        {
        Scanner gamble = new Scanner(System.in);
        System.out.println("Enter an amount of coins");
        int gamble1 = gamble.nextInt();
        System.out.println(line);
        System.out.println("Okay lets start dealing!");
        System.out.println("Just so you ace is worth 1");
        
        String Jack = "11";
		String Queen = "12";
		String King = "13";
		String Ace = "1";
		
		int Jack1 = Integer.parseInt(Jack); 
		int Queen1 = Integer.parseInt(Queen); 
		int King1 = Integer.parseInt(King); 
		int Ace1 = Integer.parseInt(Ace); 
		
        System.out.println(line);
        Scanner input = new Scanner(System.in);
		String[] cards = {(Ace), "2", "3", "4", "5", "6", "7", "8", "9", "10", (Jack), (Queen), (King)};
		String[] suit = {"Hearts", "Spades", "Diamonds", "Clubs"};
		int randNum = (int) (Math.random() * 13);
		int randSuit = (int) (Math.random() * 4);
		String chosenSuit = suit[randSuit];
		String chosenNum = cards[randNum] ;
		System.out.println("Your first card is a " + chosenNum + " of " + chosenSuit);
		
		Scanner input2 = new Scanner(System.in);
		String[] cards2 = {(Ace), "2", "3", "4", "5", "6", "7", "8", "9", "10", (Jack), (Queen), (King)};
		String[] suit2 = {"Hearts", "Spades", "Diamonds", "Clubs"};
		int randNum2 = (int) (Math.random() * 13);
		int randSuit2 = (int) (Math.random() * 4);
		String chosenSuit2 = suit[randSuit2];
		String chosenNum2 = cards[randNum2] ;
		System.out.println("Your second card is a " + chosenNum2 + " of " + chosenSuit2);
		
		Scanner hit = new Scanner(System.in);
		System.out.println("Do you want to hit or stand?");
		String hit1 = hit.nextLine();
		
	    int chosenNum7 = Integer.parseInt(chosenNum); 
		int chosenNum5 = Integer.parseInt(chosenNum2);
		int added = 0;
		
		String chosenNum3 = "";
		int chosenNum6 = 0;
		
		if (hit1.equals("hit"))
        {
        Scanner input3 = new Scanner(System.in);
		String[] cards3 = {"Ace","2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
		String[] suit3 = {"Hearts", "Spades", "Diamonds", "Clubs"};
		int randNum3 = (int) (Math.random() * 13);
		int randSuit3 = (int) (Math.random() * 4);
		String chosenSuit3 = suit[randSuit3];
		chosenNum3 = cards[randNum3] ;
		System.out.println("Your third card is a " + chosenNum3 + " of " + chosenSuit3);
		chosenNum6 = Integer.parseInt(chosenNum3);
        }  
        else 
        {
            added = chosenNum7 + chosenNum5;
            System.out.println("Your cards added up to " + added);
            
        }
        
	
		
		Scanner hit2 = new Scanner(System.in);
		System.out.println("Do you want to hit or stand?");
		String hit3 = hit2.nextLine();
		
		
		if (hit2.equals("hit"))
        {
        Scanner input4 = new Scanner(System.in);
		String[] cards4 = {(Ace), "2", "3", "4", "5", "6", "7", "8", "9", "10", (Jack), (Queen), (King)};
		String[] suit4 = {"Hearts", "Spades", "Diamonds", "Clubs"};
		int randNum4 = (int) (Math.random() * 13);
		int randSuit4 = (int) (Math.random() * 4);
		String chosenSuit4 = suit[randSuit4];
		String chosenNum4 = cards[randNum4] ;
		System.out.println("Your fourth card is a " + chosenNum4 + " of " + chosenSuit4);   
        }  
        else 
        
        {
            added = chosenNum7 + chosenNum5 + chosenNum6;
            System.out.println("Your cards added up to " + added);
            
        }
        
        System.out.println(line);
    
        Scanner input8 = new Scanner(System.in);
		String[] cards8 = {(Ace), "2", "3", "4", "5", "6", "7", "8", "9", "10", (Jack), (Queen), (King)};
		String[] suit8 = {"Hearts", "Spades", "Diamonds", "Clubs"};
		int randNum8 = (int) (Math.random() * 13);
		int randSuit8 = (int) (Math.random() * 4);
		String chosenSuit8 = suit[randSuit8];
		String chosenNum8 = cards[randNum8];
		
	    Scanner input9 = new Scanner(System.in);
		String[] cards9 = {(Ace), "2", "3", "4", "5", "6", "7", "8", "9", "10", (Jack), (Queen), (King)};
		String[] suit9 = {"Hearts", "Spades", "Diamonds", "Clubs"};
		int randNum9 = (int) (Math.random() * 13);
		int randSuit9 = (int) (Math.random() * 4);
		String chosenSuit9 = suit[randSuit9];
		String chosenNum9 = cards[randNum9];
		
		int chosenNum10=Integer.parseInt(chosenNum8);
		int chosenNum11=Integer.parseInt(chosenNum9);
		
		System.out.println("The computer got a " + chosenNum8 + " of " + chosenSuit8 + " and a " + chosenNum9 + " of " + chosenSuit9);
		int computervalue = chosenNum10 + chosenNum11 + 5;
		System.out.println("After playing some more the computer ended up with a final value of " + computervalue);
		if(computervalue > 21)
		{
		    System.out.println("The compter bust and you won!");
		    int coins2 = coins + gamble1;
		    System.out.println("You now have " + coins2 + " coins!");
		}
		else if(added < computervalue && computervalue < 21)
		{
		    System.out.println("The computer won :( you loose your coins");
		    int coins3 = coins - gamble1;
		    System.out.println("You now have " + coins3 + " coins!");
		}
        else if(added > 21)
		{
		    System.out.println("You bust and lost :(");
		    int coins4 = coins - gamble1;
		    System.out.println("You now have " + coins4 + " coins!");
		}
		else if(added > computervalue && added < 21)
		{
		    System.out.println("YOU WIN!");
		    int coins5 = coins + gamble1;
		    System.out.println("You now have " + coins5 + " coins!");
		}
    	else if(added > 21 && computervalue > 21)
		{
		    System.out.println("Its a tie! you can gain 50 coins!");
		    int coins6 = coins + 50;
		    System.out.println("You now have " + coins6 + " coins!");
		}
		else if(added > 21 && computervalue > 21 && added == computervalue)
		{
		    System.out.println("Its a tie! you can gain 50 coins!");
		    int coins7 = coins + 50;
		    System.out.println("You now have " + coins7 + " coins!");
		}
			else if (computervalue == 21)
		{
            System.out.println("The computer hit exactly 21 and won!");
		    int coins8 = coins - gamble1*2;
		    System.out.println("You now have " + coins8 + " coins!");
		}
		else if (added == 21)
		{
            System.out.println("You hit exactly 21 and won!");
		    int coins9 = coins + gamble1*2;
		    System.out.println("You now have " + coins9 + " coins!");
		}
		    if(coins<=0){
            System.out.println("Game over");
            System.exit(0);
        }
		}
    }
}
