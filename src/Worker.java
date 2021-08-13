public class Worker
{
    // Поля класса | объекты
    String fullName; // Ф.И.О.
    String position; // Должность
    String email; // @маил
    String phone; // Телефон
    float salary; // Зарплата
    int age; // Возраст


    // Конструктор
    Worker(String fullName,
            String position,
            String email,
            String phone,
            float salary,
            int age)
    {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    void printInfo()
    {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("@маил: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
}