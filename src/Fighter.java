public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight, int doge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (doge >=0 && dodge <= 100){
            this.dodge = doge;
        }else{
            this.dodge = 0;
        }
    }

    int hit (Fighter foe){
        System.out.println(this.name + " " + "=>" + " " + foe.name + "'a" + " " + this.damage + " " + "hasar vurdu." );
        if(foe.isDoge()){
            System.out.println(foe.name + " " + "gelen hasarı blokladı.");
            return foe.health;
        }
        if(foe.health - this.damage < 0){
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isDoge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}
