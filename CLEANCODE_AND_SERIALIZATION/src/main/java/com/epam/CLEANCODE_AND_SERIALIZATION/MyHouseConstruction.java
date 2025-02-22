package com.epam.CLEANCODE_AND_SERIALIZATION;

import java.util.Scanner;

public class MyHouseConstruction 
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter area of house");
		double areaOfHouse = sc.nextDouble();
		
		System.out.println("do you want a fully automated home(yes/no)");
		String automatedHome = sc.next().toLowerCase();
		boolean fullyAutomatedHome;
		
		if("yes".compareTo(automatedHome) == 0)
			fullyAutomatedHome = true;
		else
			fullyAutomatedHome = false;
			
		sc.nextLine();
		System.out.println("Enter material standard");
		String materialStandard = sc.nextLine();
		
		double constructionCost = HouseConstructionCost.cost(materialStandard,areaOfHouse,fullyAutomatedHome);
		System.out.println("cost is " + constructionCost);
		
		sc.close();

	}

}
