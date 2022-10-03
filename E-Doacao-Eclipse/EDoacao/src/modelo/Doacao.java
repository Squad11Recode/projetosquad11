package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Doacao {

	private int Id_Doacao;
	private LocalDate Data_Doacao;
	private Doador doador;
	private TipoDoacao tipodoacao;
	
	public Doacao() {
		
	}
	public Doacao(int id_Doacao, LocalDate data_Doacao, String Tipo_Doacao) {
		super();
		Id_Doacao = id_Doacao;
		Data_Doacao = data_Doacao;
	}
	public int getId_Doacao() {
		return Id_Doacao;
	}
	public void setId_Doacao(int id_Doacao) {
		Id_Doacao = id_Doacao;
	}
	public LocalDate getData_Doacao() {
		return Data_Doacao;
	}
	public void setData_Doacao(LocalDate data_Doacao) {
		Data_Doacao = data_Doacao;
	}
	
	
public Doador getDoador() {
		return doador;
	}
	public void setDoador(Doador doador) {
		this.doador = doador;
	}
public TipoDoacao getTipoDoacao() {
		return getTipoDoacao();
	}
	public void setTipoDoacao(TipoDoacao tipodoacao) {
		this.setTipodoacao(tipodoacao);
	}
public TipoDoacao getTipodoacao() {
		return tipodoacao;
	}
	public void setTipodoacao(TipoDoacao tipodoacao) {
		this.tipodoacao = tipodoacao;
	}
DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
}

