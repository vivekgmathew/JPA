package com.example;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootJpaApplication {

	@Autowired
	private EntityManager em;
	
	@Autowired
	private StockRepository stockRepo;
	
	@RequestMapping("/stocks")
	public List<Stock> stocks() {
		return em.createQuery("select s from Stock s").getResultList();
	}
	
	@RequestMapping("/stocks/{symbol}")
	public Stock stocksWithSymbol(@PathVariable("symbol") String symbol) {
		return stockRepo.findBySymbol(symbol);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}
}
