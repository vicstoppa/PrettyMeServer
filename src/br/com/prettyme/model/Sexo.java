package br.com.prettyme.model;

public enum Sexo {
	
	MASCULINO("Masculino"),FEMININO("Feminino"),OUTROS("Outros");
	
	private final String label;
	
	private Sexo(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	
}
