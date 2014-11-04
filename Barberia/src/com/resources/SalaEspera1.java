package com.resources;

import com.lac.annotations.Resource;

@Resource
public class SalaEspera1 implements SalaEspera{
	
	int count = 0;
	int cantMax = 10;
	int cantMin = 0;
	int multiplier = 100000000;
//	List<Client> clientsList = new ArrayList<Client>();
	
	public void sentarse(){
		for(int i = 0 ; i< multiplier ; i++)
			count++ ;
		System.out.println("Sala 1. Cant desp de SENTARSE: " + count +  " Thread id: " + Thread.currentThread().getId());
		if(count > cantMax*multiplier ){
			System.out.println("Sala 1-------" + "ERROR SENTARSE: " + count +  " Thread id: " + Thread.currentThread().getId() + "-------");
		}
	}
	
	public void levantarse(){
		for(int i = 0 ; i< multiplier ; i++)
			count-- ;
		System.out.println("Sala 1. Cant desp de LEVANTARSE: " + count +  " Thread id: " + Thread.currentThread().getId());
		if(count < cantMin){
			System.out.println("Sala 1-------" + "ERROR SENTARSE: " + count +  " Thread id: " + Thread.currentThread().getId() + "-------");
		}
	}

}
