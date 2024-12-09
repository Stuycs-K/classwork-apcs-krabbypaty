public class Alchemist extends Adventurer {
  private string ability;
  private int fury, furyMAX;

  public Alchemist(String ability, String name, int hp) {
    super(name,hp);
    manaMAX = 100;
    mana = 100;
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


}
