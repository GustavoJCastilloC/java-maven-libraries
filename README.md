# Java Maven Libraries

Practice project built with **Java 17** and **Maven** to learn how to add and use external libraries (dependencies) in a
real project structure.

## Technologies

| Library                                         | Purpose                                                   |
|-------------------------------------------------|-----------------------------------------------------------|
| [JavaFaker](https://github.com/DiUS/java-faker) | Generate random test data (names, emails, numbers)        |
| [Log4j2](https://logging.apache.org/log4j/2.x/) | Logging with different levels (error, info, debug, trace) |
| [Poiji](https://github.com/ozlerhakan/poiji)    | Map Excel sheets to Java objects                          |
| [Jackson](https://github.com/FasterXML/jackson) | Parse JSON files into Java objects                        |

## Project structure

```
src/main/java
├── modelos      → Data models (User, Address, Joke, Videojuego, Monstruo...)
├── Parser       → Classes that convert Excel data into objects
├── reader       → ExcelReader and JsonReader
├── utilities    → Logs (Log4j2 wrapper)
└── principal    → Executable exercises (classes with main)

src/main/resources
├── data         → Input files (dataExcel.xlsx, user.json, jokes.json)
└── log4j2.xml   → Logging configuration
```

## Exercises

| Class                     | Description                                                                     |
|---------------------------|---------------------------------------------------------------------------------|
| `Main`                    | Logging demo with different levels using Log4j2                                 |
| `FakerDemo`               | Generates a random name with JavaFaker                                          |
| `Ejercicio1DataAleatoria` | Creates two athletes with random data and shows the fastest one                 |
| `Ejercicio2DataAleatoria` | Generates a random-sized list of users with fake data                           |
| `Ejercicio1LeerExcel`     | Reads video games from Excel and filters those longer than 50 hours             |
| `Ejercicio2LeerExcel`     | Reads monsters from Excel and sorts them by level (bubble sort)                 |
| `Ejercicio3LeerExcel`     | Reads products from Excel                                                       |
| `Ejercicio1LeerJson`      | Reads a user from a JSON file, including nested objects (address, geo, company) |
| `Ejercicio2LeerJson`      | Reads an array of jokes from JSON and sorts them by id (bubble sort)            |

## How to run

**From IntelliJ IDEA:**

1. Clone the repository and open it as a Maven project.
2. Wait for Maven to download the dependencies.
3. Open any class in the `principal` package and click the green ▶ button next to `main`.

**From the command line** (requires Maven installed):

```bash
mvn compile exec:java -Dexec.mainClass="principal.Ejercicio1LeerJson"
```

Replace `Ejercicio1LeerJson` with the class you want to run.

## Concepts practiced

- Managing dependencies in `pom.xml`
- Reading Excel and JSON files and mapping them to objects
- Nested objects in JSON (`User → Address → Geo`)
- Logging levels and configuration with `log4j2.xml`
- Text blocks and `String.format` for custom `toString()` methods
- Bubble sort algorithm