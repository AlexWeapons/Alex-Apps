import { Component } from '@angular/core';
import { Cliente } from './cliente';
import { ClienteService } from './cliente.service';
import { Router, ActivatedRoute } from '@angular/router'
import swal from 'sweetalert2';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html'
})
export class FormComponent {
public cliente: Cliente = new Cliente;
public titulo:string = "Crear Cliente"

public errores: string[];

  constructor(private clienteService:ClienteService, 
    private router: Router,
    private activatedRoute: ActivatedRoute) { }

  ngOnInit() {
    this.cargarCliente()
  }

  cargarCliente(): void {
    this.activatedRoute.params.subscribe(params => {
      let id = params['id']
      if(id){
        this.clienteService.getCliente(id).subscribe((cliente) => this.cliente = cliente)
      }
    })
  }

  create(): void {
    this.clienteService.create(this.cliente)
    .subscribe(
      {
        next: cliente => {
          this.router.navigate(['/clientes'])
          swal.fire('Nuevo cliente', `El cliente ${cliente.nombre} he sido creado con éxito!`, 'success')
      },
      error: err => {
        this.errores = err.error.errors as string[];
        console.error('Codigo del error desde el backend' + err.status);
        console.error(err.error);
      }
    })
  }

  update():void{
    this.clienteService.update(this.cliente)
    .subscribe(
      {
      next: json => {
        this.router.navigate(['/clientes'])
        swal.fire('Cliente Actualizado', `${json.mensaje}: ${json.cliente.nombre}`, 'success')
    },
    error: err => {
      this.errores = err.error.errors as string[];
      console.error('Codigo del error desde el backend' + err.status);
      console.error(err.error);
    }
  })
}
}
