package empresa;

public class Horista extends Funcionario {
	
	

	public Horista(String _cpf, String _nome, String _data, String _matricula) {
		super(_cpf, _nome, _data, _matricula);
		
	}
	public static double salarioh (double x) {
        double conv;
        conv = x * 50.00;
        return conv;
		
	}

}
