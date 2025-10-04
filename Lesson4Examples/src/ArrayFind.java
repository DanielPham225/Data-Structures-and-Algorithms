/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */


/**
 * Demonstration of algorithm for finding a given value within an array.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
class ArrayFind {

  /** Returns index j such that data[j] == val, or -1 if no such element. */
  public static int arrayFind(int[] data, int val) {
    int n = data.length;
    int j = 0;
    while (j < n) { // val is not equal to any of the first j elements of data
      if (data[j] == val)
        return j;                    // a match was found at index j
      j++;                           // continue to next index
      // val is not equal to any of the first j elements of data
    }
    return -1;                       // if we reach this, no match found
  }
// this is 0 to o(n)
  //bestcase: O(1): element at the first position
  //worstcase: O(n): element at the last or not in the array
  //therefore average is: o(n)
  // the result depends on the postion of the element and running time depends on how big of our dataset
  // O(n) = running time increase with the amount of data
}


