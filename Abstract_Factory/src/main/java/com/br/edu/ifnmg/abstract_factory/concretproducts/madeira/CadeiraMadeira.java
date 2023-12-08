package com.br.edu.ifnmg.abstract_factory.concretproducts.madeira;

import com.br.edu.ifnmg.abstract_factory.factories.MadeiraFactory;
import com.br.edu.ifnmg.abstract_factory.products.Cadeira;

public class CadeiraMadeira extends MadeiraFactory implements Cadeira {

    @Override
    public boolean sentar() {
        System.out.println("Sentou na cadeira de madeira!");
        return true;
    }
}
