/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.br.edu.ifnmg.flyweight;

/**
 *
 * @author Felkng <&it;felkng374 at @gmail.com&gt;>
 */
public class Flyweight {

    private static final String[] animais = {"Onça", "Leão", "Lobo", "Gorila", "Chimpanzé", "Orangotango", "Zebra", "Vaca", "Girafa"};

    public static void main(String[] args) {
        for(int i=0; i<20; i++){
            Animal novoAnimal = (Animal)AnimalFactory.getAnimal(getRandomAnimal());
            novoAnimal.deslocar();
        }
    }
    
    private static String getRandomAnimal(){
        return animais[(int)(Math.random()*animais.length)];
    }
}
