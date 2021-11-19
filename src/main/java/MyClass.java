import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MyClass {
    public static void main(String[] args) {
        var pessoas = new ArrayList<Pessoa>() {{
            add(new Pessoa("João", 25));
            add(new Pessoa("Maria", 21));
            add(new Pessoa("Pedro", 12));
        }};

        pessoas.stream()
                .filter(pessoa->pessoa.getIdade() > 20)
                .sorted(Comparator.comparing(Pessoa::getNome))
                .collect(Collectors.toList())
                .forEach(System.out::println);



    }
}

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() { return nome;}
    public void  setNome(String nome) { this.nome = nome;}

    public int getIdade() { return idade;}
    public void setIdade(int idade) { this.idade = idade;}

    @Override
    public String toString() {
        return "Nome: %s, Idade: %d".formatted(nome, idade);
    }

}
