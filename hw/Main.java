package seminarjava3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudyGroup group = new StudyGroup();
        StudyGroupService studyGroupService = new StudyGroupService(group);

        studyGroupService.addStudent("Ваня");
        studyGroupService.addStudent("Петя");
        studyGroupService.addStudent("Вася");
        studyGroupService.addStudent("Маша");

        for (Student student : group) {
            System.out.println(student);
        }
        System.out.println();

        studyGroupService.sortByName();
        for (Student student : group) {
            System.out.println(student);
        }

        System.out.println();

        studyGroupService.sortById();
        for (Student student : group) {
            System.out.println(student);
        }
    }
}
