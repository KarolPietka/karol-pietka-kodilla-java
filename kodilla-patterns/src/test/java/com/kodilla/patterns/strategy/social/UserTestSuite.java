package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.socialMedia.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void defaultPublishingMethodTest() {
        //Given
        User millenials = new Millenials("Karol");
        User yGeneration = new YGeneration("Magda");
        User zGeneration = new ZGeneration("Emilka");

        //When
        String millenialsPosted = millenials.sharePost();
        System.out.println("Millenials use: "+millenialsPosted);
        String yGenerationPosted = yGeneration.sharePost();
        System.out.println("Y generation use: "+yGenerationPosted);
        String ZGenerationPosted = zGeneration.sharePost();
        System.out.println("Z generation use: " + ZGenerationPosted);

        //Then
        Assert.assertEquals("Facebook", millenialsPosted);
        Assert.assertEquals("Snapchat", yGenerationPosted);
        Assert.assertEquals("Twitter", ZGenerationPosted);

    }

    @Test
    public void changeMethodOfPublishingPostsTest(){
        //Given
        User zofia = new Millenials("Zofia");

        //When
        String defaultPublishing = zofia.sharePost();
        System.out.println("Zofia usually uses: "+defaultPublishing);
        zofia.setSocialPublisher(new TwitterPublisher());
        String afterChange = zofia.sharePost();
        System.out.println("Zofia sometimes uses: "+afterChange);

        //Then
        Assert.assertEquals("Twitter", afterChange);
    }
}
