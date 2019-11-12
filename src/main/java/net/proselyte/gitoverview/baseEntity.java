package net.proselyte.gitoverview;

public class baseEntity {


    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "baseEntity{" +
                "id=" + id +
                '}';
    }

    public boolean isNew() {
        return (this.id==null);

    }
}
