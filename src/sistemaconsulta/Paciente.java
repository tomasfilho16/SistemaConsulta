/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaconsulta;

/**
 *
 * @author andrio
 */
public class Paciente {
    
    private int id;
	
    private String nome;
	
    private int idade;
	
    private String email;
    
    private String sexo;
	
    private boolean alta;
    
    public Paciente(int id, String nome, int idade, String email, String sexo, boolean alta) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.sexo = sexo;
		this.alta = alta;
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }
	
    
	//Método que retorna a representação textual de um paciente. 
	 
	@Override
	public String toString() {
		
		String str ="=========================" 
					+"Id: " + this.id + "\n"
					+ "Nome: " + this.nome + "\n"
					+ "Idade: " + this.idade + "\n"
					+ "Email: " + this.email + "\n"
					+ "Email: " + this.sexo + "\n"
					+ "Status: " + (alta?"Alta":"I") + "\n"
					+ "=========================";
		return str;
	}

    
}
