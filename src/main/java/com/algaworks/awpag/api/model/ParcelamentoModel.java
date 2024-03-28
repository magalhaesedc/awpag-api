package com.algaworks.awpag.api.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParcelamentoModel {
	
	private Long id;
	//private String nomeCliente;
	private ClienteResumoModel cliente;
	private String descricao;
	private BigDecimal total;
	private Integer parcelas;
	private OffsetDateTime dataCriacao;
	
}
