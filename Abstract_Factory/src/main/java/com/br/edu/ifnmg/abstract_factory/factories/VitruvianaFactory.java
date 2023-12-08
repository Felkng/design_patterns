package com.br.edu.ifnmg.abstract_factory.factories;

import com.br.edu.ifnmg.abstract_factory.concretproducts.vitruviana.CadeiraVitruviana;
import com.br.edu.ifnmg.abstract_factory.concretproducts.vitruviana.MesaVitruviana;
import com.br.edu.ifnmg.abstract_factory.products.Cadeira;
import com.br.edu.ifnmg.abstract_factory.products.Mesa;

public class VitruvianaFactory implements MoveisFactory {

    @Override
    public Cadeira criarCadeira() {
        System.out.println("Cadeira vitruviana Criada!");
        return new CadeiraVitruviana();
    }

    @Override
    public Mesa criarMesa() {
        System.out.println("Mesa vitruviana Criada!");
        return new MesaVitruviana();
    }
}
