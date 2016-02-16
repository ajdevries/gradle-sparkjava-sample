package nl.ajdevries;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        port(Integer.getInteger("server.port", 8080));
        get("/", (req, res) -> "Hello, World!!!");
        get("/health", "application/json", (req, res) -> "{\"status\":\"UP\"}");
    }
}
