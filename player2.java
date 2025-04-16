package game;

public class player2 extends player1 {
    private boolean armor;
    public player2(String name, String weapon, int health, boolean armor) {
        super(name, weapon,health);
        this.armor = armor;
    }
    @Override
    public void shotbygun1() {
        if(armor){
            setHealth(getHealth() -20);
            if(getHealth()<= 0){
                setHealth(0);
            }
            System.out.println("Player has shot by gun1 and the armor is on the new health is "+ getHealth());
        }
        if(!armor){
            setHealth(getHealth() -50);
            if(getHealth()<= 0){
                setHealth(0) ;
            }
            System.out.println("Player has shot by gun1 and the armor is on the new health is "+ getHealth());
        }
        if(getHealth() == 0){
            System.out.println("Player is dead");
        }

    }
@Override
    public void shotbygun2() {
        if(armor){
            setHealth(getHealth() -40);
            if(getHealth()<= 0){
                setHealth(0);
            }
            System.out.println("Player has shot by gun1 and the armor is on the new health is "+ getHealth());
        }
        if(!armor){
            setHealth( getHealth()-50);
            if(getHealth()<= 0){
                setHealth(0);
            }
            System.out.println("Player has shot by gun1 and the armor is on the new health is "+ getHealth());
        }
        if(getHealth() == 0){
            System.out.println("Player is dead");
        }

    }
}




