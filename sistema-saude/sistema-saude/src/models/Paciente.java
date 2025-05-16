package models;

public class Paciente extends Pessoa {
    private int id;
    
    public Paciente(String nome, String cpf, String telefone, String email, String senha) {
        super(nome, cpf, telefone, email, senha);

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
