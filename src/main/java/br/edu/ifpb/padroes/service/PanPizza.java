package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.domain.Pizza;


public class PanPizza implements Pizza {

	private Pizza wrappee;

    PanPizza(Pizza pizza) {
        this.wrappee = pizza;
    }

    @Override
    public Float getPrice() {
        return wrappee.getPrice() * 1.15f;
    }

    @Override
    public String getName() {
        return wrappee.getName() + " (pan pizza)";
    }
	
}
