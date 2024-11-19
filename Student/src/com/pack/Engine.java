package com.pack;

abstract class Engine{
	abstract void Enginetype();
}
class Car extends Engine{
	void Enginetype()
	{
		System.out.println("Car has engine");
	}
	public static void main(String[]args)
	{
		Car C=new Car();
		C.Enginetype();
	}
}