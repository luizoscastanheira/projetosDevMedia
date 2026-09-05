
// importacoes
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World of Collections!");

        // Variáveis para auxiliar no programa
        Colecionador colecionador;
        Item item;
        String nomeDoColecionador, nomeDoItem;
        int ano;
        List<Colecionador> listaDeColecionadores = new ArrayList<>();

        // Criando uma lista de colecionadores

        // Ativando o Scanner de teclado instanciando a classe Scanner
        Scanner lerDados = new Scanner(System.in);

        // criando um menu de cadastro

        while (true) {
            System.out.println("Informe o nome do colecionador(apenas ENTER para sair): ");
            nomeDoColecionador = lerDados.nextLine();

            if (nomeDoColecionador.isEmpty()) {
                break;
            } else {
                colecionador = new Colecionador(nomeDoColecionador);
                listaDeColecionadores.add(colecionador);
                System.out.println("Colecionador " + colecionador.getNome() + " adicionado.");

                System.out.println("============================");

                while (true) {
                    System.out.println("Informe o nome do item: ");
                    nomeDoItem = lerDados.nextLine();
                    if (nomeDoItem.isEmpty()) {
                        break;
                    }

                    System.out.println("Infome o ano de fabricação do item: ");
                    ano = Integer.parseInt(lerDados.nextLine());

                    // Criando o objeto Item com new, passando os parametros ao construtor e já
                    // adicoando tudo à variável item criada anteriormente
                    item = new Item(nomeDoItem, ano);
                    // adicionando o item à coleção
                    colecionador.getColecao().add(item);

                }

            }

        }

        lerDados.close();

        // Quantidade de colecionadores cadastrados
        System.out.printf("Temos %s colecionadores cadastrados. \n", listaDeColecionadores.size());
        // listando todos os colecionadores SEMPRE com uso de um for
        for (Colecionador nome : listaDeColecionadores) {
            System.out.println("Colecionador: " + nome.getNome());
            //System.out.println(nome.getColecao());
            nome.exibirColecao();
        }

        

    }

    // Métodos staticos fora do Main

}
