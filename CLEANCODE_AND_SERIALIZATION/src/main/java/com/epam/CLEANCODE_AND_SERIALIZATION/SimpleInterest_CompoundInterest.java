package com.epam.CLEANCODE_AND_SERIALIZATION;

public class SimpleInterest_CompoundInterest 
{
	public static double simpleInterest(double Principal,int time,double rateOfInterest)
	{
		return (Principal*time*rateOfInterest)/(float)100;
	}
	
	public static double compoundInterest(double Principal,double rateOfInterest,double noOfYearsDeposited,int compoundedTimes)
	{
		return Principal*Math.pow((1+rateOfInterest/noOfYearsDeposited),compoundedTimes*noOfYearsDeposited);
	}
}
