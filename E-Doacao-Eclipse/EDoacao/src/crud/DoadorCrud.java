package crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.DoadorDAO;
import modelo.Doador;

public class DoadorCrud {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	DoadorDAO doadorDAO = new DoadorDAO();
	
	Scanner input = new Scanner(System.in);
	
	int opcao =0;
	int posicao =0;
	
	int id =0;
	String Nome ="";
	
	List<Doador>cliente = new ArrayList<Doador>();
	
//MENU
	
	System.out.println("--- CRUD DOADOR ---");
	System.out.println("1 - Cadastro de Doador");
	System.out.println("2 - Consulta de Doador");
	System.out.println("3 - Deletar Doador");
	System.out.println("4 - Atualizar Doador");
	System.out.println("0 - SAIR -");
	
	opcao = input.nextInt();
	
	//NAVEGAÇÃO DO CRUD
	
	switch (opcao) {
	
	case 1:
		System.out.println("++ Cadastrar Doador ++");
		System.out.println("Digite o Nome: ");
		Nome = input.nextLine();
		Nome = input.nextLine();
		
		Doador doador1 = new Doador();
		doador1.setNome(Nome);
		doadorDAO.save(doador1);
		
		System.out.println("\n +++ Cadastrado +++\n");
		break;
		
	case 2:
		//READ
			for (Doador a : doadorDAO.getDoador()) {
				System.out.println("Id: " + a.getId_Doador() + "Nome: " + a.getNome());
			}
		System.out.println("*Consulta Finalizada*");
		break;
		
	case 3:
		//DELETE
		System.out.println("Informe o ID para exclusão: ");
		posicao = input.nextInt();
		
		doadorDAO.deleteById(posicao);
		System.out.println("Cliente excluido com sucesso");
		break;
		
	case 4:
		//UPDATE
		System.out.println("Digite o ID do Doador: ");
		id= input.nextInt();
		System.out.println("Digite o novo nome do Doador: ");
		Nome = input.nextLine();
		Nome = input.nextLine();
		
		Doador doador2 = new Doador(id,Nome, Nome);
		doadorDAO.update(doador2);
		break;
		
		
		default:
			System.out.println(opcao != 0 ? "\n Opção Invalida\n" : "");
		break;
		
	
	}

	
	while (opcao != 0);
	input.close();
	System.out.println("Finalizado");

}
}