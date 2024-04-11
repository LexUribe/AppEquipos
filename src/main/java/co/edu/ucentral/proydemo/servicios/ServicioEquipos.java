package co.edu.ucentral.proydemo.servicios;

import co.edu.ucentral.proydemo.dto.EquipoDto;
import co.edu.ucentral.proydemo.entidades.Equipo;
import co.edu.ucentral.proydemo.repositorios.EquipoRepositorio;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;
import co.edu.ucentral.proydemo.exception.ResourceNotFoundException;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@Service
public class ServicioEquipos implements Serializable {
    private ModelMapper modelMapper;
    private final EquipoRepositorio equipoRepositorio;

    public EquipoDto registrar(EquipoDto equipoDto) {
        Equipo elEquipo = equipoRepositorio.save(modelMapper.map(equipoDto, Equipo.class));
        return modelMapper.map(elEquipo, EquipoDto.class);
    }

    public List<EquipoDto> obtenerEquipos() {
        TypeToken<List<EquipoDto>> typeToken = new TypeToken<>() {};
        return modelMapper.map(equipoRepositorio.findAll(), typeToken.getType());
    }

    public EquipoDto obtenerEquipo(long serial) {
        Equipo equipo = equipoRepositorio.findById(serial).orElseThrow(ResourceNotFoundException::new);
        return modelMapper.map(equipo, EquipoDto.class);
    }

    public EquipoDto actualizar(EquipoDto equipoDto) {
        equipoRepositorio.save(modelMapper.map(equipoDto, Equipo.class));
        return equipoDto;
    }

    public void eliminar(long serial) {
        equipoRepositorio.deleteById(serial);
    }
}
