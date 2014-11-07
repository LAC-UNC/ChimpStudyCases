package com.resources;

import java.util.Random;

import com.lac.annotations.Resource;

@Resource
public class Barbero2 {
	
	int n = 2;
	int countClientes = 0;
	int cantMax = 1;
	int cantMin = 0;
	Random rand = new Random();
	
	public void sentarCliente() throws InterruptedException{
		Random rand = new Random();
		countClientes++;
		System.out.println("Barbero " + 1 + " - Sentando Cliente: " + countClientes +  " Thread id: " + Thread.currentThread().getId());
		Thread.sleep(rand.nextInt((1000 - 500) + 1) + 500);
		System.out.println("Barbero " + 1 + " - Cliente sentado: " + countClientes +  " Thread id: " + Thread.currentThread().getId());
		if(countClientes > cantMax ){
			System.out.println("-------" + "ERROR Barbero sentando: " + countClientes +  " Thread id: " + Thread.currentThread().getId() + "-------");
		}
	}
	
	public void afeitar() throws InterruptedException{
		System.out.println("Barbero " + n + " - Afeitando Cliente: " + countClientes +  " Thread id: " + Thread.currentThread().getId());
		Thread.sleep(rand.nextInt((5000 - 1000) + 1) + 1000);
		countClientes--;
		System.out.println("Barbero " + n + " - Termine de afeitar cliente: " + countClientes +  " Thread id: " + Thread.currentThread().getId());
	}
	
	public void cobrar() throws InterruptedException{
		countClientes++;
		System.out.println("Barbero " + n + " - Cobrando Cliente: " + countClientes +  " Thread id: " + Thread.currentThread().getId());
		Thread.sleep(rand.nextInt((5000 - 2000) + 1) + 1000);
		countClientes--;
		System.out.println("Barbero " + n + " - Cliente Liberado: " + countClientes +  " Thread id: " + Thread.currentThread().getId());
		if(countClientes < cantMin ){
			System.out.println("-------" + "ERROR Barbero cobrando: " + countClientes +  " Thread id: " + Thread.currentThread().getId() + "-------");
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
