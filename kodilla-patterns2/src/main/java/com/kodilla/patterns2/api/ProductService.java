package com.kodilla.patterns2.api;

import java.math.BigDecimal;
import java.util.Random;

public class ProductService {
    public BigDecimal getPrice(Long productId){
        Random generator = new Random();
        return new BigDecimal(generator.nextInt(100000)/100);
    }
}
