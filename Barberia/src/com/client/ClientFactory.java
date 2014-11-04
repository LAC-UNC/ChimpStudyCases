package com.client;

import java.util.ArrayList;
import java.util.List;

public class ClientFactory {
	
	protected static int clientQuantity = 0;
	public static List<Client> movingList = new ArrayList<Client>();
	
	private ClientFactory(){
		
	}
	
	public static Client newClient(){
		clientQuantity++;
		return new Client(clientQuantity);
	}
	
}
