package br.edu.unis.atividade06;

public abstract class Funcionario {
   private String nome;
   private String nascimento;
   private String cpf;
   private Endereco endereco;

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public abstract float getSalario(int horas);
}
