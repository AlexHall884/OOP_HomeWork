package HomeWork4;

public class Program {
    public static void main(String[] args) {
        
        Hero hero1 = new Hero("Robin Hood", 145, new LongBow());
        Team<Archer> sherwoodTeam = new Team<>(hero1);
        sherwoodTeam.add(new Archer("Jhon brigand", 120, new Bow(), 80));
        sherwoodTeam.add(new Archer("Tom brigand", 130, new Bow(),new SmallShield(), 75));

        System.out.println(sherwoodTeam);
        System.out.println(sherwoodTeam.getTeamHealthPoint() + "\n");

        Hero hero2 = new Hero("Dumbledore", 160, new Staff());
        Team<Mage> gryffindorTeam = new Team<>(hero2);
        gryffindorTeam.add(new Mage("Godrick Gryffindor", 148, new Staff(),new MagicShield(), 120, 200));
        gryffindorTeam.add(new Mage("Harry Potter", 130, null, 80, 150));
        gryffindorTeam.add(new Mage("Ron Weasley", 110, null, 70, 120));

        System.out.println(gryffindorTeam);
        System.out.println(gryffindorTeam.getTeamHealthPoint() + "\n");


        Hero hero3 = new Hero("Geralt", 180, new Sword(), null);
        Team<Swordsman> witcherTeam = new Team<>(hero3);
        witcherTeam.add(new Swordsman("Cirilla", 150, new Sword(), null));
        witcherTeam.add(new Swordsman("Lambert", 170, new Sword(), null));
        
        System.out.println(witcherTeam);
        System.out.println(witcherTeam.getTeamHealthPoint() + "\n");

        
        Hero hero4 = new Hero("Aragorn", 170, new Sword(), new HeavyShield());
        Team<Warrior> lordRings = new Team<>(hero4);
        lordRings.add(new Archer("Legalas", 95, new LongBow(), 140));
        lordRings.add(new Swordsman("Gimmly", 150, new Sword(), new LeatherShield()));
        lordRings.add(new Mage("Gendalf", 110, new Staff(),new MagicShield(), 100, 150));

        System.out.println(lordRings);
        System.out.println(lordRings.getTeamHealthPoint());
    }
}
