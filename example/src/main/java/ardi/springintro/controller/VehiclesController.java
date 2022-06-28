package ardi.springintro.controller;

import ardi.springintro.model.Starship;
import ardi.springintro.model.Vehicle;
import ardi.springintro.service.StarshipsProvider;
import ardi.springintro.service.VehiclesProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class VehiclesController {

  @Autowired
  private VehiclesProvider starwarsVehicle;

  @GetMapping("/vehicles")
  public List<Vehicle> getVehicles() {
    List<Vehicle> vehicles = starwarsVehicle.getVehicles();

    return vehicles;
  }

  @GetMapping("/vehicles/{index}")
  public Vehicle getVehicle(@PathVariable(name = "index") int urutan) {
    Vehicle vehicle = starwarsVehicle.getVehicle(urutan);

    return vehicle;
  }

}
