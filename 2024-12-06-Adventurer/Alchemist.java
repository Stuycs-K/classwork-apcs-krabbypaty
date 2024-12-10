public class Alchemist extends Adventurer {
  private string ability;
  private int fury, furyMAX;

  public Alchemist(String ability, String name, int hp) {
    super(name, hp);
    furyMAX = 100;
    fury = 100;
    this.ability = ability;
  }

  public String getSpecialName() {
    return "fury";
  }

  // accessor methods
  public int getSpecial() {
    return fury;
  }

  public void setSpecial(int n) {
    fury = n;
  }

  public int getSpecialMax() {
    return fury;
  }

  public String attack(Adventurer other) {
    int damage = 10;
    other.applyDamage(damage);
    return other + "was dealt 10 damage.";
  }

  public String support(Adventurer other) {
    other.setHP(other.getHP() + 5);
    return other + "is empowered!" + other + "receives a 5 hp heal potion";
  }

  public String support() {
    int hpBuff = 5;
    int furyBuff = 20;
    setHP(getHP() + hpBuff);
    setSpecial(getSpecial() + furyBuff);
    return "Gains 5 hp and 20 fury";
  }

  public String specialAttack(Adventurer other) {
    if (getSpecial() > 20) {
      setSpecial(getSpecial() - 20);
      int Damage = (int) (Math.random() * 15) + 10;
      other.applyDamage(Damage);
      return other.getName() + "is dealt" + Damage;
    } else {
      return "Not enough fury. You only have" + getSpecial();
    }
  }
}
