package br.unipe.cc.ui;

import br.unipe.cc.dados.IInventario;
import br.unipe.cc.dados.Invetario;
import br.unipe.cc.modelo.Item;

public class Principal {

	public static void main(String[] args) {
		Item i1 = new Item(1, "Casa");
		Item i2 = new Item(2, "Carro");
		Item i3 = new Item(3, "Moto");
		Item i4 = new Item(4, "Poltrona");
		Item i5 = new Item(5, "Poltrona");
		// Item i5 = new Item(4, "Poltrona");
		
		IInventario invetario = new Invetario();
		
		System.out.println("Coleçao vazia :"+invetario.estaVazia());
		
		System.out.println("Interaçao i3:"+invetario.incluir(i3));
		System.out.println("Interaçao i1:"+invetario.incluir(i1));
		System.out.println("Interaçao i4:"+invetario.incluir(i4));
		System.out.println("Interaçao i2:"+invetario.incluir(i2));
		System.out.println("Interaçao i1:"+invetario.incluir(i1));
		
		System.out.println("Coleçao vazia :"+invetario.estaVazia());
		
		System.out.println("i2 está na coleçao :"+invetario.pertece(i2));
		
		System.out.println("i5 está na coleçao :"+invetario.pertece(i5));
		
		System.out.println("Lista de Alunos:"+invetario);
		
	}

}
