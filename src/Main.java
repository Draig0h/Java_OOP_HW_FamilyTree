//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();

        Human father = new Human("John", 45, Gender.Male);
        Human mother = new Human("Emma", 43, Gender.Female);
        Human child1 = new Human("Alice", 20, Gender.Female, father, mother);
        Human child2 = new Human("Peter", 18, Gender.Male, father, mother);

        familyTree.add(father);
        familyTree.add(mother);

        familyTree.add(child1);
        familyTree.add(child2);

        System.out.println(familyTree);

    }
}