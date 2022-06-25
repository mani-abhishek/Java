class student  {
    private int roll;
    private String name;

    student(int roll, String name) {
        this.name = name;
        this.roll = roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public String toString() {
        return roll + " " + name;
    }

    // public int compareTo(student that) {
    //     if(this.roll>that.roll)
    //     return 1;
    //     else return -1;
    // }
}
