package com.resources;

import com.lac.annotations.Resource;

@Resource
public class Barbero {
	
	int countClientes = 0;
	int cantMax = 1;
	int cantMin = 0;
	
	public void sentarCliente(){
		countClientes++;
		System.out.println("Sentando Cliente: " + countClientes +  " Thread id: " + Thread.currentThread().getId());
		if(countClientes > cantMax ){
			System.out.println("-------" + "ERROR Barbero: " + countClientes +  " Thread id: " + Thread.currentThread().getId() + "-------");
		}
	}
	
	public void afeitar(){
		System.out.println("Afeitando Cliente: " + countClientes +  " Thread id: " + Thread.currentThread().getId());
	}
	
	public void cobrar(){
		System.out.println("Cobrando Cliente: " + countClientes +  " Thread id: " + Thread.currentThread().getId());
		countClientes--;
		System.out.println("Cliente Liberado: " + countClientes +  " Thread id: " + Thread.currentThread().getId());
		if(countClientes < cantMin ){
			System.out.println("-------" + "ERROR Barbero: " + countClientes +  " Thread id: " + Thread.currentThread().getId() + "-------");
		}
	}
	
//	
//	public void tomarCliente(){
//		countClientes++;
//		System.out.println("Tomando Cliente: " + countClientes +  " Thread id: " + Thread.currentThread().getId());
//		if(countClientes > cantMax-1 ){
//			System.out.println("-------" + "ERROR Barbero: " + countClientes +  " Thread id: " + Thread.currentThread().getId() + "-------");
//		}
//	}
//	
//	public void liberarCliente(){
//		countClientes--;
//		System.out.println("Liberando Cliente: " + countClientes +  " Thread id: " + Thread.currentThread().getId());
//		if(countClientes < cantMin ){
//			System.out.println("-------" + "ERROR Barbero: " + countClientes +  " Thread id: " + Thread.currentThread().getId() + "-------");
//		}
//	}

}
