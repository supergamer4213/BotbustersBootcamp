// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

// THIS FILE WAS AUTO-GENERATED BY ./wpimath/generate_numbers.py. DO NOT MODIFY

package edu.wpi.first.math.numbers;

import edu.wpi.first.math.Nat;
import edu.wpi.first.math.numbers.Num;

/** A class representing the number 0. */
public final class N0 extends Num implements Nat<N0> {
  private N0() {}

  /**
   * The integer this class represents.
   *
   * @return The literal number 0.
   */
  @Override
  public int getNum() {
    return 0;
  }

  /** The singleton instance of this class. */
  public static final N0 instance = new N0();
}
