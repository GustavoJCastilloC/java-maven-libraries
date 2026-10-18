package reader;

import modelos.Joke;
import modelos.User;
import tools.jackson.core.JacksonException;
import tools.jackson.databind.ObjectMapper;
import utilities.Logs;

import java.io.File;

public class JsonReader {
    private final static String userPath = "src/main/resources/data/user.json";
    private final static String jokesPath = "src/main/resources/data/jokes.json";

    public static User leerUsuarioJson() {
        final var objectMapper = new ObjectMapper();

        try {
            return objectMapper.readValue(new File(userPath), User.class);
        } catch (JacksonException exception) {
            Logs.error("JacksonException: %s", exception.getLocalizedMessage());
            throw new RuntimeException();
        }
    }

    public static Joke[] leerJokeArray() {
        final var objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(
                    new File(jokesPath),
                    objectMapper.getTypeFactory().constructArrayType(Joke.class)
            );
        } catch (JacksonException exception) {
            Logs.error("JacksonException: %s", exception.getLocalizedMessage());
            throw new RuntimeException();
        }
    }
}
