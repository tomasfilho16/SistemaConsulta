/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaconsulta;

import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andrio
 */
public class GerenciaPacientesTest_Ex3 {
    
    public GerenciaPacientesTest_Ex3() {
    }

    /**
     * Test of getPacientesHospital method, of class GerenciaPacientes.
     */
    @Test
    public void testGetPacientesHospital() {
    }

    /**
     * Test of pesquisaPaciente method, of class GerenciaPacientes.
     */
    @Test
    public void testPesquisaPaciente() {
        
        /* ========= Montagem do cenário ========= */
        
        
        //Criando pacientes
        Paciente paciente01 = new Paciente(1, "Paciente 01", 21, "paciente01@hotmail.com", "M", true);
        Paciente paciente02 = new Paciente(2, "Paciente 02", 22, "paciente02@hotmail.com", "M", true);
        Paciente paciente03 = new Paciente(3, "Paciente 03", 23, "paciente03@hotmail.com", "M", true);
        
        
        //Inserindo pacientes na lista de pacientes
        List<Paciente> pacientesHospital = new ArrayList<>();
        pacientesHospital.add(paciente01);
        pacientesHospital.add(paciente02);
        pacientesHospital.add(paciente03);
        
        GerenciaPacientes gerPacientes = new GerenciaPacientes(pacientesHospital);
        
        /* ========= Execução ========= */
        Paciente paciente = gerPacientes.pesquisaPaciente(1);
        
        /* ========= Verificações ========= */
        assertThat(paciente.getId(), is(1));
        assertThat(paciente.getEmail(), is("paciente01@hotmail.com"));
    }

    /**
     * Test of adicionaPaciente method, of class GerenciaPacientes.
     */
    @Test
    public void testAdicionaPaciente() {
    }

    /**
     * Test of removePaciente method, of class GerenciaPacientes.
     */
    @Test
    public void testRemovePaciente() {
        
        /* ========= Montagem do cenário ========= */
        
        //Criando pacientes
        Paciente paciente01 = new Paciente(1, "Paciente 01", 21, "paciente01@hotmail.com", "M", true);
        Paciente paciente02 = new Paciente(2, "Paciente 02", 22, "paciente02@hotmail.com", "M", true);
        Paciente paciente03 = new Paciente(3, "Paciente 03", 23, "paciente03@hotmail.com", "M", true);
        
        //Inserindo pacientes na lista de pacientes
        List<Paciente> pacientesHospital = new ArrayList<>();
        pacientesHospital.add(paciente01);
        pacientesHospital.add(paciente02);
        pacientesHospital.add(paciente03);
        
        GerenciaPacientes gerPacientes = new GerenciaPacientes(pacientesHospital);
        
        /* ========= Execução ========= */
        boolean pacienteRemovido = gerPacientes.removePaciente(2);
        
        
        /* ========= Verificações ========= */
        assertThat(pacienteRemovido, is(true));
        assertThat(gerPacientes.getPacientesHospital().size(), is(2));
        assertNull(gerPacientes.pesquisaPaciente(2));
    }

    /**
     * Test of pacienteAlta method, of class GerenciaPacientes.
     */
    @Test
    public void testPacienteAlta() {
    }
    
}
