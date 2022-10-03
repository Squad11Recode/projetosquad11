package modelo;


public class Dinheiro {

	private int Id_Dinheiro;
	private double Valor_Dinheiro;

	public Dinheiro(){
		
	}
	public Dinheiro(int id_Dinheiro, double valor_Dinheiro) {
		super();
		Id_Dinheiro = id_Dinheiro;
		Valor_Dinheiro = valor_Dinheiro;
		
	}
	public int getId_Dinheiro() {
		return Id_Dinheiro;
	}
	public void setId_Dinheiro(int id_Dinheiro) {
		Id_Dinheiro = id_Dinheiro;
	}
	public double getValor_Dinheiro() {
		return Valor_Dinheiro;
	}
	public void setValor_Dinheiro(double valor_Dinheiro) {
		Valor_Dinheiro = valor_Dinheiro;
	}
}
	
	


