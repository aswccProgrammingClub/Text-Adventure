

import src.characters.Player;

class Main{

    public static void main(String[] args) {
       String hello = "hello";

        Player player = new Player(50);

        System.out.println(player.getHp());

        player.takeDamage(5);

        System.out.println(player.getHp());

        player.speak(hello);

    }

    public static void main(){
        System.out.print("Is this working?");
    }


}
