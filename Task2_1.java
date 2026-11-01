import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.Period;

public class Task2_1 {
    public static void main(String[] args) {
        Student student1 = new Student("Данилин М.А.", LocalDateTime.of(2007, 5, 15, 10, 30), "25ИС16", 4, 4.6);
        Student student2 = new Student("Аксенов Д.Д.", LocalDateTime.of(2004, 11, 20, 14, 0), "25ИС16", 1, 4.8);
        Student student3 = new Student("Бутенко А.А.", LocalDateTime.of(2006, 2, 10, 9, 15), "25ИС16", 2, 4.4);
        
        System.out.println("--- Студент 1 ---");
        System.out.println(student1.toString());
        System.out.println("Возраст: " + student1.getAge() + " лет");
        System.out.println("Отличник? " + student1.isExcellentStudent());

        System.out.println("\n--- Студент 2 ---");
        System.out.println(student2.toString());
        System.out.println("Возраст: " + student2.getAge() + " лет");
        System.out.println("Отличник? " + student2.isExcellentStudent());

        System.out.println("\n--- Студент 3 ---");
        System.out.println(student3.toString());
        System.out.println("Возраст: " + student3.getAge() + " лет");
        System.out.println("Отличник? " + student3.isExcellentStudent());
        
        System.out.println("\n--- Изменение данных (сеттеры) ---");
        System.out.println("Меняем балл Аксенова Д.Д. на 4.9...");
        student2.setAverageScore(4.9); 
        System.out.println("Новый балл: " + student2.getAverageScore());
        System.out.println("Теперь отличник? " + student2.isExcellentStudent());
    }
}

class Student {
    private String name;
    private LocalDateTime birthDate;
    private String group;
    private int studentId;
    private double averageScore;

    public Student(String name, LocalDateTime birthDate, String group, int studentId, double averageScore) {
        this.name = name;
        this.birthDate = birthDate;
        this.group = group;
        this.studentId = studentId;
        this.averageScore = averageScore;
    }

    public int getAge() {
        return Period.between(birthDate.toLocalDate(), LocalDate.now()).getYears();
    }

    public boolean isExcellentStudent() {
        return averageScore >= 4.8;
    }

    @Override
    public String toString() {
        return "Студент: " + name + " | Группа: " + group + " | ID: " + studentId + " | Средний балл: " + averageScore;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public LocalDateTime getBirthDate() { return birthDate; }
    public void setBirthDate(LocalDateTime birthDate) { this.birthDate = birthDate; }
    public String getGroup() { return group; }
    public void setGroup(String group) { this.group = group; }
    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }
    public double getAverageScore() { return averageScore; }
    public void setAverageScore(double averageScore) { this.averageScore = averageScore; }
}
