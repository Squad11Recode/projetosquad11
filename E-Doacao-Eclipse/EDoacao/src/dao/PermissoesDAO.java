package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.connectionMySQL;
import modelo.Permissoes;

public class PermissoesDAO {

	//CREATE
		public void save(Permissoes permissoes) {
				String sql= "INSERT INTO Doador (Nome, Email) VALUES (?,?,?)";
				
				Connection conn = null;
				PreparedStatement pstm = null;
				
		try {
					conn= connectionMySQL.createConnectionMySQL();
					pstm= conn.prepareStatement(sql);
					pstm.setString(1, permissoes.getTipo_Permissao());
					pstm.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
		}
}

		}
		//DELETE
		public void deleteById(int id) {
			String sql= "DELETE FROM Permissoes WHERE Id_Permissao=?";
			
			Connection conn = null;
			PreparedStatement pstm = null;
			
			try {
				conn = connectionMySQL.createConnectionMySQL();
				pstm = conn.prepareStatement(sql);
				pstm.setInt(1, id);
				pstm.execute();
			}catch (Exception e) {
				e.printStackTrace();
}
		}
		


		//UPDATE
		public void update(Permissoes permissoes) {
			String sql="UPDATE Permissoes SET Tipo_Permissao = ? WHERE Id_Permissao = ?";
			
			Connection conn = null;
			PreparedStatement pstm = null;
			
			try {
				conn = connectionMySQL.createConnectionMySQL();
				pstm = conn.prepareStatement(sql);
				
				pstm.setString(1,  permissoes.getTipo_Permissao());
				pstm.setInt(2, permissoes.getId_Permissao());
				
				pstm.execute();
				
			}catch (Exception e) {
				e.printStackTrace();
			}finally{
				try {
					if(pstm != null) {
						pstm.close();
					}
					if (conn != null) {
						conn.close();
					}
					}catch (Exception e) {
						e.printStackTrace();
		}
		}
}

		//READ
		public List<Permissoes> getPermissoes(){
			
			String sql = "SELECT * FROM Permissoes";
			
			List<Permissoes> permissao = new ArrayList<Permissoes>();
			
			Connection conn = null;
			PreparedStatement pstm = null;
			
			ResultSet rset = null;
			
			try {
			conn = connectionMySQL.createConnectionMySQL();
				
			pstm = conn.prepareStatement(sql);
			
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				Permissoes permissao1 = new Permissoes();
				permissao1.setId_Permissao(rset.getInt("Id_Doador"));
				permissao1.setTipo_Permissao(rset.getString("Tipo_Permissao"));
				
				
				
				Permissoes.add(permissao1);
			}
			
			}catch (Exception e){
				e.printStackTrace();
		}finally{
			try {
				if (rset != null) {
					rset.close();
				}
				if(pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			return permissao;
		
		}
			
			}
		

		