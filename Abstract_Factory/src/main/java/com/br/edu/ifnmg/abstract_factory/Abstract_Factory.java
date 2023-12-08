/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.br.edu.ifnmg.abstract_factory;

import com.br.edu.ifnmg.abstract_factory.factories.MadeiraFactory;
import com.br.edu.ifnmg.abstract_factory.factories.VitruvianaFactory;
import com.br.edu.ifnmg.abstract_factory.products.Cadeira;
import com.br.edu.ifnmg.abstract_factory.products.Mesa;
import java.util.ArrayList;

/**
 *
 * @author Felkng <&it;felkng374 at @gmail.com&gt;>
 */
public class Abstract_Factory {

    public static void main(String[] args) {
        ArrayList<Cadeira> lojaDeCadeiras = new ArrayList<>();
        lojaDeCadeiras.add(new MadeiraFactory().criarCadeira());
        lojaDeCadeiras.add(new VitruvianaFactory().criarCadeira());

        for (Cadeira x : lojaDeCadeiras) {
            x.sentar();
        }

        ArrayList<Mesa> lojaDeMesas = new ArrayList<>();
        lojaDeMesas.add(new MadeiraFactory().criarMesa());
        lojaDeMesas.add(new VitruvianaFactory().criarMesa());

        for (Mesa x : lojaDeMesas) {
            x.colocarObjetos();
        }
    }
}
