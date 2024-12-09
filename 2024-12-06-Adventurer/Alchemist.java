public class Alchemist extends Adventurer {
  private string ability;
  private int fury, furyMAX;

  public Alchemist(String ability, String name, int hp) {
    super(name,hp);
    furyMAX = 100;
    fury = 100;
    this.ability = ability;
  }

  public abstract String getSpecialName() {
    return "fury";
  }

  //accessor methods
  public abstract int getSpecial() {
    return fury;
  }

  public abstract void setSpecial(int n) {
    fury = n;
  }

  public abstract int getSpecialMax() {
    return fury;
  }

  public abstract String attack(Adventurer other) {
    int damage = int 10;
    other.applyDamage(damage);
    return other + "was dealt 10 damage";
  }

  
}
