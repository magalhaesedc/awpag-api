package com.algaworks.awpag.api.model.input;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ClienteIdInput {
	
	@NotNull
	private Long id;

}
