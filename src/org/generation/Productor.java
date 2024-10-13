package org.generation;

public class Productor extends Thread{

	public Productor(String name) {
		super(name);
		
	}//constructor
	
	@Override
	public void run() {
		System.out.println("Inicio del productor " + this.getName());
		int cont = 0;
		while(cont < Almacen.max) {
			//(int): convierte a entero
			int num = (int) (Math.random() * 500);
			Almacen.lista.add(num);
			System.out.println(cont + " Productor " + this.getName() + " " + num + " size: " + Almacen.lista.size());
			
			try {
				Thread.sleep(num);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//catch
			cont++;
		}
		System.out.println("******Fin del productor " + this.getName());
	}//run
	
}//class Productor
