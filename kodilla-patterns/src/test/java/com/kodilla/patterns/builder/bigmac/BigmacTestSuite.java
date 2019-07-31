package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("mashrooms")
                .bun("sesame")
                .burgers(4)
                .sauce("barbecue")
                .ingredient("onion")
                .ingredient("cheese")
                .ingredient("cucumber")
                .ingredient("salad")
                .build();

        System.out.println(bigmac);

        //When
        int ingredientsInBigmac = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(5, ingredientsInBigmac, 0);
    }
}

