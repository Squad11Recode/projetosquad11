package modelo;

public class Equipamentos {

	private int Id_Equipamentos;
	private double Tipo_Equipamentos;
	private String Estado_Equipamentos;

	public Equipamentos(){
		
	}
	public Equipamentos(int id_Equipamentos, double tipo_equipamentos, String estado_equipamentos) {
		super();
		Id_Equipamentos = id_Equipamentos;
		Tipo_Equipamentos = tipo_equipamentos;
		Estado_Equipamentos = estado_equipamentos;
		
	}
	public int getId_Equipamentos() {
		return Id_Equipamentos;
	}
	public void setId_Equipamentos(int id_Equipamentos) {
		Id_Equipamentos = id_Equipamentos;
	}
	public double getTipo_Equipamentos() {
		return Tipo_Equipamentos;
	}
	public void setTipo_Equipamentos(double tipo_Equipamentos) {
		Tipo_Equipamentos = tipo_Equipamentos;
	}
		public String getEstado_Equipamentos() {
			return Estado_Equipamentos;
		}
		public void setEstado_Equipamentos(String estado_Equipamentos) {
			Estado_Equipamentos = estado_Equipamentos;
			
		
	}
}
	
	




