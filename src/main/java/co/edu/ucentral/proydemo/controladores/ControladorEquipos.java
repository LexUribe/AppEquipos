package co.edu.ucentral.proydemo.controladores;

import co.edu.ucentral.proydemo.dto.EquipoDto;
import co.edu.ucentral.proydemo.servicios.ServicioEquipos;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

@Log4j2
public class ControladorEquipos {
    private static final Logger logger = LogManager.getLogger(ControladorEquipos.class);

    @Autowired
    ServicioEquipos servicioEquipos;

    public void registrarEquipo(EquipoDto equipo) {
        servicioEquipos.registrarEquipo(equipo);
    }

    public List<EquipoDto> obtenerEquipos() {
        logger.info("Verificando ");
        return servicioEquipos.obtenerEquipos();
    }
}
