package br.edu.unis.atividade06;

public class Vendedor extends Funcionario {
    private EquipeVendas equipe;

    public EquipeVendas getEquipe() {
        return equipe;
    }

    public void setEquipe(EquipeVendas equipe) {
        this.equipe = equipe;
    }

    @Override
    public  float getSalario(int horas) {
        return horas * 50.00f;
    }
    
    public  float getSalario(int horas, boolean bonus) {
        float salario = horas * 50.00f;
        if (bonus) {
            return salario * 1.10f; 
        }
        return salario;
    }
}
