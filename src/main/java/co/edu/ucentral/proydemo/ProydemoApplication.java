package co.edu.ucentral.proydemo;

import co.edu.ucentral.proydemo.controladores.ControladorEquipos;
import co.edu.ucentral.proydemo.dto.EquipoDto;
import co.edu.ucentral.proydemo.entidades.Equipo;
import co.edu.ucentral.proydemo.repositorios.EquipoRepositorio;
import co.edu.ucentral.proydemo.servicios.ServicioEquipos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ProydemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProydemoApplication.class, args);
		System.out.println("######### Proyecto Base #########");
	}

	@Autowired
	EquipoRepositorio repoEquipo;
	@Override
	public void  run(String... args) throws Exception {
		/*Equipo e = new Equipo();
		e.setNombre("Exodus");
		e.setDescripcion("El Thrash pa' romperse hasta la madre.");*/
        System.out.println("---------- FIN FUNCIÓN ----------");

		/*repoEquipo.save(e);

		List<Equipo> listEquipo = repoEquipo.findAll();
		for (Equipo equipo : listEquipo) {
			System.out.println(equipo);
		}*/
	}
}
