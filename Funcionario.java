package JavaCores.AtividadesClasses.AtvPraticas.ProvaPOO2;

import javax.swing.*;
import java.util.Scanner;

public class Funcionario implements Dados{
    Scanner sc = new Scanner(System.in);
    private int matricula;
    private String nome;
    private String status;
    private double salario;
    private String setor;

    //Construtor
    public Funcionario(int matricula, String nome, String status, double salario, String setor){
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
        this.status = status;
    }
    //Metodos especificos
    public void cadastrar() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Nome: ");
            this.nome = sc.next();

            System.out.println("Matricula: ");
            this.matricula = sc.nextInt();

            System.out.println("Setor: ");
            this.setor = sc.next();

            System.out.println("Salário: ");
            this.salario = sc.nextDouble();

            System.out.println("Status(selecione o numero da opção)\n1 - ativo\n2 - inativo");
            int num = sc.nextInt();
            if (num == 1){
                this.status = "Ativo";
            }
            else if (num == 2){
                this.status = "Inativo";
            }
        }catch (Exception e){
            System.out.println("Foi inserido um tipo de dado invalido em determinado campo");
        }
    }
    public void consultar() {
        String dados = null;
        try {
            dados = String.format("Nome: %s \nMatricula: %s\nSalario: %.1f \nSetor: %s\nStatus: %b",
                    getNome(),
                    getMatricula(),
                    getSalario(),
                    getSetor(),
                    getStatus()
            );
        } catch (Exception e) {
            System.out.println("Foi convertido um tipo de dado errado");
        }
        JOptionPane.showMessageDialog(null, dados, "Dados do funcionario", JOptionPane.INFORMATION_MESSAGE);
    }

    //Metodos get and set


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getStatus() {
        return status;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
