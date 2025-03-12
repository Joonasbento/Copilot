import java.time.LocalDate;

public class Gerente extends Cargoconfianca {

    public Gerente(String nome, String cpf, double salarioBase, LocalDate dataNascimento, LocalDate dataDemissao, Bonificacao bonus) {
        super(nome, cpf, salarioBase, dataNascimento, dataDemissao, bonus);
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase + this.bonus.getValor();
    }   

    @Override
    public String toString() {
        return "Gerente \n" + super.toString() + "]";
    }
    
}
