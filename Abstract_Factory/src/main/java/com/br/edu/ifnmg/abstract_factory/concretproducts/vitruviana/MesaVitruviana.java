package com.br.edu.ifnmg.abstract_factory.concretproducts.vitruviana;

import com.br.edu.ifnmg.abstract_factory.factories.VitruvianaFactory;
import com.br.edu.ifnmg.abstract_factory.products.Mesa;

public class MesaVitruviana extends VitruvianaFactory implements Mesa {

    @Override
    public void colocarObjetos() {
        System.out.println("Objeto colocado na mesa vitruviana!");
    }
}
