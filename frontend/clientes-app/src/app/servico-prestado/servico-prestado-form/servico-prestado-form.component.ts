import { Component, OnInit } from '@angular/core';
import { Cliente } from '../../clientes/cliente';
import { ClientesService } from '../../clientes.service';
import { ServicoPrestado } from '../servico-prestado';

@Component({
  selector: 'app-servico-prestado-form',
  templateUrl: './servico-prestado-form.component.html',
  styleUrls: ['./servico-prestado-form.component.css']
})
export class ServicoPrestadoFormComponent implements OnInit {

  clientes: Cliente[] = []
  servico: ServicoPrestado;

  constructor(
    private ClienteService:ClientesService
  ) { 
    this.servico = new ServicoPrestado();
  }

  ngOnInit(): void {
    this.ClienteService
    .getClientes()
    .subscribe( response => this.clientes = response);
  }

  onSubmit() {
    console.log(this.servico)
  }

}
