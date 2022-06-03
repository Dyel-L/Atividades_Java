package empresa;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int comissionado;
		double vendas;
		int assalariado;
		int horas;
		String nome;
		String cpf;
		String data;
		String matricula;
		
		System.out.println("Cadastre o Funcionario Assalariado ");
		
		System.out.println("Nome: ");
		nome = entrada.next();
		System.out.println("Cpf: ");
		cpf = entrada.next();
		System.out.println("Data de Nascimento: ");
		data = entrada.next();
		System.out.println("Matricula: ");
		matricula = entrada.next();
		
		Funcionario i = new Funcionario(nome, cpf, data, matricula);
		System.out.println("Nome: " + i.nome);
		System.out.println("Cpf: " + i.cpf);
		System.out.println("Data de Nascimento: " + i.data);
		System.out.println("Matricula: " + i.matricula);
		
		System.out.println("");
		
		
		
		System.out.println("Informe a posição do assalariado: ");
		System.out.println("Assistente[0]: ");
		System.out.println("Supervisor[1]: ");
		assalariado = entrada.nextInt();
		
		
		
		if (assalariado == 0) {
			System.out.println("Salario do Assalariado: " + Assalariado.salario());
		}
		else if (assalariado == 1) {
			System.out.println("Salario do Assalariado: " + Assalariado.salario1());
			
			
		}
		System.out.println(" ");
System.out.println("Cadastre o Funcionario Horista ");
		
		System.out.println("Nome: ");
		nome = entrada.next();
		System.out.println("Cpf: ");
		cpf = entrada.next();
		System.out.println("Data de Nascimento: ");
		data = entrada.next();
		System.out.println("Matricula: ");
		matricula = entrada.next();
		
		Funcionario o = new Funcionario(nome, cpf, data, matricula);
		System.out.println("Nome: " + o.nome);
		System.out.println("Cpf: " + o.cpf);
		System.out.println("Data de Nascimento: " + o.data);
		System.out.println("Matricula: " + o.matricula);
		
		System.out.println("Informe as horas Trabalhadas pelo Horista: ");
		horas = entrada.nextInt();
		System.out.println("Salario do Horista:  " + Horista.salarioh(horas));
		System.out.println(" ");
		
System.out.println("Cadastre o Funcionario Comissionado ");
		
		System.out.println("Nome: ");
		nome = entrada.next();
		System.out.println("Cpf: ");
		cpf = entrada.next();
		System.out.println("Data de Nascimento: ");
		data = entrada.next();
		System.out.println("Matricula: ");
		matricula = entrada.next();
		
		Funcionario q = new Funcionario(nome, cpf, data, matricula);
		System.out.println("Nome: " + q.nome);
		System.out.println("Cpf: " + q.cpf);
		System.out.println("Data de Nascimento: " + q.data);
		System.out.println("Matricula: " + q.matricula);
		
		System.out.println("Informe o valor das vendas:  ");
		vendas = entrada.nextDouble();
		System.out.println("Informe qual mês de vendas:  ");
		System.out.println("[0]Sapatos");
		System.out.println("[1]Roupas");
		comissionado = entrada.nextInt();
		
		if (comissionado == 0) {
			System.out.println("O salario baseado nas vendas de sapatos foi: " + Comissionado.sapatos(vendas));
			
		}
		else if (comissionado == 1) {
			System.out.println("O salario baseado nas vendas de roupas foi: " + Comissionado.roupas(vendas));
			
		}
		
		
		
		
		
		
		

	}

}
