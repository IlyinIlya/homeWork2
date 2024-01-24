public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
    // Задача №1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    // Задача №2
        System.out.println("Задача №2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    // Задача №3
        System.out.println("Задача №3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
    // Задача №4
        System.out.println("Задача №4");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);
    // Задача №5
        System.out.println("Задача №5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);
    // Задача №6
        System.out.println("Задача №6");
        var massBoxer1 = 78.2;
        var massBoxer2 = 82.7;
        var totalWeightBoxers = massBoxer1 + massBoxer2;
        System.out.println("Общая масса бойцов = " + totalWeightBoxers);
        var diffBetweenMass = massBoxer1 - massBoxer2;
        System.out.println("Разница масс бойцов = " + diffBetweenMass);
    // Задача №7
        System.out.println("Задача №7");
        var diffBetweenMassWay1 = massBoxer2 - massBoxer1;
        System.out.println("Разница масс бойцов = " + diffBetweenMassWay1);
        var diffBetweenMassWay2 = massBoxer2 % massBoxer1;
        System.out.println("Разница масс бойцов = " + diffBetweenMassWay2);
    // Задача №8
        System.out.println("Задача №8");
        var totalTime = 640;
        var employeeWorkTime = 8;
        var totalNumberEmploees = totalTime / employeeWorkTime;
        System.out.println("Всего работников в компании - " + totalNumberEmploees + " человек");
        totalNumberEmploees = totalNumberEmploees + 94;
        totalTime = totalNumberEmploees * employeeWorkTime;
        System.out.println("Если в компании работает " + totalNumberEmploees + " человек, то всего " + totalTime + " часов работы может быть поделено между сотрудниками");
    }
}