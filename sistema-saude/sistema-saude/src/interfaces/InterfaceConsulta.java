package interfaces;

import java.util.ArrayList;
import models.Consulta;

public interface InterfaceConsulta {
    void addConsulta(Consulta consulta);

    void removerConsulta(Consulta consulta);

    void updateConsulta(Consulta consultaAtualizada);

    ArrayList<Consulta> listarConsultas();
}
