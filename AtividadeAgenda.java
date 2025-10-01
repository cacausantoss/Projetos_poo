import java.util.ArrayList;
import java.util.List;

public class AtividadeAgenda {
    String nome;
    String telefone;
    String email;

    public AtividadeAgenda(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public void exibir() {
        System.out.println(nome + " - " + telefone + " - " + email);
    }

    public static void main(String[] args) {
        List<AtividadeAgenda> agenda = new ArrayList<>();


        agenda.add(new AtividadeAgenda("Carolina",   "99999-1111", "carolina@email.com"));
        agenda.add(new AtividadeAgenda("Carulina", "99999-2222", "carulina1@email.com"));
        agenda.add(new AtividadeAgenda("Coraline", "99999-3333", "coraline@email.com"));

       
        System.out.println("Agenda inicial:");
        for (AtividadeAgenda c : agenda) c.exibir();

        
        agenda.remove(1);

        
        System.out.println("\nApós remover posição 1:");
        for (AtividadeAgenda c : agenda) c.exibir();

        
        AtividadeAgenda novo = new AtividadeAgenda("carulina", "99999-4444", "carulina@email.com");
        agenda.add(novo);

    
        System.out.println("\nBuscando 'Vitória':");
        for (AtividadeAgenda c : agenda) {
            if (c.nome.equalsIgnoreCase("Diego")) {
                c.exibir();
            }
        }

        
        System.out.println("\nContato na posição 1:");
        agenda.get(1).exibir();

        
        System.out.println("\nAgenda final:");
        for (AtividadeAgenda c : agenda) c.exibir();
    }
}