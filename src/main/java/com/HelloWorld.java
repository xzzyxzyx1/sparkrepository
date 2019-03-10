package com;

import static spark.Spark.*;

public class HelloWorld {
	//abcde
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
        System.out.println("abcd");
    }

    public static int getSum(int x, int y) {
    	return x + y;
    }
}