
import java.time.LocalDate;

public class Item {
    // Atributos da Classe
    private String nome;
    private int anoCriacao;

    // Construtores
    public Item(String nome, int ano) {
        setNome(nome);
        setAnoCriacao(ano);
    }

    // Getter e Setter
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode estar vazio!!!");
        }
        this.nome = nome;
    }

    public int getAnoCriacao() {
        return this.anoCriacao;
    }

    public void setAnoCriacao(int ano) {
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();

        if (ano > anoAtual) {
            throw new IllegalArgumentException("O ano digitado não é válido");
        }
        this.anoCriacao = ano;
    }

    // Métodos
    // Fazendo uma pequena mudança no metódo da classe String
    @Override
    public String toString() {
        return "Item{" + "nome='" + nome + '\'' + ", anoCriacao=" + anoCriacao +'}';
    }

}
