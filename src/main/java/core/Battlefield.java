/*
 * MIT License
 *
 * Copyright (c) 2016 Andrew Michael Teller(https://github.com/AndrewMiTe)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package core;

import java.util.List;
import java.util.OptionalInt;

/**
 * Location of a battle where teams of fighters compete until the battle's
 * conclusion. Battlefield objects dictate the relative distance between
 * fighters for determining the usability of skills.
 * 
 * @author Andrew M. Teller(https://github.com/AndrewMiTe)
 */
public interface Battlefield {

  /**
   * Returns a list of all fighters currently on the battlefield.
   * 
   * @return list of fighters on the field.
   */
  public List<Fighter> getFighters();

  /**
   * Returns {@code true} if the given Fighter object can be found on the
   * battlefield.
   * 
   * @param fighter
   *          the Fighter object being searched for.
   * @return {@code true} if fighter is found.
   */
  public boolean hasFighter(Fighter fighter);

  /**
   * Returns the distance between to given Fighter objects assumed to be located
   * on the battlefield.  The return value is an {@link OptionalInt} that will
   * return empty if either Fighter object cannot be found on the battlefield.
   * 
   * @param fighterOne
   *          the fighter to begin measuring distance from.
   * @param fighterTwo
   *          the fighter to end measuring distance to.
   * @return the distance between the given fighters as an optional.
   */
  public OptionalInt getDistance(Fighter fighterOne, Fighter fighterTwo);

}