public class Endereco implements Comparable<Endereco>{


    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private int CEP;
    private String cidade;


    public Endereco(String logradouro, int numero, String complemento, String bairro, int CEP, String cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.CEP= CEP;
        this.cidade = cidade;
    }
        

    @Override
    public String toString() {
        return String.format("logradouro: %s, numero: %i, complemento: %s, bairro: %s, CEP: %i, cidade: %s", logradouro, numero, complemento, bairro, CEP, cidade);
    }


    @Override
    public int compareTo(Endereco o) {
        return this.cidade.compareTo(o.cidade);
    }




    // @Override
    // public int compareTo(Pessoa o) {
    //     // comparação com base no nome
    //     return this.nome.compareTo(o.nome);
    // }
}
