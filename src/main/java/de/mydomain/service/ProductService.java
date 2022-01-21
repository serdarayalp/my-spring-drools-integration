package de.mydomain.service;

import de.mydomain.model.Product;

import org.drools.runtime.StatelessKnowledgeSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service("ProductService")
public class ProductService {

    @Autowired
    private ApplicationContext applicationContext;

    public void calculateDiscount(Product product) {
        StatelessKnowledgeSession statelessKnowledgeSession = (StatelessKnowledgeSession) applicationContext.getBean("productSession");
        statelessKnowledgeSession.execute(product);
    }
}