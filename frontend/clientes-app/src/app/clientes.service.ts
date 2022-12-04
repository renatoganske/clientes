import { Cliente } from './clientes/cliente';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class ClientesService {
  constructor() {}

  getCliente(): Cliente {
    let cliente: Cliente = new Cliente();
    cliente.nome = 'Fulano de Tal';
    cliente.cpf = '12345678912';
    return cliente;
  }
}
