package oop2.tp3.ejercicio4;

import org.jdbi.v3.core.Jdbi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaRepositoryTest {
    private Jdbi jdbiFake;
    private PersonaRepository personaRepository;

    @BeforeEach
    public void setUp() {
        jdbiFake = Jdbi.create("jdbc:h2:mem:FakeDB;DB_CLOSE_DELAY=-1");

        jdbiFake.useHandle(handle -> {
            handle.execute("CREATE TABLE persona (id_persona INT NOT NULL "
                    + "primary key generated always as identity (start with 1,increment by 1), "
                    + "nombre VARCHAR(255), apellido VARCHAR(255))");
        });

        personaRepository = new PersonaRepository(jdbiFake);
    }

    @Test
    public void testInsert() {

    }
}
