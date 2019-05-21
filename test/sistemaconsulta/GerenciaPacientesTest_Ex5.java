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
 * Classe de teste criada para garantir o funcionamento das principais operações 
 * sobre pacientes realizadas pela classe {@link GerenciaPacientes}
 * @author andrio
 */
public class GerenciaPacientesTest_Ex5 {
    
    public GerenciaPacientesTest_Ex5() {
    }

    /**
     * Test of getPacientesHospital method, of class GerenciaPacientes.
     */
    @Test
    public void testGetPacientesHospital() {
    }

    /**
     * Teste básico da pesquisa de um paciente a partir do seu ID.
     */
    @Test
    public void testPesquisaPaciente() {
        
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
        
        GerenciaPacientes gerPacientes = new GerenciaPacientes(pacientesHospital);
        
        /* ========= Execução ========= */
        Paciente paciente = gerPacientes.pesquisaPaciente(idPaciente02);
        
        /* ========= Verificações ========= */
        assertThat(paciente.getId(), is(idPaciente02));
        assertThat(paciente.getEmail(), is("paciente01@hotmail.com"));
    }

    /**
     * Test of adicionaPaciente method, of class GerenciaPacientes.
     */
    @Test
    public void testAdicionaPaciente() {
    }

    /**
     * Teste básico para remover o paciente pelo ID.
     */
    @Test
    public void testRemovePaciente() {
        
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
        
        GerenciaPacientes gerPacientes = new GerenciaPacientes(pacientesHospital);
        
        /* ========= Execução ========= */
        boolean pacienteRemovido = gerPacientes.removePaciente(idPaciente02);
        
        
        /* ========= Verificações ========= */
        assertThat(pacienteRemovido, is(true));
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
