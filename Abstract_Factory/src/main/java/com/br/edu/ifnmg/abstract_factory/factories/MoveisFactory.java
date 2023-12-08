package com.br.edu.ifnmg.abstract_factory.factories;

import com.br.edu.ifnmg.abstract_factory.products.Cadeira;
import com.br.edu.ifnmg.abstract_factory.products.Mesa;

public interface MoveisFactory {

    Cadeira criarCadeira();

    Mesa criarMesa();
}
