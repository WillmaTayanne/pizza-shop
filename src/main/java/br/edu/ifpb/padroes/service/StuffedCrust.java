package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.domain.Pizza;


public class StuffedCrust implements Pizza {

	  private Pizza wrappee;

	    public StuffedCrust(Pizza pizza) {
	        this.wrappee = pizza;
	    }

	    @Override
	    public Float getPrice() {
	        return wrappee.getPrice() * 1.20f;
	    }

	    @Override
	    public String getName() {
	        return wrappee.getName() + " (stuffed crust)";
	    }
	
}
