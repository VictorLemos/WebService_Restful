package br.com.restful.resource;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.com.restful.BO.ProdutoBO;
import br.com.restful.model.Produto;

//Classe para acesso ao WebService
@Path("/produto")
public class ProdutoResource {
	
	@GET
	@Path("/listarTodos")
	@Produces("application/json")
	public ArrayList<Produto> listarTodos(){
		return new ProdutoBO().listarTodos();
	}
	
}
