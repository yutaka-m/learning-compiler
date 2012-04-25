import symbols.*;
public class Main {
  public static void main(String[] args) {
    System.out.println("Start");
    Env top = new Env(null);
    top.put("w",new Symbol());
    top.put("x",new Symbol());
    top.put("y",new Symbol());
    System.out.println("top");
    System.out.println("w:"+top.get("w").toString());
    System.out.println("x:"+top.get("x").toString());
    System.out.println("y:"+top.get("y").toString());

    Env next = new Env(top);
    next.put("x",new Symbol());
    next.put("z",new Symbol());
    System.out.println("next");
    System.out.println("x:"+next.get("x").toString());
    System.out.println("z:"+next.get("z").toString());

    Env next2 = new Env(next);
    next2.put("y",new Symbol());
    System.out.println("next2");
    System.out.println("y:"+next2.get("y").toString());
    
    //test
    System.out.println("test");
    System.out.println("x:"+next2.get("x").toString());
    System.out.println("y:"+next2.get("y").toString());
    System.out.println("w:"+next2.get("w").toString());
    System.out.println("z:"+next2.get("z").toString());
    System.out.println("a:"+next2.get("a").toString());
  }
}