/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaconsulta;

import java.util.List;

/**
 *
 * @author andrio
 */
public class GerenciaPacientes {
    private List<Paciente> pacientesHospital;

	public GerenciaPacientes(List<Paciente> pacientesHospital) {
		this.pacientesHospital = pacientesHospital;
	}
	
	//Retorna uma lista com todos os pacientes.

	public List<Paciente> getPacientesHospital() {
		return pacientesHospital;
	}
	
	//Pesquis por paciente pelo ID
        
	public Paciente pesquisaPaciente (int idPaciente) {

		for (Paciente paciente : pacientesHospital) {
			if(paciente.getId() == idPaciente)
				return paciente;
		}
		return null;
	}
	
	//Adiciona novo paciente
	public void adicionaPaciente (Paciente novoPaciente) {
		pacientesHospital.add(novoPaciente);
	}

	//Remove paciente
	public boolean removePaciente (int idPaciente) {
		boolean pacienteRemovido = false;
		
		for (int i = 0; i < pacientesHospital.size(); i++) {
			Paciente paciente = pacientesHospital.get(i);
			if(paciente.getId() == idPaciente){
				pacientesHospital.remove(i);
				pacienteRemovido = true;
				break;
			}
		}
		
		return pacienteRemovido;
	}

	//Informa se paciente teve alta ou não
	public boolean pacienteAlta (int idPaciente) {
		boolean pacienteAlta = false;
		
		for (int i = 0; i < pacientesHospital.size(); i++) {
			Paciente paciente = pacientesHospital.get(i);
			if(paciente.getId() == idPaciente)
				if(paciente.isAlta()){
					pacienteAlta = true;
					break;
				}
		}
		
		return pacienteAlta;
	}
        
        
        //Limpa lista de pacientes
        public void limpa() {
		this.pacientesHospital.clear();
	}
    
}
