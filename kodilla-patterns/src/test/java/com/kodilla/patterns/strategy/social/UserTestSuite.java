package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.social.Millenials;
import com.kodilla.patterns.social.User;
import com.kodilla.patterns.social.YGeneration;
import com.kodilla.patterns.social.ZGeneration;
import com.kodilla.patterns.social.publishers.SnapchatPublisher;
import com.kodilla.patterns.social.publishers.TwitterPublisher;
import com.kodilla.patterns.strategy.IndividualCustomer;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User piotr = new Millenials("Piotr Kowalski");
        User jan = new YGeneration("Jan Nowak");
        User zbig = new ZGeneration("Zbig Wolski");

        //When
        String piotrPublishes = piotr.showShare();
        System.out.println("Piotr publishes in: " + piotrPublishes);
        String janPublishes = jan.showShare();
        System.out.println("Jan publishes in: " + janPublishes);
        String zbigPublishes = zbig.showShare();
        System.out.println("Zbig publishes in: " + zbigPublishes);

        //Then
        Assert.assertEquals("Facebook", piotrPublishes);
        Assert.assertEquals("Twitter", janPublishes);
        Assert.assertEquals("Snapchat", zbigPublishes);
    }

    @Test
    public void testIndividualInvestingStrategy() {
        //Given
        User piotr = new Millenials("Piotr Kowalski");

        //When
        String piotrPublishes = piotr.showShare();
        System.out.println("Piotr publishes in: " + piotrPublishes);
        piotr.setSharing(new TwitterPublisher());
        piotrPublishes = piotr.showShare();
        System.out.println("Piotr publishes in: " + piotrPublishes);

        //Then
        Assert.assertEquals("Twitter", piotrPublishes);
    }
}

