public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(250);
        boss.setDamage(50);
        boss.setDefence("power");
        System.out.println("boss health :"+boss.getHealth()+
                "\nboss damage :"+boss.getDamage()+
                "\nboss dafence type : "+boss.getDefence());


        for (Hero hero: createHeroes()) {
            System.out.println("hero health :"+hero.getHealth()+
                    "\nhero damage :"+hero.getDamage()+
                    "\nhero ability type : "+hero.getAbility());
        }
    }

    public static Hero[] createHeroes(){
        Hero [] heroes=new Hero[3];
        Hero thor = new Hero(180,30,"laser");
        Hero mag = new Hero(150,20,"gun");
        Hero witch = new Hero(200,15);
        heroes[0]=thor;
        heroes[1]=mag;
        heroes[2]=witch;
        return heroes;
    }
}