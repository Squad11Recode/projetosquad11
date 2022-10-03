package modelo;

public class Permissoes {

	private int Id_Permissao;
	private String Tipo_Permissao;
	
	public Permissoes() {
		
	}
	public Permissoes(int id_Permissao, String tipo_Permissao) {
		super();
		Id_Permissao = id_Permissao;
		Tipo_Permissao = tipo_Permissao;
	}
	public int getId_Permissao() {
		return Id_Permissao;
	}
	public void setId_Permissao(int id_Permissao) {
		Id_Permissao = id_Permissao;
	}
	public String getTipo_Permissao() {
		return Tipo_Permissao;
	}
	public void setTipo_Permissao(String tipo_Permissao) {
		Tipo_Permissao = tipo_Permissao;
	}
	public static void add(Permissoes permissao1) {
		
		
	}


}
