package com.resources;

import com.lac.annotations.Resource;

@Resource
public class SalaEspera2 implements SalaEspera{
	
	int count = 0;
	int cantMax = 20;
	int cantMin = 0;
	int multiplier = 100000000;
	public void sentarse(){
		for(int i = 0 ; i< multiplier ; i++)
			count++ ;
		System.out.println("Sala 2. Cant desp de SENTARSE 2: " + count +  " Thread id: " + Thread.currentThread().getId());
		if(count > cantMax*multiplier ){
			System.out.println("Sala 2-------" + "ERROR SENTARSE 2: " + count +  " Thread id: " + Thread.currentThread().getId() + "-------");
		}
	}
	
	public void levantarse(){
		for(int i = 0 ; i< multiplier ; i++)
			count-- ;
		System.out.println("Sala 2. Cant desp de LEVANTARSE 2: " + count +  " Thread id: " + Thread.currentThread().getId());
		if(count < cantMin){
			System.out.println("Sala 2-------" + "ERROR SENTARSE 2: " + count +  " Thread id: " + Thread.currentThread().getId() + "-------");
		}
	}

}
