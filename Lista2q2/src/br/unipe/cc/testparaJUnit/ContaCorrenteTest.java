package br.unipe.cc.testparaJUnit;

import junit.framework.TestCase;

public class ContaCorrenteTest extends TestCase {
	ContaCorrente c;

	protected void setUp() throws Exception {
		c = new ContaCorrente("", 0);
	}

	protected void tearDown() throws Exception {
		c = null;
	}

	public void testGetNumero() {
		assertEquals(c.getNumero(),"");
	}

	public void testSetNumero() {
		// se retirar o comentário vai retornar verdadeiro fail("Not yet implemented");
	}

	public void testGetSaldo() {
		assertFalse(c.getSaldo() != 0);
	}

}
