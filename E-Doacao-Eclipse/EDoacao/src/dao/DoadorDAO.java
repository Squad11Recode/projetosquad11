package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import connection.connectionMySQL;
import modelo.Doador;

public class DoadorDAO {

	//CREATE
		public void save(Doador doador) {
			String sql= "INSERT INTO Doador (Nome, Email) VALUES (?,?,?)";
			
			Connection conn = null;
			PreparedStatement pstm = null;
			
			try {
				conn= connectionMySQL.createConnectionMySQL();
				pstm= conn.prepareStatement(sql);
				pstm.setString(1, doador.getNome());
				pstm.execute();
				
			}catch(Exception e){
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
		
		//READ
		public List<Doador> getDoador(){
			
			String sql = "SELECT * FROM Doador";
			
			List<Doador> doador = new ArrayList<Doador>();
			
			Connection conn = null;
			PreparedStatement pstm = null;
			
			ResultSet rset = null;
			
			try {
			conn = connectionMySQL.createConnectionMySQL();
				
			pstm = conn.prepareStatement(sql);
			
			rset = pstm.executeQuery();
			
			while(rset.next()) {
				Doador doador1 = new Doador();
				doador1.setId_Doador(rset.getInt("Id_Doador"));
				doador1.setNome(rset.getString("Nome"));
				doador1.setEmail(rset.getString("Email"));
				
				
				Doador.add(doador1);
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
			return doador;
		
		}
			
		
		//UPDATE
		public void update(Doador doador) {
			String sql="UPDATE Doador SET Nome = ? WHERE Id_Doador = ?";
			
			Connection conn = null;
			PreparedStatement pstm = null;
			
			try {
				conn = connectionMySQL.createConnectionMySQL();
				pstm = conn.prepareStatement(sql);
				
				pstm.setString(1,  doador.getNome());
				pstm.setInt(2, doador.getId_Doador());
				
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
		
		//DELETE
		public void deleteById(int id) {
			String sql= "DELETE FROM Doador WHERE Id_Doador=?";
			
			Connection conn = null;
			PreparedStatement pstm = null;
			
			try {
				conn = connectionMySQL.createConnectionMySQL();
				pstm = conn.prepareStatement(sql);
				pstm.setInt(1, id);
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
		}
