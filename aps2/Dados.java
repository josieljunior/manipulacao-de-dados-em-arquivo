package aps2;

public class Dados {

	private String data;
	private String hora;
	private String estacao;
	private String poluente;
	private String valor;
	private String unidade;
	private String tipo;
	private int id;
	private Dados proximo;
	
	
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getEstacao() {
		return estacao;
	}
	public void setEstacao(String estacao) {
		this.estacao = estacao;
	}
	public String getPoluente() {
		return poluente;
	}
	public void setPoluente(String poluente) {
		this.poluente = poluente;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Dados getProximo() {
		return proximo;
	}
	public void setProximo(Dados proximo) {
		this.proximo = proximo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
