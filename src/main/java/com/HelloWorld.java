package com;

import static spark.Spark.*;

public class HelloWorld {
	//abcd
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}