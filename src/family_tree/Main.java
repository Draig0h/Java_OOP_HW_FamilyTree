package family_tree;

import family_tree.family_tree.FamilyTree;
import family_tree.human.Gender;
import family_tree.human.Human;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();

        Human father = new Human("John", LocalDate.of(1974,11,21), Gender.Male);
        Human mother = new Human("Emma",LocalDate.of(1974,12,12) , Gender.Female);
        Human child1 = new Human("Alice",LocalDate.of(2002,12,21) , Gender.Female, father, mother);
        Human child2 = new Human("Peter",LocalDate.of(2003,10,10) , Gender.Male, father, mother);

        familyTree.add(father);
        familyTree.add(mother);

        familyTree.add(child1);
        familyTree.add(child2);

        System.out.println(familyTree);

    }
}