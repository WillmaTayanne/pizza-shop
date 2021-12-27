package br.edu.ifpb.padroes.api.pizzahot.proxy;

import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class PizzaHotServiceProxy implements PizzaHotService {
	
    private PizzaHotService pizzaHotService;
    
    private List<PizzaHotPizza> cache = new ArrayList<>();
    
    public PizzaHotServiceProxy() {
        this.pizzaHotService = new PizzaHotServiceImpl();
    }
    
    @Override
    public List<PizzaHotPizza> getPizzas() {
        if (cache.isEmpty()) {
        	cache = pizzaHotService.getPizzas();
        }
        return cache;
    }
    
}
