package Stack_Queues.Conversion;

import java.util.*;

class infixToPrefix {
  
  static boolean isalpha(char c) {
    return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
  }

  static boolean isdigit(char c) {
    return (c >= '0' && c <= '9');
  }

  static boolean isOperator(char c) {
    return (!isalpha(c) && !isdigit(c));
  }

  static int getPriority(char c) {
    if (c == '-' || c == '+') return 1;
    else if (c == '*' || c == '/') return 2;
    else if (c == '^') return 3;
    return 0;
  }

  // reverse letters of the word
  static String reverse(char str[], int start, int end) {
    char temp;
    while (start < end) {
      temp = str[start];
      str[start] = str[end];
      str[end] = temp;
      start++;
      end--;
    }
    return String.valueOf(str);
  }

  static String infixToPostfix(char[] infix1) {
    String infix = '(' + String.valueOf(infix1) + ')';

    int l = infix.length();
    Stack<Character> char_stack = new Stack<>();
    String output = "";

    for (int i = 0; i < l; i++) {

      if (isalpha(infix.charAt(i)) || isdigit(infix.charAt(i))) {
        output += infix.charAt(i);
      }
      else if (infix.charAt(i) == '(') {
        char_stack.add('(');
      }
      else if (infix.charAt(i) == ')') {
        while (char_stack.peek() != '(') {
          output += char_stack.peek();
          char_stack.pop();
        }
        char_stack.pop(); // remove '('
      }
      else { // Operator found
        if (!char_stack.isEmpty() && isOperator(char_stack.peek())) {
          while (!char_stack.isEmpty() &&
                 ((getPriority(infix.charAt(i)) < getPriority(char_stack.peek())) ||
                 (getPriority(infix.charAt(i)) <= getPriority(char_stack.peek()) &&
                  infix.charAt(i) == '^'))) {
            output += char_stack.peek();
            char_stack.pop();
          }
        }
        char_stack.add(infix.charAt(i));
      }
    }
    while (!char_stack.empty()) {
      output += char_stack.pop();
    }
    return output;
  }

  static String infixToPrefix(char[] infix) {
    int l = infix.length;

    // Reverse infix
    String infix1 = reverse(infix, 0, l - 1);
    infix = infix1.toCharArray();

    // Replace ( with ) and vice versa
    for (int i = 0; i < l; i++) {
      if (infix[i] == '(') {
        infix[i] = ')';
      } else if (infix[i] == ')') {
        infix[i] = '(';
      }
    }

    // Convert to postfix
    String postfix = infixToPostfix(infix);

    // Reverse postfix -> gives prefix
    String prefix = reverse(postfix.toCharArray(), 0, postfix.length() - 1);

    return prefix;
  }

  public static void main(String[] args) {
    String s = "(p+q)*(c-d)";
    System.out.println("Infix expression: " + s);
    System.out.print("Prefix expression: ");
    System.out.print(infixToPrefix(s.toCharArray()));
  }
}
