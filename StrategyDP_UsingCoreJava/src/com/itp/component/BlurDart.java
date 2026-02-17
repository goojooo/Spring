package com.itp.component;

public final class BlurDart implements ICourier {
	
	public BlurDart()
	{
		System.out.println("BlueDart.BlueDart()");
	}
	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return "BlueDart is delivering the " + oid + " order product";
	}

}
