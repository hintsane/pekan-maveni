package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
  * @param  jj ss jj.
  * @return jj uu ss.
  */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
