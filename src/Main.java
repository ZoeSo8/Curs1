//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Employee [] employees = new Employee[10];
    private static void printTabel () {
        for (Employee employee : employees) {
            if (employee.getDepartment()==1)
            System.out.println(employee.getId()+" "+employee.getName()+" ,зарплата "+employee.getSalary()+" рублей");
        }
    }
    private static void summSalary(){
        int summ = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment()==2)
            summ += employee.getSalary();}
                System.out.println("Сумма трат на зарплату сотрудникам за месяц составила " + summ + " рублей");
            }


    private static void calculateMediumSalary(){
        int medium = 0;
        int summ = 0;
        int departmentWorker = 0;
    for (Employee employee : employees) {
        if (employee.getDepartment()==2)
        summ += employee.getSalary();
        departmentWorker = employee.getDepartment();
        medium = summ / departmentWorker;}
        System.out.println("Сумма средняя трат на зарплату сотрудникам за месяц составила " + medium + " рублей");
    }
    private static void maxSalary(){
        int maxSalary =-1;
        for (Employee employee : employees) {
            for (int i = 0; i < employees.length; i++) {
                if (employee.getSalary()> maxSalary&&employee.getDepartment()==2) {
                    maxSalary = employee.getSalary();
                }
            }
        }
        System.out.println("Максимальная зарплата сотрудника составляет " +maxSalary+ " рублей");}

    private static void minSalary(){

        int minSalary = 5_000_000;
        for (Employee employee : employees) {
            for (int i = 0; i < employees.length; i++) {
                if (employee.getSalary() < minSalary&&employee.getDepartment()==1) {
                    minSalary = employee.getSalary();}
            }
        }
        System.out.println("Минимальная зарплата сотрудника составляет " +minSalary+ " рублей");
    }
    private static void printFullName (){
        for (Employee employee: employees)
        System.out.println(employee.getName());
    }
    private static void calculateIndexSalary () {
        double index = 0;
        double procentPlus = 1.1;
        for (Employee employee : employees){
         for (int i = 0; i < employees.length; i++)
              index = employee.getSalary()*procentPlus;
            System.out.println(employee.getName()+ " " +index);
        }
    }
        public static void main(String[] args) {
     employees [0] = new Employee("Быкова Евгения Владимировна", 1, 750000);
     employees [1] = new Employee("Яковлева Марина Сергеевна",1, 100000);
     employees [2] = new Employee("Тенишева Анна Михайловна", 1, 150000);
     employees [3] = new Employee("Беляева Светлана Викторовна", 2, 150000);
     employees [4] = new Employee("Гасанова Сона", 3, 15000);
     employees [5] = new Employee("Максимова Виктория Викторовна", 3, 70000);
     employees [6] = new Employee("Лола", 2, 23000);
     employees [7] = new Employee("Мошина Елена Алексанровна", 2, 25000);
     employees [8] = new Employee("Колибаба Александр Иванович",1, 250000);
     employees [9] = new Employee("Никонова Полина Викторовна", 3, 30000);

printTabel();
summSalary();
maxSalary();
minSalary();
calculateMediumSalary();
printFullName();
calculateIndexSalary();
    }
}