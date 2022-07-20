/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> gradeList;

    public GradeRegister() {
        this.grades = new ArrayList();
        this.gradeList = new ArrayList();
    }

    public void addGradeToList(int grade) {
        gradeList.add(grade);
        grades.add(pointsToGrade(grade));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int val : this.grades) {
            if (val == grade) {
                count++;
            }
        }
        return count;
    }

    public double pointAverage() {
        double average = 0.0;
        int total = 0;
        int numberTotal = 0;
        for (Integer num : gradeList) {
            if (num >= 0 && num <= 100) {
                numberTotal++;
                total = total + num;
            }
        }

        return total / (double) numberTotal;
    }

    public double pointPassingAverage() {
        double average = 0;
        int total = 0;
        int numberTotal = 0;
        for (Integer num : gradeList) {
            if (num >= 50 && num <= 100) {
                numberTotal++;
                total = total + num;
            }
        }

        return total / (double) numberTotal;
    }

    public double passPercentage() {
        int totalPassing = 0;
        int numberTotal = 0;
        for (Integer num : gradeList) {
            if (num >= 0 && num <= 100) {
                numberTotal++;
                if (num >= 50 && num <= 100) {
                    totalPassing++;
                }
            }
        }
        return 100 * totalPassing / (double) numberTotal;
    }

    public int pointsToGrade(int grade) {
        int num = 0;

        if (grade < 50) {
            num = 0;
        } else if (grade < 60) {
            num = 1;
        } else if (grade < 70) {
            num = 2;
        } else if (grade < 80) {
            num = 3;
        } else if (grade < 90) {
            num = 4;
        } else if (grade >= 90) {
            num = 5;
        }
        return num;
    }

}
