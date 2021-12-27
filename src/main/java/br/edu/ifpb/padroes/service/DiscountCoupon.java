package br.edu.ifpb.padroes.service;

import br.edu.ifpb.padroes.domain.Pizza;


public class DiscountCoupon implements Pizza {
	
	  private Pizza wrappee;

	    public DiscountCoupon(Pizza pizza) {
	        this.wrappee = pizza;
	    }

	    @Override
	    public Float getPrice() {
	        return wrappee.getPrice() * 0.25f;
	    }

	    @Override
	    public String getName() {
	        return wrappee.getName();
	    }
	
	
	
}
