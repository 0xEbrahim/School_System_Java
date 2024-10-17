public class Person {
    private String name, address, nationality;
    private int age;
    Person(){
        name = "";
        address = "";
        nationality = "";
        age = 0;
    }
    Person(String name, String address, String nationality, int age){
        this.name = name;
        this.address = address;
        this.nationality = nationality;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
