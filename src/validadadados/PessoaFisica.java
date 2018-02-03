package validadadados;

public class PessoaFisica extends Pessoa implements ValidarCpf {
	private int idade;
	private String rg;
	private String cpf;
	
	public PessoaFisica(){
		
	}
	public PessoaFisica(String nome, String endereco, int idade, String rg, String cpf){
		super(nome, endereco);
		this.idade = idade;
		this.rg = rg;
		this.cpf = cpf;
	}
	
	public int getIdade(){
		return idade;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	public String getRg(){
		return rg;
	}
	public void setRg(String rg){
		this.rg = rg;
	}
	public String getCpf(){
		return cpf;
	}
	public void setCpf(String cpf) throws Exception{
		if(!ValidarCpf(cpf)){
			throw new Exception("Cpf invalidado: ");
		}
		this.cpf = cpf;
	}
	
	public String toString(){
		return super.toString() + "\n" + "IDADE: " +idade+ "\n" 
	    + "NUMERO RG: " +rg+ "\n" + "NUMERO DE CPF: "+cpf;
	}
	
	public void mostrarlocalizaçao(){
		System.out.println("A localizaçao de: " +nome + " e " +endereco);
	}
	public boolean validarCpf(String cpf) throws Exception{
		int d1,d2;
		int digito1, digito2, resto;
		int digitoCPF;
		
		d1 = d2 = 0;
		digito1 = digito2 = resto = 0;
		
		for(int nCount = 1; nCount < cpf.length()-1; nCount++){
		    digitoCPF = Integer.valueOf(cpf.substring(nCount - 1, nCount)).intValue();	
		    
		    d1 = d1 + (11 - nCount)*digitoCPF;
		    d2 = d2 + (12 - nCount)*digitoCPF;
		}
		// primeiro resto da divisao por 11
		resto = (d1 % 11);
		if(resto<2){
			digito1 = 0;
		}
		else{
			digito1 = 11 -resto;
			d1+=2*digito1;
		}
		//segundo resto da divisao por 11
		resto = (d2 % 11);
		if(resto<2){
			digito2=0;
		}
		else{
			digito2=11 - resto;
		}
		
		//digito verificador do cpf que esta sendo validado
		String nDigVerific = cpf.substring(cpf.length()-2, cpf.length());
		
		//concatenando o primeiro resto com o segundo
		String nDigResult = String.valueOf(digito1) + String.valueOf(digito2);
		
		//comparar o digito verificador do cpf com o 1° resto + o 2° resto
		return nDigVerific.equals(nDigResult);
		
	}
	@Override
	public boolean ValidarCpf(String cpf) throws Exception {
		return false;
	}
}
