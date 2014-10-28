package br.com.restful.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.com.restful.factory.ConnectionFactory;
import br.com.restful.model.Produto;

public class ProdutoDAO extends ConnectionFactory {
	
	
	private static ProdutoDAO instance;
	
	//Singleton...
	public static ProdutoDAO getInstance(){
		if(instance == null)
			instance = new ProdutoDAO();
		return instance;
	}

	public ArrayList<Produto> listarTodos(){
		Connection conexao = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		conexao = criarConexao();
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		try {
			pstmt =  conexao.prepareStatement("select * from produto");
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				Produto produto = new Produto();
				
				produto.setCodProduto(rs.getInt("COD_PRODUTO"));
				produto.setRefProduto(rs.getString("REF_PRODUTO"));
				produto.setNomeProduto(rs.getString("NM_PRODUTO"));
				produto.setDescricao(rs.getString("DS_PRODUTO"));
				produto.setPreco(rs.getFloat("PRECO"));
				produto.setLogradouro(rs.getString("LOGRADOURO"));
				produto.setNumero(rs.getInt("NUMERO"));
				produto.setBairro(rs.getString("BAIRRO"));
				
				produtos.add(produto);
			}
			
		} catch (Exception e) {
			System.out.println("Erro ao listar todos os produtos " + e);
			e.printStackTrace();
		}finally{
			fecharConexao(conexao, pstmt, rs);
		}
		return produtos;
	}
}
