package com.br.edu.ifnmg.abstract_factory.factories;

import com.br.edu.ifnmg.abstract_factory.concretproducts.madeira.CadeiraMadeira;
import com.br.edu.ifnmg.abstract_factory.concretproducts.madeira.MesaMadeira;
import com.br.edu.ifnmg.abstract_factory.products.Cadeira;
import com.br.edu.ifnmg.abstract_factory.products.Mesa;

public class MadeiraFactory implements MoveisFactory {

    @Override
    public Cadeira criarCadeira() {
        System.out.println("Cadeira de madeira Criada!");
        return new CadeiraMadeira();
    }

    @Override
    public Mesa criarMesa() {
        System.out.println("Mesa de madeira Criada!");
        return new MesaMadeira();
    }
}
