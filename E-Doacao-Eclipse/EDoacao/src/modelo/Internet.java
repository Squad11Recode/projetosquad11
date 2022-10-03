package modelo;

public class Internet {

	private int Id_Internet;
	private String Tipo_Internet;

	public Internet(){
		
	}
	public Internet(int id_Internet, String tipo_Internet) {
		super();
		Id_Internet = id_Internet;
		Tipo_Internet = tipo_Internet;
		
	}
	public int getId_Internet() {
		return Id_Internet;
	}
	public void setId_Internet(int id_Internet) {
		Id_Internet = id_Internet;
	}
	public String getTipo_Internet() {
		return Tipo_Internet;
	}
	public void setTipo_Internet(String tipo_Internet) {
		Tipo_Internet = tipo_Internet;
	}
}
	
	



