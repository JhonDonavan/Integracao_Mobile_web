package model;

public enum Tipo {
	BRINCO("Brinco"), CORDAO("Cordao"), GARGANTILHA("Gargantilha"), PULSEIRA("Pulseira"), ANEL("Aneis");
	
	private String descricao;
	
	private Tipo(String descricao){
		this.descricao = descricao;
	}

	public String getLabel() {
		return descricao;
	}

	public void setLabel(String descricao) {
		this.descricao = descricao;
	}
	
}
