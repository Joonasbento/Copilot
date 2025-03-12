import java.time.LocalDate;

public class  Motoboy extends Funcionario{

    private String placaMoto;

    public Motoboy(String nome, String cpf, double salarioBase, LocalDate dataNascimento, LocalDate dataDemissao, String placaMoto) {
        super(nome, cpf, salarioBase, dataNascimento, dataDemissao);
        this.placaMoto = placaMoto;
    }   

    public String getPlacaMoto() {
        return placaMoto;
    }

    public void setPlacaMoto(String placaMoto) {
        this.placaMoto = placaMoto;
    }

    @Override
    public  double calcularSalario() {
       return this.salarioBase;
    }
    
    @Override
    public String toString() {
        return "Motoboy [placaMoto=" + placaMoto + ", cpf=" + cpf + ", dataDemissao=" + dataDemissao + ", dataNascimento=" + dataNascimento
                + ", nome=" + nome + ", salarioBase=" + salarioBase + "]";
    }

    





 

}
