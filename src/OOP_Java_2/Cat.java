package OOP_Java_2;

public class Cat extends Animal implements Speakable {

    public Cat(String nickname, int paws, String owner) {
        super(nickname, paws, owner);
        }
    @Override
    public String speak(){
        return "meow";
    }
    @Override
    public String toString(){ return String.format("\nCat:%s\n",super.toString()); }
}
