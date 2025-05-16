package interfaces;

import java.util.ArrayList;
import models.Exame;

public interface InterfaceExame {
    void addExame(Exame exame);

    void removerExame(Exame exame);

    void updateExame(Exame exameAtualizado);

    ArrayList<Exame> listarExames();

}
