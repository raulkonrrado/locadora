package model.bean;

public class Cliente {
	private int idCliente;
	private String nome;
	private String email;
	private boolean sexo;
	
	public int getIdCliente() {
		return idCliente;
	}
		public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
		
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	
} 