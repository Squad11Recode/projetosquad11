package modelo;

import java.util.ArrayList;
import java.util.List;

public class TipoDoacao {

	private int Quantidade;

	private Dinheiro dinheiro;
	private Manutencao manutencao;
	private Equipamentos equipamentos;
	private Internet internet;

	private List<TipoDoacao> itens = new ArrayList <TipoDoacao>();


	public TipoDoacao() {
		
	}
	public TipoDoacao(int quantidade) {
		super();
		Quantidade = quantidade;
	}
	public int getQuantidade() {
		return Quantidade;
	}
	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}
	
	
	public Dinheiro getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro(Dinheiro dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	
	public Manutencao getManutencao() {
		return manutencao;
	}
	public void setViagem(Manutencao manutencao) {
		this.manutencao = manutencao;
	}
	
	
	public Equipamentos getEquipamentos() {
		return equipamentos;
	}
	public void setEquipamentos(Equipamentos equipamentos) {
		this.equipamentos = equipamentos;
	}
	
	
	public Internet getInternet() {
		return internet;
	}
	public void setInternet(Internet internet) {
		this.internet = internet;
	}
	
	
	
	public List<TipoDoacao> getItens() {
		return itens;
	}
	public void setItens(List<TipoDoacao> itens) {
		this.itens = itens;
	}

	}
