package com.rafaelamorim.cursomc.domain.enums;

public enum EstadoPagamento {
	
	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	private int cod;
	private String decricao;
	
	private EstadoPagamento(int cod, String descricao) {
		this.cod = cod;
		this.decricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDecricao() {
		return decricao;
	}
	
	public static EstadoPagamento toEnum(Integer cod) {
		
		if(cod == null) {
			return null;
		}
		
		for(EstadoPagamento estadoPagamento : EstadoPagamento.values()) {
			if(cod.equals(estadoPagamento.getCod())) {
				return estadoPagamento;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
