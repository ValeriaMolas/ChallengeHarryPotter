package app.artefactos;

import app.interfaces.IEsMagico;
import app.personajes.Criatura;
import app.transportes.Transporte;

public class CopaHelgaHufflepuff extends Artefacto implements IEsMagico {

    @Override
    public void esMagico(Transporte utilizado, Artefacto obtenido, Criatura ayudante) {
        super.esMagico(utilizado, obtenido, ayudante);
    }

}