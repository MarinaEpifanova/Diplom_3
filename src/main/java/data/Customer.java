package data;

import org.apache.commons.lang3.RandomStringUtils;

public class Customer {
    private final String username;
    private final String email;
    private final String password;


    public Customer(String username, String email, String password) {
        this. username = username;
        this. email = email;
        this. password = password;


    }
    public static Customer getFirstCustomer() {
        return  new Customer(
                "cosmosburger",
                "cosmosburger@yandex.ru",
                "cvbkmuvfhbyf"

        );
    }

    public static Customer getRandomCustomer() {
        String email = RandomStringUtils.randomAlphabetic(10)+"@yandex.ru";
        String password = RandomStringUtils.randomAlphabetic(10);
        String username = RandomStringUtils.randomAlphabetic(10);
        return new Customer(username, email, password);

    }


    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}