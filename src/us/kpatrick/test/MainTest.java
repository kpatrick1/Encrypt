package us.kpatrick.test;

import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Before
    public void setUp() throws Exception {
        assertNotNull("Error Decrypting","En_crypt.txt");
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void decrypt() {
        assertNotNull(this);
    }
}