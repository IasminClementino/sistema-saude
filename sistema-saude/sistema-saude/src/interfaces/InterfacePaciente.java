package interfaces;

import java.util.ArrayList;
import models.Paciente;

public interface InterfacePaciente {

    void addPaciente(Paciente paciente);

    void removerPaciente(Paciente paciente);

    void updatePaciente(Paciente pacienteAtualizado);

    ArrayList<Paciente> listarPacientes();

    Paciente findPacienteById(int id);
    Paciente finfPacienteByCpf(String cpf);



}
