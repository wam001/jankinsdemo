package com.wam001.jenkins.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * @author Hamza Amentag
 * @since 5/3/2023
 */
public class ServiceTest {


    @Test
    public void isEqualTo(){
        assertEquals(1,1);
    }

    @Test
    public void notEqualTo(){
        assertNotEquals(10, 100);
    }

    @Test
    public void failedTest(){
        assertEquals(100, 10);
    }
}
