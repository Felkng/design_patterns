package com.br.edu.ifnmg.abstract_factory.concretproducts.madeira;

import com.br.edu.ifnmg.abstract_factory.factories.MadeiraFactory;
import com.br.edu.ifnmg.abstract_factory.products.Mesa;

public class MesaMadeira extends MadeiraFactory implements Mesa {

    @Override
    public void colocarObjetos() {
        System.out.println("Objeto colocado na mesa de madeira!");
    }
}
