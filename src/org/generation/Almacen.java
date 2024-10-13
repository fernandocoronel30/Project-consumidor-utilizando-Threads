package org.generation;

import java.util.ArrayList;

public class Almacen {
	//final:para crear una constante
	public final static ArrayList<Integer> lista = new ArrayList<Integer>();
	public final static int max = 100;
	
	public static void main(String[] args) {
		//crear productor, consumidor e iniciar
		Productor prod1 = new Productor("Productor 1");
		Consumidor cons1 = new Consumidor("Consumidor 1");
		Thread t1 = new Thread(cons1);
		prod1.start();
		t1.start();
		
	}//main
	
}//class Almacen
