import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> pointsList;

    public GradeRegister() {
        this.pointsList = new ArrayList<>();
    }

    public void add(int points) {
        if (points >= 0 && points <= 100) {
            this.pointsList.add(points);

        }

    }

    public double average() {
        if (pointsList.isEmpty()) {
            return 0.0;

        }
        int sum = 0;

        for (int point : this.pointsList) {
            sum = sum + point;

        }
        double average = (double) sum / this.pointsList.size();

        return average;

    }

    public double passAverage() {
        int passSum = 0;
        int passCount = 0;

        for (int score : this.pointsList) {
            if (score >= 50) {
                passSum += score;
                passCount++;

            }

        }

        if (passCount == 0) {
            return -1.0;

        }

        double passAverage = (double) passSum / passCount;
        return passAverage;

    }

    public double passPercentage() {

        if (this.pointsList.isEmpty()) {
            return 0.0;

        }
        int passCount = 0;

        for (int score : this.pointsList) {
            if (score >= 50) {
                passCount++;

            }

        }
        double passingPercentage = 100.0 * passCount / this.pointsList.size();
        return passingPercentage;

    }

    public int pointsToGrade(int points) {
        if (points < 50) {
            return 0;
        } else if (points < 60) {
            return 1;
        } else if (points < 70) {
            return 2;
        } else if (points < 80) {
            return 3;
        } else if (points < 90) {
            return 4;
        } else {
            return 5;
        }
    }

    public int countGrades(int gradeTarget) {
        int count = 0;

        for (int score : this.pointsList) {
            if (this.pointsToGrade(score) == gradeTarget) {
                count++;

            }

        }
        return count;

    }

}
