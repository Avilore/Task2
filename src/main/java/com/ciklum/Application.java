package com.ciklum;

import com.ciklum.entity.User;
import com.github.javafaker.Faker;

public class Application {

  private static final Faker FAKER = Faker.instance();

  public static void main(String[] argv) {
    int number = 5;
    System.out.printf("\n\rYou want to generate %d records\n\r\n\r", number);

    for (int i = 0; i < number; i++) {
      System.out.println(
          new User(
                  FAKER.number().numberBetween(1, 999999999),
                  FAKER.name().firstName(),
                  FAKER.name().lastName(),
                  FAKER.internet().emailAddress(),
                  FAKER.address().city(),
                  FAKER.address().country())
              .toString());
    }
  }
}
