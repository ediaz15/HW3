/*
 * Erick Diaz COMP 272 002
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
    //
    // This can be done numerous ways, but once such will only that
    // *several* lines of code. Hint: create two temporary TreeSets and utilize the
    // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.

    return setA;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    //Create a Set for keys in the treeMap
      //newTreeMap to only put in key,value pairs where the treeMap's key is odd
      Set<Integer> keyValues = treeMap.keySet();
      Map<Integer, String> newTreeMap = new TreeMap<>();
      for (int i : keyValues) {
          if (i % 2 != 0) {
              newTreeMap.put(i, treeMap.get(i));
          }
      }

      //delete treeMap then just putAll values from newTreeMap to only store odd key, value pairs
      treeMap.clear();
      treeMap.putAll(newTreeMap);
    return;
  }



  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

      //iterate over one tree, getting its keys and values, then check if the other tree contains key and value
        //moment a key/value pair isnt equal, break and return false!
      boolean isEqual = true;
      for(int i: tree1.keySet()){
          if(!(tree2.containsKey(i) && tree2.containsValue(tree1.get(i)))){
              isEqual = false;
              return isEqual;
          }
      }

    return isEqual;

  }

} // end treeProblems class
