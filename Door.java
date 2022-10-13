public class Door {

    private boolean openDoor;

    public void open() {
        this.openDoor = true;
        System.out.println("двери открыты");
    }

    public void close() {
        this.openDoor = false;
        System.out.println("двери закрыты");
    }

    public Boolean getWork() {
        return openDoor;
    }

}
