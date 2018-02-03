package validadadados;

public abstract class PessoaJuridica extends Pessoa implements ValidarCnpj {
	
	public void mostralocalizacao(){
		
	}
	public boolean ValidarCnpj(String cnpj){
		return false;
	}

}
