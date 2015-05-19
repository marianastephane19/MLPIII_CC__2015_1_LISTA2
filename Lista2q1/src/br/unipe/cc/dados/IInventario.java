package br.unipe.cc.dados;

import br.unipe.cc.modelo.Item;

public interface IInventario {
	boolean incluir(Item i);
	boolean estaVazia();
	boolean pertece(Item i);
	void limpa();
	
}
