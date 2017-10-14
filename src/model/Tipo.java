package model;

public enum Tipo {
	BRINCO("Brinco"), CORDAO("Cordao"), GARGANTILHA("Gargantilha"), PULSEIRA("Pulseira"), ANEL("Aneis");
	
	private String label;
	
	private Tipo(String label){
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
}
