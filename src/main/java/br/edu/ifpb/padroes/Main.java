package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.domain.Pizza;
import br.edu.ifpb.padroes.domain.PizzaShopPizza;
import br.edu.ifpb.padroes.service.PizzaShopService;
import br.edu.ifpb.padroes.service.DiscountCoupon;
import br.edu.ifpb.padroes.service.ExtraCheese;
import br.edu.ifpb.padroes.service.StuffedCrust;


public class Main {

    public static void main(String[] args) {

    	  PizzaShopService pizzaShopService = new PizzaShopService();

          System.out.println("Pizzas - menu");

          for (Pizza pizza : pizzaShopService.getPizzas()) {
              System.out.println(String.format("%s - %.2f", pizza.getName(), pizza.getPrice()));
          }

          StuffedCrust stuffedCrust = new StuffedCrust(
                  new ExtraCheese (
                          new DiscountCoupon (
                                  new PizzaShopPizza("pepperoni", 55.0f)
                          )
                  )
          );

          pizzaShopService.orderPizza(stuffedCrust);

      }

}
