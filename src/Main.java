public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789.0;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4.0;
        System.out.println(dog);
        cat = cat + 4.0;
        System.out.println(cat);
        paper = paper + 4.0;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19.0;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4.0;
        System.out.println(frog);
        var firstWeight = 78.2;
        var secondWeight = 82.7;
        var totalWeight = firstWeight + secondWeight;
        System.out.println(totalWeight);
        var differenceWeight = secondWeight - firstWeight;
        System.out.println(differenceWeight);
        var overWeight = secondWeight % firstWeight;
        System.out.println(overWeight);
        var totalHours = 640;
        var staffQuantity = totalHours / 8;
        System.out.println("всего работников в компании " + staffQuantity + " - человек ");
        var resultQuantity = staffQuantity + 94;
        var resultHours = resultQuantity * 8;
        System.out.println(" Если в компании работает " + resultQuantity+ " человека, то всего " + resultHours + " часов работы должно быть поделено между сотрудниками ");


    }
}