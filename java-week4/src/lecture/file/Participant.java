package lecture.file;

public class Participant {
    private String name;
    private String group;

    public Participant(String name, String group) {
        this.name = name;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' ;
    }
}
