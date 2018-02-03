package validadadados;

public class Pessoa {
	protected String nome;
	protected String endereco;
	
	public Pessoa(){
		
	}
	public Pessoa(String nome, String endereco){
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getEndereco(){
		return endereco;
	}
	public void setEndereço(String endereco){
		this.endereco = endereco;
	}
	
	public String toString(){
		return "NOME: " + nome + "\n" + "ENDEREÇO: " +endereco;
	}
}
