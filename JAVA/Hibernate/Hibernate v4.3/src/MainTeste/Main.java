/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainTeste;

import Controller.AnimalController;
import DAO.HibernateUtil;
import Model.Animal;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author MarioM3
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory().openSession();

        AnimalController animalController = new AnimalController();
        // Animal animal = new Animal(1.78, 5.78, "Pluto");
        //Animal animalUp = new Animal(5, 0.7, 0.8, "MAX");
        //Animal animalDel = new Animal(2);

        //animalController.createAnimal(animal);
        /*
        List<Animal> animais = animalController.readAnimal();
        animais.forEach((animai) -> {
            System.out.println(animai.toString());
        });
         */
        // animalController.updateAnimal(animalUp);
        //animalController.deleteAnimal(animalDel);
    }

}
