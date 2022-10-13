public class Brake {

    private Boolean work;

    public void start() {
        this.work = true;
        System.out.println("Тормоза сработали");
    }

    public void stop() {
        this.work = false;
        System.out.println("Тормоза выключены");
    }

    public Boolean getWork() {
        return work;
    }

}
