package br.unipe.cc.modelo;

public class Item implements Comparable<Item> {
	private int codigoItem;
	private String descricaoItem;

	public Item(int codigoItem, String descricaoItem) {
		this.codigoItem = codigoItem;
		this.descricaoItem = descricaoItem;
	}

	public String getDescricaoItem() {
		return descricaoItem;
	}

	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}

	public int getCodigoItem() {
		return codigoItem;
	}

	public void setCodigoItem(int codigoItem) {
		this.codigoItem = codigoItem;
	}

	@Override
	public int compareTo(Item o) {
		if (this.codigoItem>o.codigoItem)
			return 1;
		if (this.codigoItem<o.codigoItem)
			return -1;
		return 0;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.codigoItem+" "+this.descricaoItem;
	}

}
