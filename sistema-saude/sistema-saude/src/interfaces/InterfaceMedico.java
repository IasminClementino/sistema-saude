package interfaces;

import java.util.ArrayList;
import models.Medico;

public interface InterfaceMedico {
    void addMedico(Medico medico);

    void removerMedico(Medico medico);

    void updateMedico(Medico medicoAtualizado);

    ArrayList<Medico> listarMedicos();

    Medico findMedicoById(int id);
    Medico findMedicoByCpf(String cpf);
}
