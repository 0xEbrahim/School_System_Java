public class Building {
    private String name, address;
    private int floors;
    Person owner;
    Building(){

    }
    Building(String name, String address, int floors, Person owner){
        this.address = address;
        this.floors = floors;
        this.name = name;
        this.owner = owner;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
