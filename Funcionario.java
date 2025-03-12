import java.time.LocalDate;

public abstract class Funcionario {
    protected String nome; 
    protected String cpf;   
    protected double salarioBase;
    protected LocalDate dataNascimento;
    protected LocalDate dataDemissao;

    public Funcionario(String nome, String cpf, double salarioBase, LocalDate dataNascimento, LocalDate dataDemissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        this.dataNascimento = dataNascimento;
        this.dataDemissao = dataDemissao;
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

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(LocalDate dataDemissao) {
        this.dataDemissao = dataDemissao;
    }
    
    @Override
    public String toString() {
        return "Funcionario [cpf=" + cpf + ", dataDemissao=" + dataDemissao + ", dataNascimento=" + dataNascimento
                + ", nome=" + nome + ", salarioBase=" + salarioBase + "]";
    }
}
