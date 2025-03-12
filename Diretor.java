 import java.time.LocalDate;
 public class Diretor extends Cargoconfianca implements Contratacao {
        
        public Diretor(String nome, String cpf, double salarioBase, LocalDate dataNascimento, LocalDate dataDemissao, Bonificacao bonus) {
            super(nome, cpf, salarioBase, dataNascimento, dataDemissao, bonus);
        }

        private double premio = 0.1;
        
        public double getPremio() {
            return premio;
        }
        
        public void setPremio(double premio) {
            this.premio = premio;
        }

        @Override
        public double calcularSalario() {
            return this.salarioBase + this.bonus.getValor() + this.premio;
        }

        @Override
        public admitir(Funcionario funcionario) {
            System.out.println("Diretor admitindo funcionario: " + funcionario.getNome());
        }

        @Override
        public demitir(Funcionario funcionario) {
            System.out.println("Diretor demitindo funcionario: " + funcionario.getNome());
        }

        @Override
        public String toString() {
            return "Diretor \n" + super.toString() + "premio=" + premio + "]";
        }
    }


