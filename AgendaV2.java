  import java.util.ArrayList;
  public class AgendaV2 {
    private ArrayList<Contato> contatos =
     new ArrayList<>();
    
        public void armazenarContato(Contato contato){
            this.contatos.add(contato);
        }
        public void removerContato(Contato contato){
            this.contatos.remove(contato);

        }

        public int encontrarContato(String nome){
            for (int i= 0; i < contatos.size(); i++){
                     //.get(i) encontra o objeto na posição i
                     //.get_nome() função que retorna o nome do objeto
                     //.equals(nome) compara o nome do objeto com o nome passado no parâmetro
                     if (contatos.get (i).get_nome().equals(nome)){
                return i;
                }
        
         }return -1;
        }
        public void imprimirContatos(){
            System.out.println("======ÍNICIO======");
            for (Contato contato : contatos){
                contato.imprimeInformacoes();
                System.out.println("");

            
            }
        
        }
    }

       
    
        
    