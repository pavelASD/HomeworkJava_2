package homework1;

public class Main {
    public static void main(String[] args) {

    Team firstTeam = new Team("Alpha", new String[]{"James", "Thomas", "Alice", "Katy"}, 1800);
    Course course = new Course(new int[]{120, 290, 700, 300});
    course.dolt(firstTeam);

    }
}
