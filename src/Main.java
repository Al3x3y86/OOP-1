public class Main {
    public static void main(String[] args) {

        Human Maksim = new Human (1988, " Максим", " Минск", " бренд-менеджером.");
        Maksim.printHuman();
        Human Anya = new Human (1993," Аня"," Москва", " методистом образовательных программ.");
        Anya.printHuman();
        Human Katya = new Human (1992, " Катя", " Калиниград", " продакт-менеджером.");
        Katya.printHuman();
        Human Artem = new Human (1995, " Артем", " Москва", " директором по развитию бизнеса.");
        Artem.printHuman();

        Car Lada = new Car("Lada","Granta", 1.7,"желтый",2015,"Россия");
        Lada.printCar();
        Car Audi = new Car("Audi","A8 50L TDI quattro", 3.0,"черный",2020,"Германия");
        Audi.printCar();
        Car BMW = new Car("BMW","Z8", 3.0,"черный",2021,"Германия");
        BMW.printCar();
        Car KIA = new Car("KIA","Sportage 4-го поколения", 2.4,"красный",2018,"Южная Корея");
        KIA.printCar();
        Car Hyundai = new Car("Hyundai","Avante", 1.6,"оранжевый",2016,"Южная Корея");
        Hyundai.printCar();

    }




}

