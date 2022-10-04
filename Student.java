public class Student{
    private String id, name;
    private double gpa;

    //Method for set Details 
    public void setDetails(String ID, String n, double GPA){
        id = ID;
        name = n;
        gpa = GPA;
    }

    //Method for show Details 
    public void showDetails(){
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("GPA : "+gpa);
    }

    //Main Method
    public static void main(String args[]){
        //obj for student
        Student sc1 = new Student();
        Student sc2 = new Student();

        sc1.setDetails("615-2500-001", "DUN", 3.45);
        sc2.setDetails("615-2500-002", "AYA", 3.86);

        sc1.showDetails();
        System.out.println();
        sc2.showDetails();
    }
}