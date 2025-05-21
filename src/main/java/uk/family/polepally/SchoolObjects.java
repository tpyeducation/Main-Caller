package uk.family.polepally;

import uk.family.ecommerce.schools.School;

public class SchoolObjects {
    public static void main(String[] args) {

        School sch =    new School();
        sch.setNoOfStudents(12);
        sch.setSchoolName("Windsor");

        System.out.println(sch.getSchoolName());
        System.out.println(sch.getNoOfStudents());
    }
}