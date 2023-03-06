import java.util.Date;

public abstract class Animal {
    private boolean isAlive;
    private Date dob;

    private String name;

    public Animal(boolean isAlive, Date dob, String name) {
        this.isAlive = isAlive;
        this.dob = dob;
        this.name = name;
    }

    public int getAge() {
        if (!isAlive) return -1;
        else return dob.getYear() - new Date().getYear();
    }

    public abstract void makeNoise();

    public void die() {
        isAlive = false;
        System.out.println("rip, " + name);
    }

    @Override
    public String toString() {
        return "name: " + name +  ", isAlive: " + isAlive + ", dob: " + dob.toString();
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
