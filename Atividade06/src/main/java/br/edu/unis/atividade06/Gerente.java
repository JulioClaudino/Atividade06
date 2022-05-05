package br.edu.unis.atividade06;
 
public class Gerente extends Funcionario {
    
    @Override
    public  float getSalario(int horas) {
        return horas;
    }
    
   public  float getSalario(int horas, boolean meta) {
        float salario = horas * 50.00f;
        if (meta) {
            return salario * 1.20f; 
        }
        return salario;
    } 
}
