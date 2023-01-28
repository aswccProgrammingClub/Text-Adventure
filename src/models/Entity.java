package src.models;


public class Entity {
    String name;
    int hp;

    boolean isAlive;

    boolean isGood;

    public Entity(int hp){
        this.hp = hp;
        this.isAlive = true;
    }

    //subtracts damage from hp
    public void takeDamage(int damage){
        this.hp = hp - damage;
    }

    public int getHp(){
        return this.hp;
    }

    public void speak(String line){
        System.out.println(line);
    }


}
