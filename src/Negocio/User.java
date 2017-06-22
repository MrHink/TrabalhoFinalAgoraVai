package Negocio;

public class User {
	
	private String nome;
	private String codigoIdentificador;
	private String email;
	
	public User(String n, String ci, String e){
		this.nome = n;
		this.codigoIdentificador = ci;
		this.email = e;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoIdentificador() {
		return codigoIdentificador;
	}

	public void setCodigoIdentificador(String codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
