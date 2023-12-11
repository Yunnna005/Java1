package collegeapp2022;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class TestCollege {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        AcademicStaff  mary = new AcademicStaff("Mary McCarthy","Tralee, Co. Kerry","085-1234567", "t00012345",new GregorianCalendar(1986,5,23),"fulltime","lecturer",22, "R212",new String[]{"Mathematics","Mechanics","Hydraulics","Final Year Project"});
//        System.out.println(mary);
        employees.add(mary);

        AcademicStaff sally = new AcademicStaff("Sally Fletcher","Mallow, Co. Cork","087-6758393", "t00065432",new GregorianCalendar(1998,11,29),"prorata","researcher",1, "S217",new String[]{"Social Care","Psychology","Behavioural Science"});
//        System.out.println(sally);
        employees.add(sally);

        FinanceStaff lucy = new FinanceStaff("Lucy Ward","Kenmare, Co. Kerry","083-1145322", "t00056373",new GregorianCalendar(1996,10,20),"halftime","staff officer",8, "C215",new String[]{"Payroll","Procurement"});
//        System.out.println(lucy);
        employees.add(lucy);

        for (Employee employee :
                employees)   {
            System.out.println(employee);
        }

//        int minIdx = 0;
//        int maxIdx = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] nums = new int[]{3, 9, 41, 4, 5, 1, 12, 31, 2, 3, 1};
        for (int num : nums) {


            if (num > max) {
                max = num;
//                maxIdx = i;
            } else if (num < min) {
                min = num;
//                minIdx = i;
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}
