package com.hiwijaya.maven;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        Person person = new Person("Happy Indra Wijaya", "me@hiwijaya.com");
        Gson gson = new Gson();

        String json = gson.toJson(person);
        System.out.println(json);

    }

}
