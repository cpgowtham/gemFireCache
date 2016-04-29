package com.client;

public class ClientUp {
	
	public static void main(String[] args) {
		
		Thread t = new Thread(new CacheClient());
		
		t.start();
	}

}
