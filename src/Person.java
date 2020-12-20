import javax.swing.text.Style;
import java.util.Objects;

public class Person implements Actions{
    private String name;
    private Place place;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", place=" + place +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && place == person.place;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, place);
    }

    Person(String name, Place place) {
        this.name = name;
        this.place = place;
    }

    public String getName() {
        return this.name;
    }

    public void goTo(Place place) {
        this.place = place;
        System.out.println(this.name + " переходит в другое место. Теперь " + this.name + " " + this.getLocation());
    }

    public void interactWithWindow(RoomWindow window) {
        if(!window.getCondition()) {
            System.out.println(this.name + " распахивает окно");
            window.changeCondition();
        } else {
            System.out.println(this.name + " решает оставить окно открытым");
        }
    }

    public void thinkOf(String name) {
        System.out.println(this.name + " думает о " + name);
    }

    public void cry() {
        System.out.println(this.name + " тихо плачет :'(");
    }

    public String getLocation() {
        if(this.place == Place.HOUSE) {
            return "в доме";
        } else if(this.place == Place.STREET) {
            return "на улице";
        } else if(this.place == Place.ROOM) {
            return "в комнате";
        } else if(this.place == Place.BED) {
            return "в кровати";
        } else if(this.place == Place.KITCHEN) {
            return "на кухне";
        } else return "где-то...";
    }

}
