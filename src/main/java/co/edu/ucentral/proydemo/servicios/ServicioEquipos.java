package co.edu.ucentral.proydemo.servicios;

import co.edu.ucentral.proydemo.dto.EquipoDto;
import co.edu.ucentral.proydemo.entidades.Equipo;
import co.edu.ucentral.proydemo.repositorios.EquipoRepositorio;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class ServicioEquipos implements Serializable {
    private ModelMapper modelMapper;

    @Autowired
    EquipoRepositorio repoEquipo;

    public void registrarEquipo(EquipoDto equipoDto) { repoEquipo.save(modelMapper.map(equipoDto, Equipo.class)); }

    public List<EquipoDto> obtenerEquipos() {
        TypeToken<List<EquipoDto>> typeToken = new TypeToken<>() {};
        return modelMapper.map(repoEquipo.findAll(), typeToken.getType());
    }
}
