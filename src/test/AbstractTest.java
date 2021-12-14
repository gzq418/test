package test;

public abstract class AbstractTest {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public AbstractTest() {
        System.out.println("AbstractTest:");
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
