package empresa;

public class Comissionado extends Funcionario {
	
	
	

	public Comissionado(String _cpf, String _nome, String _data, String _matricula) {
		super(_cpf, _nome, _data, _matricula);
		
	}
	public static double roupas (double x) {
        double conv;
        conv = x * 0.05;
        return conv;
		
	}
	public static double sapatos (double x) {
        double conv;
        conv = x * 0.07;
        return conv;

}
}