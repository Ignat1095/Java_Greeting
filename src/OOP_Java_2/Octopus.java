package OOP_Java_2;

public class Octopus extends Animal implements Swimable {

    public Octopus(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
        this.setOwner("none");
    }

    private void setOwner(String string) {
    }

    @Override
    public int getLegs() {
        
        return super.getLegs();
    }

    @Override
    public String getNickname() {
        
        return super.getNickname();
    }

    @Override
    public int swimSpeed() {
        return 40;
    }

    @Override
    public String toString(){ return String.format("\nOctopus:%s\n",super.toString()); }

}  
