// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

// THIS FILE WAS AUTO-GENERATED BY ./wpimath/generate_numbers.py. DO NOT MODIFY

package edu.wpi.first.math.numbers;

import edu.wpi.first.math.Nat;
import edu.wpi.first.math.numbers.Num;

/** A class representing the number 7. */
public final class N7 extends Num implements Nat<N7> {
  private N7() {}

  /**
   * The integer this class represents.
   *
   * @return The literal number 7.
   */
  @Override
  public int getNum() {
    return 7;
  }

  /** The singleton instance of this class. */
  public static final N7 instance = new N7();
}
