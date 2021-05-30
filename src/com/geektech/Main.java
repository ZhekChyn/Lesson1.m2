package com.geektech;

public class Main {

    public static void main(String[] args) {

        Shelter petsClub = new Shelter("Pets Club", "Osh");

        Dog Alabai = new Dog();
        Dog Hotdog = new Dog("Taksa", "Sausage", Color.WHITE, petsClub);
        Dog It = new Dog("Laika","Noisy", Color.BLACK, petsClub, new String[]{"Bring", "Destroy"});

        System.out.println(It.getInfo());
        It.makeVoice("Vav vav", 3);
        System.out.println("================================");
        System.out.println(Alabai);
        Alabai.makeVoice("Gaav gaav");
        System.out.println("================================");
        System.out.println(Hotdog.getInfo());
        Hotdog.makeVoice(3,"Av av");
    }
}
