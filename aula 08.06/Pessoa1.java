import java.util.HashMap;
import java.util.Map;

public class Pessoa1 implements Comparable<Pessoa1>{
    // private String nome;
    // private int idade;
    // private double peso;
    // private double altura;
    // private Map<String, String> telefones;

    private String nome;
    private int rg;
    private String nascimento;
    private Map<String, String> email;
    private Map<String, String> telefones;
    private Map<String, String> endereco;


    public Pessoa1(String nome, int rg, String nascimento) {
        this.nome=nome;
        this.rg=rg;
        this.nascimento=nascimento;
        this.email = new HashMap<String, String>();
        this.telefones = new HashMap<String, String>();
        this.endereco = new HashMap<String, String>();

    }

    @Override
    public String toString() {
        return String.format("Nome: %s, rg: %d, nascimento: %s", nome, rg, nascimento);
    }

    @Override
    public int compareTo(Pessoa1 o) {
        return this.nome.compareTo(o.nome);
    }

    public Map<String, String> getEmail() {
        return email;
    }

    public Map<String, String> getTelefones() {
        return telefones;
    }
    
    public Map<String, String> getEndereco() {
        return endereco;
    }

   

}
