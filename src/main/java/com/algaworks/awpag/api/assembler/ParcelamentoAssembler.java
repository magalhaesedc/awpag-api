package com.algaworks.awpag.api.assembler;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.algaworks.awpag.api.model.ParcelamentoModel;
import com.algaworks.awpag.api.model.input.ParcelamentoInput;
import com.algaworks.awpag.domain.model.Parcelamento;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class ParcelamentoAssembler {
	
	private final ModelMapper modelMapper;
	
	public ParcelamentoModel toModel(Parcelamento parcelamento) {
		return modelMapper.map(parcelamento, ParcelamentoModel.class);
	}
	
	public List<ParcelamentoModel> toCollectionModel(List<Parcelamento> parcelamentos){
		return parcelamentos.stream().map(this::toModel).toList();
	}
	
	public Parcelamento toEntity(ParcelamentoInput parcelamentoInput) {
		return modelMapper.map(parcelamentoInput, Parcelamento.class);
	}

}
