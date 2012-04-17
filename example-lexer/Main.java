import lexer.*;

class Main {
  public static void main(String args[]) {
    System.out.println("start.");
    Lexer l = new Lexer();
    while (true) {
      try {
        Token t = l.scan();
        if (t.tag == Tag.NUM) {
          System.out.println("Token : " + t.toString() + " , Tag:" + t.tag + " , value:" + ((Num)t).value );
        } else if (t.tag == Tag.ID){
          System.out.println("Token : " + t.toString() + " , Tag:" + t.tag + " , lexeme:" + ((Word)t).lexeme );
        } else {
          System.out.println("Token : " + t.toString() + " , Tag:" + t.tag );
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}