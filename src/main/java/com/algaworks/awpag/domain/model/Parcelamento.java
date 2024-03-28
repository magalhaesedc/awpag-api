package com.algaworks.awpag.domain.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.algaworks.awpag.domain.validation.ValidationGroup;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import jakarta.validation.groups.ConvertGroup;
import jakarta.validation.groups.Default;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Parcelamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    
    @Valid
    @ConvertGroup(from = Default.class, to = ValidationGroup.ClienteId.class)
    @NotNull
    @ManyToOne
    private Cliente cliente;

    @NotBlank
    @Size(max = 20)
    private String descricao;
    
    @NotNull
    @Positive
    private BigDecimal valorTotal;
    
    @NotNull
    @Positive
    @Max(12)
    private Integer quantidadeParcelas;
    
    private OffsetDateTime dataCriacao;

}