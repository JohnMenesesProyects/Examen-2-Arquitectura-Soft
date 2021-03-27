package main.java.uia.com.contabilidad;

import java.util.ArrayList;

import main.java.uia.com.contabilidad.clientes.InfoUIA;
import main.java.uia.com.contabilidad.gestor.DecoradorProveedores;
import main.java.uia.com.contabilidad.gestor.DecoradorCheques; /* AGREGADO*/
import main.java.uia.com.contabilidad.gestor.Gestor;
import main.java.uia.com.contabilidad.proveedores.Proveedor;
import main.java.uia.com.contabilidad.cheques.Cheque; /*AGREGADO*/
import main.java.uia.com.presentacion.ClienteJSP;

public class ContabilidadUIA {
		
	    public Gestor contabilidad =  null;
		public DecoradorProveedores gestorProveedores = null;		
		public DecoradorCheques gestorCheques = null; /* AGREGADO*/		

		public ArrayList<ClienteJSP> listaProveedores = null;
		public ArrayList<ClienteJSP> listaCuentas = null;
		public ArrayList<ClienteJSP> listaCompras = null;
		public ArrayList<ClienteJSP> listaCheques= null; /* AGREGADO*/
		
		
		public Proveedor proveedor = null;
		public Cheque cheque = null; /* AGREGADO*/
		public String clienteId="";

		public ContabilidadUIA()
		{
			
			/*Cambio de ruta*/
		 contabilidad = new Gestor("C:\\Users\\jonat\\Documents\\ContabilidadUIA-MVC-JSP-Examen-master\\ContabilidadUIA-web-MVC-JSP\\ListaProveedores.json");		
		 gestorProveedores = new DecoradorProveedores(contabilidad, "proveedor");		 
		 gestorProveedores.Print();
		 listaProveedores = gestorProveedores.getLista();
		}
		/*GETTERS AND SETTERS AÑADIDOS PARA LA LISTA*/
		public ArrayList<ClienteJSP> getListaCheques() {
			return listaCheques;
		}


		public void setListaCheques(ArrayList<ClienteJSP> listaCheques) {
			this.listaCheques = listaCheques;
		}
		
		/* MÉTODO PARA DESPLEGAR LISTA DE CHEQUES*/
		
		public ArrayList<ClienteJSP> getCheques1(String clienteId) {
			this.clienteId = clienteId;
			cheque = (Cheque) this.gestorCheques.busca(clienteId);
			listaCheques = cheque.getLista();
			this.getCuentas(clienteId);
			return listaCheques;
		}

		public ArrayList<ClienteJSP> getListaCheques(String clienteId) {
			this.clienteId = clienteId;
			getCheques1(this.clienteId);
			return listaCheques;
		}
		/*////*/
		
		public ArrayList<ClienteJSP> getListaProveedores(String clienteName) {
			return listaProveedores;
		}

		public ArrayList<ClienteJSP> getListaProveedores() {
			return listaProveedores;
		}


		public void setListaProveedores(ArrayList<ClienteJSP> listaProveedores) {
			this.listaProveedores = listaProveedores;
		}


		public DecoradorProveedores getGestorProveedores() {
			return gestorProveedores;
		}

		public void setGestorProveedores(DecoradorProveedores gestorProveedores) {
			this.gestorProveedores = gestorProveedores;
		}


		public ClienteJSP getClienteById(String clienteId) {
			// TODO Auto-generated method stub
			return null;
		}


		public void borraCliente(String clienteId) {
			// TODO Auto-generated method stub
			
		}


		public ArrayList<ClienteJSP> getAllClientes() {
			// TODO Auto-generated method stub
			return null;
		}


		public void checkCliente(ClienteJSP cliente) {
			// TODO Auto-generated method stub
			
		}


		public ArrayList<ClienteJSP> getCuentas(String clienteName) 
		{
			this.listaCuentas = proveedor.getListaCuentas();
			return this.listaCuentas;
		}


		public ArrayList<ClienteJSP> getCompras(String clienteId) {
			this.clienteId = clienteId;
			proveedor = (Proveedor) this.gestorProveedores.busca(clienteId);
			listaCompras = proveedor.getLista();
			this.getCuentas(clienteId);
			return listaCompras;
		}

		public ArrayList<ClienteJSP> getListaCompras(String clienteId) {
			this.clienteId = clienteId;
			getCompras(this.clienteId);
			return listaCompras;
		}

		public ArrayList<ClienteJSP> getListaCompras() {
			return listaCompras;
		}

		public ArrayList<ClienteJSP> getListaCuentas() {
			return listaCuentas;
		}
		
		
		public ArrayList<ClienteJSP> getCheques(String clienteId2) {
			// TODO Auto-generated method stub
			return null;
		}
}
