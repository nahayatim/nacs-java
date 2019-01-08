package ex07;

import java.util.Objects;

public class Topic {
    private String name;

    public Topic(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "" +
                "" + name ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Topic topic = (Topic) o;
        return Objects.equals(name, topic.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
