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

        //when
        int ingredientsInBigmac = bigmac.getIngredients().size();

        //then
        Assert.assertEquals(5, ingredientsInBigmac, 0);
    }
}

