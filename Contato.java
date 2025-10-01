public class Contato {

    private String _nome, _email, _telefone;
    public void set_telefone(String telefone) {
        
    }
    public Contato(String nome, String telefone, String email) {
        this._nome = nome;
        this._telefone = telefone;
        this._email = email;
    }
    public String get_telefone() {
        return _telefone;
    }
    private String email;
    public void set_email(String email) {
        this.email = email;
    }
    public String get_nome() {
        return _nome;
    }
    public String get_email() {
        return email;
    }
    public void imprimeInformacoes(){
        System.out.println("_nome: "+ this._nome);
        System.out.println("_email: " + this._email);
        System.out.println("_telefone: " + this._telefone);
    }
    
}