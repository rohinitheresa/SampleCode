package Day1;

import java.util.Scanner;

public class VendingMachine {


	public static void main(String[] args) {
		System.out.println("Hai");
		final String Input = "OK";
		//Integer x = null;
		final String tea ="tea";
		final String coffee ="coffee";
		final String biscuits ="biscuits";
		final String puffs ="puffs";

		final String chocolate ="chocolate";
		System.out.println("Please press ok for the service");

		/*
		 * String Coffee = null; String Biscuits = null; String Puffs = null; String
		 * Chocolate = null;
		 */
		//System.out.println("Please press ok for the service");
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		if((Input).equalsIgnoreCase(userInput)){
			System.out.println("Please select your item from tea-5 Rupees, coffee- 10 Rupees, puffs- 7 Rupees, biscuits -20 Rupees, chocolate -15 Rupees");
			String itemSelected = scanner.nextLine();
			System.out.println("Please enter the amount to be paid, amount should be 1 rupee coin,2 rupee coin,5 rupee coin, 10 rupees coin, 20, 50 and 100");
			Integer x1 = scanner.nextInt();

			switch (itemSelected) {
			case tea:
				System.out.println("Selected item is Tea");
				acceptMoney(x1 ,itemSelected);
				break;
			case coffee:
				System.out.println("Selected item is Coffee ");
				acceptMoney(x1,itemSelected);
				break;
			case biscuits :
				System.out.println("Selected item is Biscuits");
				acceptMoney(x1,itemSelected);
				break;
			case puffs:
				System.out.println("Selected item is Puffs");
				acceptMoney(x1,itemSelected);
				break;
			case chocolate:
				System.out.println("Selected item is Chocolates");
				acceptMoney(x1,itemSelected);
				break;


			}


		}
	}
	public static void acceptMoney(Integer x, String itemSelected) {

		Boolean checkMoney = checkMoney(x);
		if(!checkMoney) {
			System.out.println("Money check failed");
			returnMoney(x);
		}
		else {
			calculateprice(x,itemSelected);
		}
	}

	public static void acceptMoneyInnegativeBal(Integer x, String itemSelected,Integer negbal) {

		Boolean checkMoney = checkMoney(x);
		if(!checkMoney) {
			System.out.println("Money check failed");
			returnMoney(x);
		}
		else {
			calculateprice(x+negbal,itemSelected);
		}
	}


	private static void calculateprice(Integer x, String itemSelected) {
		Integer teaprice=5;
		Integer coffeeprice=10;
		Integer puffprice=7;
		Integer biscuitprice=20;
		Integer Chocolateprice=15;

		switch (itemSelected) {
		case "tea":
			if(teaprice.equals(x)) {
				System.out.println("Please collect your tea");
			}
			else if(teaprice>x) {
				Integer negBal=teaprice - x	;
				System.out.println("Please enter "+negBal +"more");
				Scanner scanner = new Scanner(System.in);
				int nextInt = scanner.nextInt();
				acceptMoneyInnegativeBal(nextInt, itemSelected, x);
			}
			else if(teaprice<x)
			{
				Integer balance=	x - teaprice ;
				System.out.println("Please collect the balance amount "+balance);
				System.out.println("Please collect your tea $$");
			}
			break;
		case "coffee":
			if(coffeeprice.equals(x)) {
				System.out.println("Please collect your coffee");
			}
			else if(coffeeprice>x) {
				Integer negBal=coffeeprice - x	;
				System.out.println("Please enter "+negBal +"more");
				Scanner scanner = new Scanner(System.in);
				int nextInt = scanner.nextInt();
				acceptMoneyInnegativeBal(nextInt, itemSelected, x);		}
			else if(coffeeprice<x)
			{
				Integer balance=	x - coffeeprice ;
				System.out.println("Please collect the balance amount "+balance);
				System.out.println("Please collect your tea $$");
			}
			break;

		case "puffs":
			if(puffprice.equals(x)) {
				System.out.println("Please collect your puffs");
			}
			else if(puffprice>x) {
				Integer negBal=puffprice - x	;
				System.out.println("Please enter "+negBal +"more");
				Scanner scanner = new Scanner(System.in);
				int nextInt = scanner.nextInt();
				acceptMoneyInnegativeBal(nextInt, itemSelected, x);		}
			else if(puffprice<x)
			{
				Integer balance=	x - puffprice ;
				System.out.println("Please collect the balance amount "+balance);
				System.out.println("Please collect your puffs $$");
			}
			break;

		case "biscuits":
			if(biscuitprice.equals(x)) {
				System.out.println("Please collect your biscuits");
			}
			else if(biscuitprice>x) {
				Integer negBal=biscuitprice - x	;
				System.out.println("Please enter "+negBal +"more");
				Scanner scanner = new Scanner(System.in);
				int nextInt = scanner.nextInt();
				acceptMoneyInnegativeBal(nextInt, itemSelected, x);		}
			else if(biscuitprice<x)
			{
				Integer balance=	x - biscuitprice ;
				System.out.println("Please collect the balance amount "+balance);
				System.out.println("Please collect your biscuits $$");
			}
			break;

		case "chocolate":
			if(Chocolateprice.equals(x)) {
				System.out.println("Please collect your chocolate");
			}
			else if(Chocolateprice>x) {
				Integer negBal=Chocolateprice - x	;
				System.out.println("Please enter "+negBal +"more");
				Scanner scanner = new Scanner(System.in);
				int nextInt = scanner.nextInt();
				acceptMoneyInnegativeBal(nextInt, itemSelected, x);		}
			else if(Chocolateprice<x)
			{
				Integer balance=	x - Chocolateprice ;
				System.out.println("Please collect the balance amount "+balance);
				System.out.println("Please collect your chocolate $$");
			}
			break;

		}
	}
	private static void returnMoney(Integer x) {
		System.out.println("Please collect your money from the machine "+x);


	}
	public static Boolean checkMoney(Integer x){
		Integer coin1 = 1;
		Integer coin2 = 2;
		Integer coin5 = 5;
		Integer coin10 = 10;
		Integer TenRupees = 10;
		Integer TwentyRupees = 20;
		Integer FiftyRupees = 50;
		Integer HunRupees = 100;
		if(coin1 .equals(x)) {
			System.out.println("Entered money is acceptable");
			return true;
		}
		else if (coin2 .equals(x)) {
			System.out.println("Entered money is acceptable");
			return true;
		}
		else if (coin5 .equals(x)) {
			System.out.println("Entered money is acceptable");
			return true;
		}
		else if (coin10 .equals(x)) {
			System.out.println("Entered money is acceptable");
			return true;
		}
		else if (TwentyRupees .equals(x)) {
			System.out.println("Entered money is acceptable");
			return true;
		}
		else if (TenRupees .equals(x)) {
			System.out.println("Entered money is acceptable");
			return true;
		}
		else if (FiftyRupees .equals(x)) {
			System.out.println("Entered money is acceptable");
			return true;
		}
		else if (HunRupees .equals(x)) {
			System.out.println("Entered money is acceptable");
			return true;
		}
		else {
			System.out.println("Entered money is  not acceptable please enter again");
			return false;
		}


	}



}
