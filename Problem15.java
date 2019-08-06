import java.util.*;

class UserMainCode15 {

    public static TreeMap<Integer, Integer> calculateRevisedSalary(Map<Integer, String> dob,
            Map<Integer, Integer> salary) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        LocalDate now = LocalDate.of(2014, 9, 1);
        for (int empId : dob.keySet()) {
            String dobb = dob.get(empId);
            int sal = salary.get(empId);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate dobDt = LocalDate.parse(dob.get(empId), formatter);
            int years = Period.between(dobDt, now).getYears();
            if (years >= 25 && years <= 30) {
                map.put(empId, (int) (salary.get(empId) * 1.2));
            } else if (years >= 31 && years <= 60) {
                map.put(empId, (int) (salary.get(empId) * 1.3));
            } else {
                map.put(empId, (int) (salary.get(empId)));
            }

            boolean salC = map.get(empId) < 5000;
            boolean ageC = years < 25 || years > 60;
            if (salC && ageC)
                map.put(empId, -100);
            else if (salC)
                map.put(empId, -100);
            else if (ageC)
                map.put(empId, -200);
        }
        return map;
    }

}

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> dob = new HashMap<>();
        Map<Integer, Integer> salary = new HashMap<>();
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter id: ");
            int id = sc.nextInt();
            System.out.print("Enter dob: ");
            String doBirth = sc.next();
            System.out.print("Enter salary: ");
            int sal = sc.nextInt();
            dob.put(id, doBirth);
            salary.put(id, sal);
        }
        System.out.println(UserMainCode15.calculateRevisedSalary(dob, salary));
    }
}
