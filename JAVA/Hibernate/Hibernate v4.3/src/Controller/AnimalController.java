/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.GenericDAO;
import Model.Animal;
import java.util.List;

/**
 *
 * @author MarioM3
 */
public class AnimalController {

    private GenericDAO genericDAO = new GenericDAO();

    public void createAnimal(Animal animal) {
        genericDAO.create(animal);
    }

    public List<Animal> readAnimal() {
        return genericDAO.read(Animal.class);
    }

    public void updateAnimal(Animal animal) {
        genericDAO.update(animal);
    }

    public void deleteAnimal(Animal animal) {
        genericDAO.delete(animal);
    }

    public Animal findById(int id) {
        return (Animal) genericDAO.findById(Animal.class, id);
    }
}
