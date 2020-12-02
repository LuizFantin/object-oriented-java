package ementor;

import java.io.Serializable;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

/*a Subclasse Professor, filha de Pessoa, deve possuir os atributos de Data de
Admissão e Salário Bruto. Os métodos a serem implementados para essa subclasse são:
Construtor padrão; construtor para inicializar todos os atributos; setDados para inicializar os
atributos depois de criados os objetos; getDataAdmissao e getSalarioBruto para recuperar
esses atributos; imprimir dados; e calcular salário líquido (de forma simplificada considerar
desconto de 14% de INSS para todas as faixas de salário e 22,5% para salários maiores ou
iguais que R$ 5.000,00, os salário menores que o valor citado deve ter desconto apenas de
INSS). 
*/

public class Professor extends Pessoa implements Serializable {
	//atributos
	private String dataAdmissao;
	private double salarioBruto;
	
	//Método construtor padrão
	public Professor() {
		super();
		this.dataAdmissao = "";
		this.salarioBruto = 0;
	}
	//Método construtor que inicializa todos os campos
	public Professor(String dataAdmissao, double salarioBruto, String nome, String dataNascimento, long cpf, String telefone) {
		super(nome, dataNascimento, cpf, telefone);
		this.dataAdmissao = dataAdmissao;
		this.salarioBruto = salarioBruto;
	}
	
	// Método que inicializa os atributos após instanciar os objetos
	public void setDados(String dataAdmissao, double salarioBruto, String nome, String dataNascimento, long cpf, String telefone) {
		super.setDados(nome, dataNascimento, cpf, telefone);
		this.dataAdmissao = dataAdmissao;
		this.salarioBruto = salarioBruto;
	}
	
	//Métodos de acesso
	public String getDataAdmissao() {
		return this.dataAdmissao;
	}
	public double getSalarioBruto() {
		return this.salarioBruto;
	}
	
	//Método que imprime todos os dados desta classe
	public void imprimirDados() {
            JOptionPane.showMessageDialog(null, "Nome: " + this.nome + "\nData de Nascimento: " + 
                                        this.dataNascimento + "\nCPF: " + this.cpf + "\nContato: " + this.contato + 
                                        "\nData de Admissão: " + this.dataAdmissao + "\nSalário Bruto: " + this.salarioBruto, 
                                        "Dados do Professor",INFORMATION_MESSAGE );
	}
	
        //Método que calcula o salário líquido a partir do salário bruto passado como parâmetro
	public double salarioLiquido(double salarioBruto) {
		if(salarioBruto < 5000.)
			return salarioBruto - (salarioBruto*0.14);
		else
			return salarioBruto - (salarioBruto*(0.14+0.225));
	}
	
}
