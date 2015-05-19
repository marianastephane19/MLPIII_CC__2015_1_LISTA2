package br.unipe.cc.dados;

import br.unipe.cc.modelo.Item;
import junit.framework.TestCase;

public class InvetarioTest extends TestCase {
	Invetario inventarioTeste;
	Item itemteste;
	Item itemteste2;
	Item itemtesteNull;

	protected void setUp() throws Exception {
		inventarioTeste = new Invetario();
		itemteste = new Item(0, "");
		itemteste2 = new Item(1, "");
		itemtesteNull = null;
	}

	protected void tearDown() throws Exception {
		inventarioTeste.limpa();
	}

	public void testestaVazia() {
		assertTrue(inventarioTeste.estaVazia());
	}

	public void testnaoEstaVazia() {
		testIncluir();
		assertFalse(inventarioTeste.estaVazia());
	}

	public void testEstaVaziaComNulo() {
		testIncluirNulo();
		testestaVazia();
	}

	public void testIncluir() {
		assertTrue(inventarioTeste.incluir(itemteste));
	}

	public void testIncluirNulo() {
		assertFalse(inventarioTeste.incluir(null));
	}

	public void testPertence() {
		testnaoEstaVazia();
		assertTrue(inventarioTeste.pertece(itemteste));
	}

	public void testnaoPertence() {
		testnaoEstaVazia();
		assertFalse(inventarioTeste.pertece(itemteste2));
	}

	public void testnaoPertenceNulo() {
		assertFalse(inventarioTeste.pertece(itemtesteNull));
	}

}
