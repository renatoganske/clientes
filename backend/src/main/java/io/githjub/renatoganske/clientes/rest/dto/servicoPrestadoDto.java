package io.githjub.renatoganske.clientes.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class servicoPrestadoDto {

    private String descricao;
    private String preco;
    private String data;
    private Integer idCliente;
}
