/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaconsulta;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author andrio
 */
public class GerenciaPacientesTest_Ex6 {

	private GerenciaPacientes gerPacientes;
	private int idPaciente01 = 1;
	private	int idPaciente02 = 2;
	private	int idPaciente03 = 3;
        
        
    @Before
    public void setUp(){
        /* ========= Montagem do cenário ========= */
        
        
        //Criando pacientes
        int idPaciente01 = 1;
        int idPaciente02 = 2;
        int idPaciente03 = 3;
        Paciente paciente01 = new Paciente(idPaciente01, "Paciente 01", 21, "paciente01@hotmail.com", "M", true);
        Paciente paciente02 = new Paciente(idPaciente02, "Paciente 02", 22, "paciente02@hotmail.com", "M", true);
        Paciente paciente03 = new Paciente(idPaciente03, "Paciente 03", 23, "paciente03@hotmail.com", "M", true);
        
        
        //Inserindo pacientes na lista de pacientes
        List<Paciente> pacientesHospital = new ArrayList<>();
        pacientesHospital.add(paciente01);
        pacientesHospital.add(paciente02);
        pacientesHospital.add(paciente03);
        
        gerPacientes = new GerenciaPacientes(pacientesHospital);
    }
    
    @After
    public void tearDown(){
        gerPacientes.limpa();
    }
    
    public GerenciaPacientesTest_Ex6() {
    }

    /**
     * Test of getPacientesHospital method, of class GerenciaPacientes.
     */
    @Test
    public void testGetPacientesHospital() {
    }

    /**
     * Teste básico de pesquisa de pacientes pelo ID.
     */
    @Test
    public void testPesquisaPaciente() {
        
        /* ========== Execução ========== */
		Paciente paciente = gerPacientes.pesquisaPaciente(idPaciente01);
		
	/* ========== Verificações ========== */
		assertThat(paciente.getId(), is(idPaciente01));
        
    }

    /**
     * Test of adicionaPaciente method, of class GerenciaPacientes.
     */
    @Test
    public void testAdicionaPaciente() {
    }

    /**
     * Teste básico para remover pacientes pelo ID.
     */
    @Test
    public void testRemovePaciente() {
        
		
	/* ========== Execução ========== */
	boolean clienteRemovido = gerPacientes.removePaciente(idPaciente02);
		
	/* ========== Verificações ========== */
	assertThat(clienteRemovido, is(true));
	assertThat(gerPacientes.getPacientesHospital().size(), is(idPaciente02));
	assertNull(gerPacientes.pesquisaPaciente(idPaciente02));
    }

    /**
     * Test of pacienteAlta method, of class GerenciaPacientes.
     */
    @Test
    public void testPacienteAlta() {
    }
    
}
