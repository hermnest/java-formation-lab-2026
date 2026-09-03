package com.indra.transporte.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@ToString
@RequiredArgsConstructor
public class Bus {
    private final String placa;
    private final String tipo;
}
