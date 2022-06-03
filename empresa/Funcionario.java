package empresa;

public class Funcionario {
	
	public String cpf;
	public String nome;
	public String data;
	public String matricula;
	
	public Funcionario(String _nome, String _cpf,String _data, String _matricula) {
		this.nome = _nome;
		this.cpf = _cpf;
		this.data = _data;
		this.matricula = _matricula;

}
}