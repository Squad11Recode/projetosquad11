package modelo;

public class Doador {

	private int Id_Doador;
	private String Nome;
	private String Email;

	private Permissoes permissoes;

	public Doador() {
		
	}
	public Doador(int id_Doador, String nome, String email) {
		super();
		Id_Doador = id_Doador;
		Nome = nome;
		Email = email;
	}
	public int getId_Doador() {
		return Id_Doador;
	}
	public void setId_Doador(int id_Doador) {
		Id_Doador = id_Doador;
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public static void add(Doador doador) {
		
	}
	public Permissoes getPermissoes() {
		return permissoes;
	}
	public void setPermissoes(Permissoes permissoes) {
		this.permissoes = permissoes;
	}


	}
