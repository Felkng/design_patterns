package com.br.edu.ifnmg.abstract_factory.factories;

import com.br.edu.ifnmg.abstract_factory.concretproducts.vitoriana.CadeiraVitoriana;
import com.br.edu.ifnmg.abstract_factory.concretproducts.vitoriana.MesaVitoriana;
import com.br.edu.ifnmg.abstract_factory.products.Cadeira;
import com.br.edu.ifnmg.abstract_factory.products.Mesa;

public class VitorianaFactory implements MoveisFactory {

    @Override
    public Cadeira criarCadeira() {
        System.out.println("Cadeira vitoriana Criada!");
        return new CadeiraVitoriana();
    }

    @Override
    public Mesa criarMesa() {
        System.out.println("Mesa vitoriana Criada!");
        return new MesaVitoriana();
    }
}
