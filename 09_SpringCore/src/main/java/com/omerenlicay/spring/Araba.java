package com.omerenlicay.spring;

public class Araba {
	
	Yakıt yakıt;
	
	/*
	public Araba()
	{
		this.yakıt=new Yakıt();
		
	}
	*/
	
	public Araba(Yakıt yakıt)
	{
		this.yakıt=yakıt; //IoC - DI
		
	}
	
	public void calistir()
	{
		yakıt.depo();
		System.out.println("Araba calisiyor.");
	}
	
}
