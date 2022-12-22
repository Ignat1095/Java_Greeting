package OOP_Java_2;

public class Dog extends Animal implements Speakable {

    public Dog(String nickname, int paws, String owner) {
        super(nickname, paws, owner);
    }
    @Override
    public String speak(){
        return "wow";
    }
    @Override
    public String toString(){ return String.format("\nDog:%s\n",super.toString()); }
}
