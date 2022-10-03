package modelo;

public class Manutencao {

	private int Id_Manutencao;
	private double Tipo_Manutencao;

	public Manutencao(){
		
	}
	public Manutencao(int id_Manutencao, double tipo_manutencao) {
		super();
		Id_Manutencao = id_Manutencao;
		Tipo_Manutencao = tipo_manutencao;
		
	}
	public int getId_Manutencao() {
		return Id_Manutencao;
	}
	public void setId_Dinheiro(int id_Manutencao) {
		Id_Manutencao = id_Manutencao;
	}
	public double getTipo_Manutencao() {
		return Tipo_Manutencao;
	}
	public void setValor_Manutencao(double tipo_manutencao) {
		Tipo_Manutencao = tipo_manutencao;
	}
}
	
	



