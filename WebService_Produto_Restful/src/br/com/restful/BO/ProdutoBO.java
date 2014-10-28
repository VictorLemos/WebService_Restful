package br.com.restful.BO;

import java.util.ArrayList;

import br.com.restful.dao.ProdutoDAO;
import br.com.restful.model.Produto;

public class ProdutoBO {
	
public ArrayList<Produto> listarTodos(){
		return ProdutoDAO.getInstance().listarTodos();
	}

}
