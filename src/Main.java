public class Main {
    public static void main(String[] args) {
        Person malysh = new Person("Малыш", Place.HOUSE);
        Person karlson = new Person("Карлсон", Place.SOMEWHERE);

        System.out.println(malysh.getName() + " находится " + malysh.getLocation());
        System.out.println(karlson.getName() + " находится " + karlson.getLocation());
        malysh.goTo(Place.ROOM);
        RoomWindow window = new RoomWindow("окно из комнаты Малыша", Place.ROOM,false);
        malysh.interactWithWindow(window);
        malysh.goTo(Place.BED);
        malysh.thinkOf(karlson.getName());
        if(Math.random()*10 >= 6) {
            malysh.cry();
            malysh.thinkOf("том, что больше не увидит: " + karlson.getName());
        }
        Week week = new Week("дни");
        School schoolOne = new School("школа", Place.STREET);
        LessonsPack lessonsPack = new LessonsPack("уроки");
        week.goes();
        schoolOne.exists();
        lessonsPack.exists();
        System.out.println(karlson.getName() + " находится " + karlson.getLocation());
    }
}
