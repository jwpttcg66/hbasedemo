package com.snowcattle.game.hbasedemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;

@SpringBootTest
class HbasedemoApplicationTests {

    @Test
    void contextLoads() {

        System.out.println("hello world");
        testClock();

    }

    public void testClock(){
        Clock clock = Clock.systemDefaultZone();

        Clock offsetLock = clock.offset(clock, Duration.ofDays(1));

        clock = offsetLock;
        // get instant of class
        Instant instant = clock.instant();

        // get ZonedDateTime object from instantObj
        // to get date time
        ZonedDateTime time = instant.atZone(clock.getZone());

        // print details of ZonedDateTime
        System.out.println("ZonedDateTime of class with UTC"
                + " Time Zone is "
                + time.toString());

        clock = Clock.systemDefaultZone();

        // get instant of class
        instant = clock.instant();

        // get ZonedDateTime object from instantObj
        // to get date time
        time = instant.atZone(clock.getZone());

        // print details of ZonedDateTime
        System.out.println("ZonedDateTime of class with UTC"
                + " Time Zone is "
                + time.toString());
    }
}
