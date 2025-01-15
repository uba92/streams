package JavaStreams;

public class Customer {
    private long id;
    private String name;
    private Integer tier;

    //costruttore
    public Customer(long id, String name, Integer tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    //getter e setter
    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTier(Integer tier) {
        this.tier=tier;
    }

    public Integer getTier() {
        return tier;
    }

    @Override
    public String toString() {
        return "Customer{" + id + ", name= " + name + ", tier= " + tier + "}";
    }
}
