class Main {
  
  public static void main(String[] args) {

    Animal kookoo = new Animal("kookoo!", 2);
    Floor f2 = new Floor(2, kookoo);

    Floor f1 = new Floor(1, new Animal("klick klick", 2));

    Tower t1 = new Tower(f1, f2);

    System.out.println(t1.toString());

  }
  
}