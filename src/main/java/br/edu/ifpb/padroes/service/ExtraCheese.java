package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.domain.Pizza;

public class ExtraCheese implements Pizza {

	private Pizza wrappee;

    public ExtraCheese(Pizza pizza) {
        this.wrappee = pizza;
    }

    @Override
    public Float getPrice() {
        return wrappee.getPrice() * 1.10f;
    }

    @Override
    public String getName() {
        return wrappee.getName() + " (extra cheese)";
    }
	
}
