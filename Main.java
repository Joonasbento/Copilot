import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Motoboy motoboy = new Motoboy("João", "123.456.789-00", 1500.00, LocalDate.of(1990, 1, 1), LocalDate.of(2021, 1, 1), "ABC-1234");
        Gerente gerente = new Gerente("Maria", "987.654.321-00", 5000.00, LocalDate.of(1980, 1, 1), LocalDate.of(2021, 1, 1), new Bonificacao(1000.00));

        System.out.println(motoboy);
        System.out.println(gerente);

        gerente.admitir(motoboy);




        
    }

}
