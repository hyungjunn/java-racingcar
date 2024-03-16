package race.domain;

import java.util.Objects;

public class Name {

    private final String name;

    public Name(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("공백없이 정확한 이름을 입력해주세요.");
        }

        if (name.length() > 5) {
            throw new IllegalArgumentException("이름은 5글자를 초과할 수 없습니다.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
