package com.ocr.cedricTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class OrderTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(System.out);
    }

    Order order = new Order();

    @Test
    public void Created_Player_has_a_level_in_right_ranges() {
        createPlayer();
        assertEquals("Le niveau est compris entre 1 et 100", 1<createdPlayer().level<100);
    }
    @Test
    public void Sum_of_player_characteristics_is_inf_to_his_level() {
        createPlayer();
        assertEquals("La somme des charact n'est pas supérieure au niveau", createdPlayer().strength + createdPlayer().dexterity + createdPLayer.intellect <= createdPlayer().level);
    }
}