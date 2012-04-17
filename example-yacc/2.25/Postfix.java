import java.io.*;

public class Postfix {
  public static void main(String[] args) throws IOException {
    Parser parse = new Parser();
    parse.expr(); System.out.write('\n');
  }
}

class Parser { 
  static int lookahead;
  
  public Parser() throws IOException {
    lookahead = System.in.read();
  }
  
  void expr() throws IOException {
    term(); rest();
  }
  
  void rest() throws IOException {
    if ( lookahead == '+' ) {
      match('+'); term(); System.out.write('+'); rest();
    } else if( lookahead == '-' ) {
      match('-'); term(); System.out.write('-'); rest();
    } else {
      
    }
  }
  
  void term() throws IOException {
    if (Character.isDigit((char)lookahead)) {
      System.out.write((char)lookahead); match(lookahead);
    }
    else throw new Error("syntax error");
  }
  
  void match(int t) throws IOException {
    if (lookahead == t) { lookahead = System.in.read(); }
    else throw new Error("syntax error");
  }
}
