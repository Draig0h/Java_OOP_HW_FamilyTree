import javax.management.ObjectName;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Human {
    private long id;
    private String name;
    private int age;
    private Gender gender;
    private Human father, mother;
    private List<Human> children;

    public Human(String name, int age, Gender gender, Human father, Human mother) {
        id = -1;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
        children = new ArrayList<>();

    }

    public Human(String name, int age, Gender gender) {
        this(name, age, gender, null, null);
    }

    public boolean addChild(Human child) {
        if (!children.contains(child)) {
            children.add(child);
            return true;
        }
        return false;
    }

    public boolean addParent(Human parent){
        if (parent.getGender().equals(Gender.Male)){
            setFather(parent);
        } else if (parent.getGender().equals(Gender.Female)){
            setMother(parent);
        }
        return true;
    }

    public Gender getGender(){
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public List<Human> getParents() {
        List<Human> list = new ArrayList<>();
        if (father != null) {
            list.add(father);
        }
        if (mother != null) {
            list.add(mother);
        }
        return list;
    }

    public List<Human> getChildren(){
        return children;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id: ");
        stringBuilder.append(id);
        stringBuilder.append(", name: ");
        stringBuilder.append(name);
        stringBuilder.append(", gender: ");
        stringBuilder.append(gender);
        stringBuilder.append(", age: ");
        stringBuilder.append(age);
        stringBuilder.append(", father: ");
        stringBuilder.append(getFatherInfo());
        stringBuilder.append(", mother: ");
        stringBuilder.append(getMotherInfo());
        stringBuilder.append(", children: ");
        stringBuilder.append(getChildrenInfo());
        return stringBuilder.toString();
    }

    public String getFatherInfo() {
        String result = "father: ";
        Human father = getFather();
        if (father != null) result += father.getName();
        else result += "unknown";
        return result;
    }

    public String getMotherInfo() {
        String result = "mother: ";
        Human mother = getMother();
        if (mother != null) result += father.getName();
        else result += "unknown";
        return result;
    }

    public String getChildrenInfo() {
        StringBuilder result = new StringBuilder("children: ");
        if (children.size() != 0) {
            result.append(children.get(0).getName());
            for (int i = 1; i < children.size(); i++) {
                result.append(", ");
                result.append(children.get(i).getName());
            }
        } else {
            result.append("none");
        }
        return result.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Human human = (Human) obj;
        return human.getId() == getId();
    }

    @Override
    public String toString() {
        return getInfo();
    }

}


