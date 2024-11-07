//the getname method in bird overrode the getname function in animal in instances of bird.


public class Driver{
  public static void main(String[] args){
    Animal freshie = new Animal("durrrr", 45, "freshie");
    freshie.speak();
    Bird birdie = new Bird("chirp", 5, "birdie", 4.3, "black");
    birdie.speak();
  }
}
