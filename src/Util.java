// Aluno: Eduardo Luiz Pontes de Souza - UC19100270
import java.util.ArrayList;

public class Util { // Respons�vel por imprimir o menu e fazer os inputs para o usu�rio, possui
					// arrays que auxiliam na hora da cria��o do perfil e pedido

	static Cliente criarCliente(int i) { // Cria��o do cliente feita pela Util
		String nome = View.inserir_string("Insira seu nome completo: ");
		String cpfCliente = View.inserir_string("Insira o seu CPF: ");
		String endereco = View.inserir_string("Informe seu endere�o: ");
		int idade = View.inserir_int("Insira sua idade: ");
		int telefoneCliente = View.inserir_int("Insira um telefone para contato: ");

		Cliente fulano = new Cliente(nome, cpfCliente, endereco, idade, telefoneCliente);
		return fulano;
	}

	static void criarClientes(ArrayList<Cliente> clientes) {
		int i = 1;

		for (i = 1; i <= 1; i++) {
			if (i <= 1) {
				clientes.add(Util.criarCliente(i));
				MenuPizza.qtClientes++;
			}
		}

		View.exibirMensagem("Pedido feito com sucesso!"
				+ "\n Confira sua nota de pedido, se dirija ao caixa para efetuar o pagamento validando seu pedido e buon appetito!");
	}

	static MenuPizza subMenuPizza(int i) {
		int valorPizza = 0;
		String tamPizza = "";
		int borda = 0;
		String bordaS = "";
		int taxa = 0;
		String taxaS = "";
		String showSabor = "";
		int primeiroMenu = 0;
		
		primeiroMenu = View.inserir_int("                          MENU 1\n" // Primeiro menu interativo
				+ "Insira o que deseja fazer: \n\n"												// do programa
				+ "1. Inicializar programa\n"
				+ "2. Sobre"); 
		
		switch (primeiroMenu) {
		case 1:	// Inicia o segundo menu		
			break;
			
		case 2: // Fun��o Sobre para falar sobre o projeto desenvolvido
			View.exibirERRO("Projeto desenvolvido no ambiente de desenvolvimento integrado Eclipse, imagem fict�cia feita \n"
					+ "com a ajuda do Photoshop por Eduardo Luiz Pontes de Souza - UC19100270, sem fins comerciais, \n" 
					+ "apenas com intuito de obten��o de notas na mat�ria de Programa��o Orientada a Objetos\n"
					+ "ministrada pelo professor Michel Carmo Lopes. \n\n"
					+ "Neste projeto busquei simular a implementa��o de um sistema de pedidos/cadastros de uma \n"
					+ "pizzaria italiana de forma fidedigna. S�o pizzas inteiras que possuem todas as valida��es necess�rias \n"
					+ "e, por fim, geram uma nota que pode ser impressa no caixa, deixando assim a atendente a par da \n"
					+ " problem�tica, a mesma nota pode ser enviada para a cozinha para a confec��o da pizza.", "Aten��o!");
			break;

		default:
			throw new IllegalArgumentException("[MENU 1]: Valor inv�lido.");
		}
		
		// Mensagem de boas-vindas junto com o menu para o usu�rio escolher a pizza"
		View.exibirMensagem("SII BENVENUTO A PIZZARIA SALIERI!\n"
				+ " Nossa equipe de atendimento est� pronta para te receber da melhor forma!");
		
		
		int idPizza = View.inserir_int("                                                             MENU 2\n\n"
				+ "PIZZAS SALGADAS:\n"
				+ "1. Salieri (Presunto, palmito, bacon, champion e cebola)\n"
				+ "2. 4 Queijos (Provolone, catupiry, cheddar e mussarela)\n" 
				+ "3. Alho e �leo (Alho e tomate)\n"
				+ "4. Atum (Atum e cebola)\n" 
				+ "5. Bacon (Bacon e Tomate\n"
				+ "6. Bahiana (Calabresa, pimenta, cebola e piment�o)\n" 
				+ "7. Bauru (Presunto e tomate)\n"
				+ "8. Italiana (Atum, cebola, palmito, ervilha)\n" 
				+ "9. Calabresa (Calabresa)\\n"
				+ "10. Carne de Sol (Carne de sol, tomate e cebola)\n"
				+ "11. Del�cia da Casa (Lombinho, peito de peru, calabresa, bacon, milho e cebola)\n"
				+ "12. Du Chefe (Frango, calabresa, bacon e tomate)\n"
				+ "13. Flora (Presunto, atum, ovos, e calabresa)\n"
				+ "14. Frango ao Creme (Frango, creme de leite e batata palha)\n" 
				+ "15. Frango (Frago e catupiry)\n"
				+ "16. Lombinho (Lombinho e cebola)\n" 
				+ "17. Margarita (Queijo, parmess�o, manjeric�o e tomate)\n"
				+ "18. Milho Verde (Milho)\n" 
				+ "19. Mineirinha (Frango, bacon e milho)\n"
				+ "20. Moda Pizzaiolo (Frango, cereme de leite e milho)\n" 
				+ "21. Mussarela (Tomate)\n"
				+ "22. Namorada (Presunto, bacon, catupiry e palmito)\n" 
				+ "23. Palmito (Palmito)\n"
				+ "24. Peito de Peru (Peito de peru e cebola)\n"
				+ "25. Portuguesa (Presunto, calabresa, ovos, cebola, piment�o e provolone)\n"
				+ "26. Toscana (Calabresa, bacon e catupiry)\n"
				+ "27. Vegetariana (Champion, piment�o, palmito, tomate, milho e ervilha)\n"
				+ "28. Caipira (Milho, frango e catupiry, bacon, tomate, cebola e piment�o)\n\n"

				+ "PIZZAS DOCES:\n" 
				+ "29. Banana (Mussarela, banana e canela)\n"
				+ "30. Romeu e Julieta (Mussarela com doce de goiaba)\n"
				+ "31. Calif�rnia (Mussarela, lombinho, p�ssego, figo e abacaxi)\n"
				+ "32. Chocolate e Banana (Mussarela, chocolate preto e banana)\n"
				+ "33. Prest�gio (Mussarela, chocolate preto, coco ralado e leite condensado)\n"
				+ "34. Chocolate e P�ssego (Mussarela, chocolate preto e p�ssego)\n"
				+ "35. Chocolate (Mussarela e chocolate preto)\n\n"
				+ "Escolha um sabor: \n" );

		switch (idPizza) {// Switch case puramente visual com o intuito de deixar o sistema mais bonito,
							// utilizado para imprimir o sabor da pizza no toString
		case 1:
			showSabor = "SALIERI";
			break;
		case 2:
			showSabor = "4 QUEIJOS";
			break;
		case 3:
			showSabor = "ALHO E �LEO";
			break;
		case 4:
			showSabor = "ATUM";
			break;
		case 5:
			showSabor = "BACON";
			break;
		case 6:
			showSabor = "BAHIANA";
			break;
		case 7:
			showSabor = "BAURU";
			break;
		case 8:
			showSabor = "ITALIANA";
			break;
		case 9:
			showSabor = "CALABRESA";
			break;
		case 10:
			showSabor = "CARNE DE SOL";
			break;
		case 11:
			showSabor = "DEL�CIA DA CASA";
			break;
		case 12:
			showSabor = "DU CHEF";
			break;
		case 13:
			showSabor = "FLORA";
			break;
		case 14:
			showSabor = "FRANGO AO CREME";
			break;
		case 15:
			showSabor = "FRANGO";
			break;
		case 16:
			showSabor = "LOMBINHO";
			break;
		case 17:
			showSabor = "MARGARITA";
			break;
		case 18:
			showSabor = "MILHO VERDE";
			break;
		case 19:
			showSabor = "MINEIRINHA";
			break;
		case 20:
			showSabor = "MODA PIZZAIOLO";
			break;
		case 21:
			showSabor = "MUSSARELA";
			break;
		case 22:
			showSabor = "NAMORADA";
			break;
		case 23:
			showSabor = "PALMITO ";
			break;
		case 24:
			showSabor = "PEITO DE PERU";
			break;
		case 25:
			showSabor = "PORTUGUESA";
			break;
		case 26:
			showSabor = "TOSCANA";
			break;
		case 27:
			showSabor = "VEGETARIANA";
			break;
		case 28:
			showSabor = "CAIPIRA";
			break;
		case 29:
			showSabor = "BANANA";
			break;
		case 30:
			showSabor = "ROMEU E JULIETA";
			break;
		case 31:
			showSabor = "CALIF�RINA";
			break;
		case 32:
			showSabor = "COCOLATE E BANANA";
			break;
		case 33:
			showSabor = "PREST�GIO";
			break;
		case 34:
			showSabor = "CHOCOLATE E P�SSEGO";
			break;
		case 35:
			showSabor = "CHOCOLATE";
			break;
		default:
			break;
		}

		View.exibirMensagem("Hmm, delizioso!");
		
		int intTamPizza = View.inserir_int("Selecione o tamanho: \n" + "1. Pequena = R$22.00\n"
				+ "2. M�dia = R$ 27.00\n" + "3. Grande = R$32.00\n"); // Sele��o do tamanho de pizza e visualiza��o
																	// de pre�os pelo usu�rio
		switch (intTamPizza) {
		case 1:
			if (intTamPizza == 1) {
				valorPizza = 22;
				tamPizza = "PEQUENA";
			}
			break;
		case 2:
			if (intTamPizza == 2) {
				valorPizza = 27;
				tamPizza = "M�DIA";
			}
			break;
		case 3:
			if (intTamPizza == 3) {
				valorPizza = 32;
				tamPizza = "GRANDE";
			}
		default:
			break;
		}

		borda = View.inserir_int("Insira se deseja adicionar bordas:\n" + "1. Catupiry\n" + "2. Cheddar\n"
				+ "3. Doce de Leite\n" + "4. Goiabada\n" + "5. Chocolate\n" + "6. Sem bordas");// Sele��o de borda
																								// da pizza pelo
																								// usu�rio
		if (borda == 1) {
			bordaS = "CATUPIRY";
		} else if (borda == 2) {
			bordaS = "CHEDDAR";
		} else if (borda == 3) {
			bordaS = "DOCE DE LEITE";
		} else if (borda == 4) {
			bordaS = "GOIABADA";
		} else if (borda == 5) {
			bordaS = "CHOCOLATE";
		} else if (borda == 6) {
			bordaS = "SEM BORDAS";
		} else {
			throw new IllegalArgumentException("[BORDA DA PIZZA]: Valor inv�lido.");
		}

		taxa = View
				.inserir_int("Insira se gostaria de utilizar nosso servi�o delivery ou se far� a retirada no local:\n"
						+ "1. Entrega (TAXA DE ENTREGA: R$5.00)\n" + "2. Comer ou retirar no local\n");
		// Sele��o de delivery ou n�o feito pelo usu�rio
		if (taxa == 1) {
			taxaS = "PEDIDO PARA ENTREGA";
			valorPizza = valorPizza + 5; // Acrescimo de taxa de entrega
		} else if (taxa == 2) {
			taxaS = "COMER OU RETIRAR NO LOCAL";
		} else {
			throw new IllegalArgumentException("[ENTREGA/RETIRADA]: Valor inv�lido.");
		}

		MenuPizza escolhaID = new MenuPizza(idPizza, showSabor, intTamPizza, valorPizza, tamPizza, borda, bordaS, taxa,
				taxaS);
		return escolhaID;
	}

	static void arrayMenuPizza(ArrayList<MenuPizza> menupizzas) {
		int i = 1;

		for (i = 1; i <= 1; i++) {
			if (i <= 1) {
				menupizzas.add(Util.subMenuPizza(i));
				MenuPizza.qtMenu++;
			}
		}
	}
}
