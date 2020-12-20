public class RoomWindow extends AThing {
    private boolean condition;
    RoomWindow(String name, Place place, boolean condition) {
        super(name, place);
        this.condition = condition; // true - opened; false - closed.
    }
    public boolean getCondition() {
        return this.condition;
    }
    public void changeCondition() {
        if(!this.condition) {
            this.condition = true;
            System.out.println("Теперь " + getName() + " открыто");
        }
        else this.condition = false;
    }
}
