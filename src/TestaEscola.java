public class TestaEscola {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();		
		aluno1.nome = "Roger";
		aluno1.documento = (int)(Math.random()*1000000000);
		aluno1.dataDeNascimento = "30/06/1989";
		
		System.out.println("Dados do Aluno");
		System.out.println("Nome do aluno: " + aluno1.nome);
		System.out.println("RG do aluno: " + aluno1.documento);
		System.out.println("Data de nascimento: " + aluno1.dataDeNascimento);
				
		Funcionario trabalhador1 = new Funcionario();		
		trabalhador1.nomeFuncionario = "Guilherme";
		trabalhador1.salario = (int)(Math.random()*10000);
		
		System.out.println("\nDados do Funcionario");
		System.out.println("Nome do funcionário: " + trabalhador1.nomeFuncionario);
		System.out.println("Salário do funcionário: " + trabalhador1.salario);
		trabalhador1.aumento(1000);
		System.out.println("Novo salário: " + trabalhador1.dadosDoFuncionario());
		
		Turma turma1 = new Turma();
		turma1.periodo = "Manhã";
		turma1.serie = "5ªSérie";
		turma1.sigla = "5MA";
		turma1.tipoDeEnsino = "Presencial";
		
		System.out.println("\nDados da Turma");
		System.out.println("Período: " + turma1.periodo);
		System.out.println("Série: " + turma1.serie);
		System.out.println("Sigla da turma: " + turma1.sigla);
		System.out.println("Tipo de ensino: " + turma1.tipoDeEnsino);
		
		Aluno aluno2 = new Aluno();
		aluno2.turma = turma1;
		
		aluno2.nome = "Ingrid";
		aluno2.turma.periodo = "Tarde";
		aluno2.turma.serie = "6ªSérie";
		aluno2.turma.sigla = "6TB";
		aluno2.turma.tipoDeEnsino = "E.A.D";
		
		System.out.println("\nDados do Aluno e da Turma Alterados");
		System.out.println("Nome do Aluno: " + aluno2.nome);
		System.out.println("Período: " + aluno2.turma.periodo);
		System.out.println("Série: " + aluno2.turma.serie);
		System.out.println("Sigla da turma: " + aluno2.turma.sigla);
		System.out.println("Tipo de ensino: " + aluno2.turma.tipoDeEnsino);	
	}
}
class Aluno{
	public String nome;
	public int documento;
	public String dataDeNascimento;
	public Turma turma;
}
class Funcionario{
	public String nomeFuncionario;
	public double salario;
	
	void aumento (double valor) {
		this.salario += valor;
	}
	double dadosDoFuncionario() {
		return this.salario;
	}
}
class Turma{
	public String periodo;
	public String serie;
	public String sigla;
	public String tipoDeEnsino;
}