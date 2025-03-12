import java.time.LocalDate;

public class Cargoconfianca  extends Funcionario{
    protected Bonificacao bonus;

    public Cargoconfianca(String nome, String cpf, double salarioBase, LocalDate dataNascimento, LocalDate dataDemissao, Bonificacao bonus) {
        super(nome, cpf, salarioBase, dataNascimento, dataDemissao);
        this.bonus = bonus;
    }

    public Bonificacao getBonus() {
        return bonus;
    }   
    public void setBonus(Bonificacao bonus) {
        this.bonus = bonus;
    }

}

