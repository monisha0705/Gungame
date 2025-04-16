package game;

public class player1 {
    private String name;
    private String weapon;
    private int health;
    public player1(String name, String weapon, int health ){
        if(health<0 || health>100) {
            this.health = 100;
        }
        else{
            this.health = health;
        }
        this.name = name;
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void shotbygun1() {
        this.health = this.health - 30;
        if(this.health<=0){
            this.health = 0;
        }
        System.out.println("This is Shot by GUN1 the new health is "+ this.health);
        if(this.health == 0){
            System.out.println(this.name+" is dead");
        }
    }
    public void shotbygun2() {
        this.health = this.health - 50;
        if(this.health<=0){
            this.health = 0;
        }
        System.out.println("This is Shot by GUN2 the new health is "+ this.health);
        if(this.health == 0){
            System.out.println(this.name+" is dead");
        }
    }

}
