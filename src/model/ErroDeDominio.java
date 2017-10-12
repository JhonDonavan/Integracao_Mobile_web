package model;

public class ErroDeDominio {
	private int 	id;
	private Class	classeOrigem;
	private String	mensagem;
	
	public ErroDeDominio(int id, Class classeOrigem, String mensagem) {
		super();
		this.id = id;
		this.classeOrigem = classeOrigem;
		this.mensagem = mensagem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Class getClasseOrigem() {
		return classeOrigem;
	}

	public void setClasseOrigem(Class classeOrigem) {
		this.classeOrigem = classeOrigem;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String toString() {
		return "Erro #" + id + ": " + mensagem + " (Origem: " + classeOrigem + ")";
	}
}
