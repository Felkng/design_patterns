package com.br.edu.ifnmg.abstract_factory.concretproducts.vitoriana;

import com.br.edu.ifnmg.abstract_factory.factories.VitorianaFactory;
import com.br.edu.ifnmg.abstract_factory.products.Mesa;

public class MesaVitoriana extends VitorianaFactory implements Mesa {

    @Override
    public void colocarObjetos() {
        System.out.println("Objeto colocado na mesa vitoriana!");
    }
}
