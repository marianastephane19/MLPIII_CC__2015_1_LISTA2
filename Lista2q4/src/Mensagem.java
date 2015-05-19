public class Mensagem implements Comparable<Mensagem>{
	private int codigo;
	private String texto;
	public Mensagem(int codigo, String texto) {
		super();
		this.codigo = codigo;
		this.texto = texto;
	}
	public String gettexto() {
		return texto;
	}
	public void settexto(String texto) {
		this.texto = texto;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	@Override
	public int compareTo(Mensagem o) {
        if (this.codigo<o.getCodigo())
        	return 1;
        if (this.codigo>o.getCodigo())
        	return -1;
		return 0;
	}
	
}
