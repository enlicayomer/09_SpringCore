package com.omerenlicay.composition;

public class Araba {
	
	Yakıt yakıt;
	
	public Araba()
	{
		this.yakıt=new Yakıt();
		
	}

	public void calistir()
	{
		yakıt.depo();
		System.out.println("Araba calisiyor.");
	}
	
}
