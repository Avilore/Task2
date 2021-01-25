package com.ciklum.entity;

import java.io.Serializable;
import java.util.*;

public class User implements Serializable {
  private final Integer id;
  private final String firstName;
  private final String lastName;
  private final String email;
  private final String city;
  private final String country;

  public User(
      Integer id, String firstName, String lastName, String email, String city, String country) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.city = city;
    this.country = country;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return Objects.equals(id, user.id)
        && Objects.equals(firstName, user.firstName)
        && Objects.equals(lastName, user.lastName)
        && Objects.equals(email, user.email)
        && Objects.equals(city, user.city)
        && Objects.equals(country, user.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, email, city, country);
  }

  @Override
  public String toString() {
    return String.format("%s, %s, %s, %s, %s, %s", email, firstName, lastName, city, country, id);
  }
}
