/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.edu.ifnmg.flyweight;

/**
 *
 * @author Felkng <&it;felkng374 at @gmail.com&gt;>
 */
public class Animal implements Mamifero {

    String especie;
    Integer x;
    Integer y;

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Animal(String especie) {
        this.especie = especie;
    }

    @Override
    public void deslocar() {
        setX((int) (Math.random() * 100));
        setY((int) (Math.random() * 100));
        System.out.println(this.especie + " deslocou para: (" + getX() + "," + getY() + ")");
    }

}
