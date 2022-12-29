package OOP_Java_4;

public abstract class Shields implements Defense {
   public abstract int endurance();

   @Override
   public String toString() {
      return String.format("Защита: %d, %d", protection(), endurance());
   }
}

