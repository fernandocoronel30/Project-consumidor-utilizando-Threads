package org.generation;

public class Consumidor implements Runnable{
	private String name;

	public Consumidor(String name) {
		this.name = name;
	}//constructor

	public String getName() {
		return name;
	}//getName

	public void setName(String name) {
		this.name = name;
	}//setName

	@Override
	public void run() {
		System.out.println("Inicio del consumidor " + this.getName());
		int cont = 0;
		while (cont < Almacen.max) {
			if(Almacen.lista.size() == 0) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//catch
			}//size == 0
			System.out.println(cont + " Consumidor " + this.getName() + " "  +
			Almacen.lista.remove(0) + " tamaño " + Almacen.lista.size());
			cont++;
		}//while
		System.out.println("*******Fin del consumidor " + this.getName());
	}//run
	
	
	
}//class Consumidor
