package empresa;

public class Assalariado extends Funcionario {
	
	int salario;
	

	public Assalariado(String _cpf, String _nome, String _data, String _matricula) {
		super(_cpf, _nome, _data, _matricula);
		
	}
	public static double salario () {
        double conv;
        conv = 1.212;
        return conv;
		
	}
	public static double salario1 () {
        double conv;
        conv =  2.424;
        return conv;
		
	}

}
