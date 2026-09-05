// Importações
import java.util.ArrayList;
import java.util.List;


public class Colecionador {
    //Atributos
    private String nome;
    private List<Item> colecao;

    // Construtores
    public Colecionador(String nome){
        this.nome = nome;
        colecao = new ArrayList<Item>();
    }

    // Getter e Setter
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public List<Item> getColecao(){
        return colecao;
    }
    public void setColecao(List<Item> colecao){
        this.colecao = colecao;
    }

    // Métodos

    // Método para exibir a coleção no terminal
    public void exibirColecao(){
        System.out.println("=======================================");
        System.out.printf("Exibindo a coleção de %s. \n", this.getNome());
        System.out.println("=======================================");

        if(this.colecao.isEmpty()){
            System.out.println("Nenhum item cadastrado");
        } else {
            System.out.println("Itens da coleção:");
            for (Item item: this.colecao){
                System.out.println(" . " + item);
            }
        }
    }

}
