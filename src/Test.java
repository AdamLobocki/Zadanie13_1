import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {
        Stats stats = new Stats();
        EmployeeReader employeeReader = new EmployeeReader();
        try {
            Employee[] employees = employeeReader.readEmployees("pracownicy.csv");

            for (Employee employee : employees) {

                System.out.println(employee);

            }
            double salaryAv = stats.averageSalary(employees);
            double salaryMax = stats.biggestSalary(employees);
            double salaryMin = stats.smallestSalary(employees);
            int allEmployee = stats.allEmployee(employees);
            int sectionIt = stats.sectionMembers(employees, "it");
            int sectionManagement = stats.sectionMembers(employees, "Management");
            int sectionSupport = stats.sectionMembers(employees, "Support");
            System.out.println("Srednia wypłata: " + salaryAv);
            System.out.println("Największa wypłata: " + salaryMax);
            System.out.println("Najmniejsza wypłata: " + salaryMin);
            System.out.println("Łączna liczba pracowników: " + allEmployee);
            System.out.println("Liczba pracowników w dziale IT: " + sectionIt);
            System.out.println("Liczba pracowników w dziale Management: " + sectionManagement);
            System.out.println("Liczba pracowników w dziale Support: " + sectionSupport);
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku");
        }


    }
}
