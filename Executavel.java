package JavaCores.AtividadesClasses.AtvPraticas.ProvaPOO2;

public class Executavel {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(0, "", "", 0, "");
        Gerente gerente = new Gerente(0, "", "", 0, "");

        //funcionario.cadastrar();
        //funcionario.consultar();
        gerente.cadastrar();
        gerente.aplicarAumento();
    }
}
