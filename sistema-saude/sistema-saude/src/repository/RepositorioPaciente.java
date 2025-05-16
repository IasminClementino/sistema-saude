package repository;

import models.Paciente;
import java.util.ArrayList;
import interfaces.InterfacePaciente;

public class RepositorioPaciente implements InterfacePaciente {
    private ArrayList<Paciente> pacienteList;

    public RepositorioPaciente() {
        this.pacienteList = new ArrayList<>();
    }

    public void addPaciente(Paciente paciente) {
        this.pacienteList.add(paciente);
    }
    public void removerPaciente(Paciente paciente) {
        this.pacienteList.remove(paciente);
    }
    

}
