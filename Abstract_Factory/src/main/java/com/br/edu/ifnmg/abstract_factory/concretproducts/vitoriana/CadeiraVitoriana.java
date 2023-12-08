package com.br.edu.ifnmg.abstract_factory.concretproducts.vitoriana;

import com.br.edu.ifnmg.abstract_factory.factories.VitorianaFactory;
import com.br.edu.ifnmg.abstract_factory.products.Cadeira;

public class CadeiraVitoriana extends VitorianaFactory implements Cadeira {

    @Override
    public boolean sentar() {
        System.out.println("Sentou na cadeira vitoriana!");
        return true;
    }
}
