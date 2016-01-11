package com.brito.examples.soap;

public class HelloSoap 
{
	public String helloSoap(String name)
	{
		String soapMessage = "Welcome to SOAP from "+name;
		return soapMessage;
	}
}