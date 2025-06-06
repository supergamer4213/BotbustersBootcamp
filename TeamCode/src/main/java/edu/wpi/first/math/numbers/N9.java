// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

// THIS FILE WAS AUTO-GENERATED BY ./wpimath/generate_numbers.py. DO NOT MODIFY

package edu.wpi.first.math.numbers;

import edu.wpi.first.math.Nat;
import edu.wpi.first.math.numbers.Num;

/** A class representing the number 9. */
public final class N9 extends Num implements Nat<N9> {
  private N9() {}

  /**
   * The integer this class represents.
   *
   * @return The literal number 9.
   */
  @Override
  public int getNum() {
    return 9;
  }

  /** The singleton instance of this class. */
  public static final N9 instance = new N9();
}
