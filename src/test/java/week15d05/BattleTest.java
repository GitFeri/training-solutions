package week15d05;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class BattleTest {

    @Test
    void testReadMaxBattleMilitante() {

        System.out.println(new Battle().
                readMaxBattleMilitante(Path.of(
                        "files","week15d05","battles.csv")));

    }
}