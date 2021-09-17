package animals;

public class animalKingdom {
    public static void main(String[] args) {
        dog dog1 = new dog("Bambi", "small");
        System.out.println(dog1.siccEm());
        System.out.println(dog1.speak());
        System.out.println(dog1);

        girraffe melvin = new girraffe("melvin", 4,true);
        System.out.println(melvin.isBluTunge());
        System.out.println(melvin.howmanylegs());
        System.out.println(melvin);



    }
}
