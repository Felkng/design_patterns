package com.br.edu.ifnmg.abstract_factory.concretproducts.vitruviana;

import com.br.edu.ifnmg.abstract_factory.factories.VitruvianaFactory;
import com.br.edu.ifnmg.abstract_factory.products.Cadeira;

public class CadeiraVitruviana extends VitruvianaFactory implements Cadeira {

    @Override
    public boolean sentar() {
        System.out.println("Sentou na cadeira vitruviana!");
        return true;
    }
}
