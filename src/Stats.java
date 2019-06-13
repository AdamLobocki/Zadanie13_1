public class Stats {

    double averageSalary(Employee[] employees){
        double counter = 0;
        int i;
        for ( i = 0; i < employees.length; i++) {
            counter += employees[i].getSalary();
        }
        double resoult = counter/i;
        return resoult;
    }
    int smallestSalary(Employee[] employees){
        int smallest = employees[0].getSalary();
        for (int i = 0; i < employees.length -1; i++) {
            if(employees[i].getSalary() > employees[i+1].getSalary()){
                smallest = employees[i+1].getSalary();
            }
        }
        return smallest;
    }

    int biggestSalary(Employee[] employees){
        int biggest = employees[0].getSalary();
        for (int i = 0; i < employees.length -1; i++) {
            if(employees[i].getSalary() < employees[i+1].getSalary()){
                biggest = employees[i+1].getSalary();
            }
        }
        return biggest;
    }

    int sectionMembers(Employee[] employees, String section){
        int members = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSection().equals(section)){
                members++;
            }
        }
return members;
        }

        int allEmployee(Employee[] employee){
            int i;
            for ( i = 0; i < employee.length ; i++) {

            }
            return i;
        }
    }









