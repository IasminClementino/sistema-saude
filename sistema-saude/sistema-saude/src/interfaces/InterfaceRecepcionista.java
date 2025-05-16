package interfaces;

import java.util.ArrayList;
import models.Recepcionista;

public interface InterfaceRecepcionista {
    void addRecepcionista(Recepcionista recepcionista);

    void removerRecepcionista(Recepcionista recepcionista);

    void updateRecepcionista(Recepcionista recepcionistaAtualizado);

    ArrayList<Recepcionista> listarRecepcionistas();
}
