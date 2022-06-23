import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramaPrincipal1 {
    public static void main(String[] args) {
        // instanciar um list de Pessoa

        List<Pessoa1> pessoas = new ArrayList<Pessoa1>();
        List<Endereco> enderecos = new ArrayList<Endereco>();


        pessoas.add(new Pessoa1("Bruno", 1122331, "01/01/1990").);
        pessoas.add(new Pessoa1("Ana", 1122332, "01/01/1991"));
        pessoas.add(new Pessoa1("Carlos", 1122333, "01/01/1992"));
        
        // Pessoa1 Pessoa5;
        // pessoas.add(Pessoa5 = new Pessoa1("mancal", 1122334, "01/01/1990"));

        System.out.println("--Ordenação--");

        Collections.sort(pessoas);

        for (Pessoa1 p : pessoas) {
            System.out.println(p);
        }


        // // adicionar objetos na lista
        // pessoas.add(new Pessoa("João", 25, 78, 1.76));
        // pessoas.add(new Pessoa("Pedro", 40, 120, 1.73));
        // pessoas.add(new Pessoa("Francieli", 33, 65, 1.68));
        // pessoas.add(new Pessoa("Diogo", 15, 54, 1.63));
        // pessoas.add(new Pessoa("Natasha", 23, 53, 1.56));

        // // foreach + print
        // for (Pessoa p : pessoas) {
        //     System.out.println(p);
        // };

        // // ordenação

        // System.out.println("--Ordenação--");

        // Collections.sort(pessoas);

        // for (Pessoa p : pessoas) {
        //     System.out.println(p);
        // }

        // // Criar nova pessoa

        // Pessoa p = new Pessoa("Gustavo", 38, 80.5, 1.76);
        // p.getTelefones().put("residencial", "41 3244-3273");
        // p.getTelefones().put("comercial", "41 4444-3273");
        // p.getTelefones().put("celular", "41 5555-3273");


        // System.out.printf("Telefone Celular: %s", p.getTelefones().get("celular"));
    }
}
