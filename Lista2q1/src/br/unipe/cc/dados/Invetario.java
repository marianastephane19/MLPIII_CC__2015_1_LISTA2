package br.unipe.cc.dados;

import java.util.Set;
import java.util.TreeSet;

import br.unipe.cc.modelo.Item;

public class Invetario implements IInventario {

	private Set<Item> itens;

	public Invetario() {
		this.itens = new TreeSet<>();
	}

	@Override
	public boolean incluir(Item i) {
		if (i != null)
			return itens.add(i);
		return false;
	}

	@Override
	public boolean estaVazia() {

		return itens.isEmpty();
	}

	@Override
	public boolean pertece(Item i) {
		if (i != null)
			return itens.contains(i);
		return false;
	}

	@Override
	public void limpa() {
		itens.clear();

	}

	@Override
	public String toString() {
		return itens.toString();
	}

}
