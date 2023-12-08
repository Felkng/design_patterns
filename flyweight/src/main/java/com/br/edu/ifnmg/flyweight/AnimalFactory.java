/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.edu.ifnmg.flyweight;

import java.util.HashMap;

/**
 *
 * @author Felkng <&it;felkng374 at @gmail.com&gt;>
 */
public class AnimalFactory {

    private static final HashMap<String, Animal> animalMapa = new HashMap<>();

    public static Animal getAnimal(final String especie) {
        Animal animal = (Animal) animalMapa.get(especie);
        if (animal == null) {
            animal = new Animal(especie);
            animalMapa.put(especie, animal);
            System.out.println("NOVO MAMIFERO ADCIONADO AO ZOOLÓGICO: " + especie);
        }
        return animal;
    }

}
