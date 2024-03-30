package JavaCores.AtividadesClasses.AtvPraticas.ProvaPOO2;

public class Gerente extends Funcionario {
    //Atributos
    private double porcetagemDoAumento;
    //Construtor
    public Gerente(int matricula, String nome, String status, double salario, String setor){
        super(matricula, nome, status, salario, setor);
    }
    //Metodos especificos

    public void aplicarAumento(){
        if(getSalario() > 5000){
            setPorcetagemDoAumento(1.35);
            System.out.printf("Aumento: %.2f", (getSalario() * getPorcetagemDoAumento()));
        } else {
            setPorcetagemDoAumento(1.20);
            System.out.printf("Aumento: %.2f", (getSalario() * getPorcetagemDoAumento()));
        }
    }
    //Metodos get e set
    public double getPorcetagemDoAumento() {
        return porcetagemDoAumento;
    }

    public void setPorcetagemDoAumento(double porcetagemDoAumento) {
        this.porcetagemDoAumento = porcetagemDoAumento;
    }
}
