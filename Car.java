abstract class Car {
    private int id;
    private static int nextId = 0;
    public Car(){
        this.id = nextId;
        nextId++;
    }
    public int getId() {
        return id;
    }
}
