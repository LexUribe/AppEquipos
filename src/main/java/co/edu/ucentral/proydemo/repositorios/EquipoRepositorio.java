package co.edu.ucentral.proydemo.repositorios;

import co.edu.ucentral.proydemo.entidades.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface EquipoRepositorio extends JpaRepository<Equipo, Long>, JpaSpecificationExecutor<Equipo> {
}
