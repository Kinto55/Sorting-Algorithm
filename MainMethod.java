import java.util.*;
import java.lang.Math;
import java.util.Scanner;
// MainMethod.java - Program that prompts for the implementation of a MainMethod
// Author:Markintus Morris
// Date: 26-July-2021

class Main {
    // 15.2
    public static LinkedList<String> reverse(LinkedList<String> strings){
        //what it does: includes for loops for the strings
        //how it works: establishes the exchanging of the position of the strings
      for (int i = 0; i < strings.size() / 2; i++) {
          String to_swap = strings.get(i);
          String swapped = strings.get(strings.size() - i - 1);
          strings.set(i, swapped);
          strings.set(strings.size() - i - 1, to_swap);
      }
  
      return strings;
    }