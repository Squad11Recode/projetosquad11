package crud;


import java.util.Scanner;

import dao.PermissoesDAO;
import modelo.Permissoes;

public class PermissoesCRUD {

	
	public static void main(String[] args) {
	PermissoesDAO permissaoDAO = new PermissoesDAO();
	
	Scanner input = new Scanner(System.in);
	
	int opcao =0;
	int posicao =0;
	
	int id =0;
	String Nome ="";
	
	do {
		System.out.println("--- CRUD PERMISSÂO ---");
		System.out.println("1 - Cadastro de Permissão");
		System.out.println("2 - Consulta de Permissão");
		System.out.println("3 - Deletar Permissão");
		System.out.println("4 - Atualizar Permissão");
		System.out.println("0 - SAIR -");
		
		opcao = input.nextInt();
		
		String tipo;
		switch (opcao) {
		
		case 1:
			System.out.println("++ Cadastrar Permissão ++");
			System.out.println("Digite o Tipo: ");
			input.nextLine();
			tipo= input.nextLine();
			
			Permissoes permissao = new Permissoes();
			permissao.setTipo_Permissao(tipo);
			permissaoDAO.save(permissao);
			
			System.out.println("\n +++ Cadastrado +++\n");
			break;
			
		case 2:
			//READ
				System.out.println("\n +++ Consulta Permissão +++\n");
				for (Permissoes p : permissaoDAO.getPermissoes()) {
					System.out.println("Id: " + p.getId_Permissao() + "Tipo: " + p.getTipo_Permissao());
				}
			System.out.println("*Consulta Finalizada*");
			break;
			
		case 3:
			//DELETE
			System.out.println("Informe o ID da permissão: ");
			posicao = input.nextInt();
			
			permissaoDAO.deleteById(posicao);
			System.out.println("Permissão excluida com sucesso");
			break;
			
		case 4:
			//UPDATE
			System.out.println("Digite o ID da permissão: ");
			id= input.nextInt();
			System.out.println("Digite o novo tipo da permissão: ");
			tipo = input.nextLine();
			
			Permissoes permissao1 = new Permissoes(id,Nome);
			permissaoDAO.update(permissao1);
			break;
			
			
			default:
				System.out.println(opcao != 0 ? "\n Opção Invalida\n" : "");
			break;
		}
	}while (opcao !=0);
	input.close();
}
}