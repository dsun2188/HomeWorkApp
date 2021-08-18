public class GB_HW1 {
    public static void main(String[] args) {

        //1. Создать классы Собака и Кот с наследованием от класса Животное.
        //2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается
        // длина препятствия. Результатом выполнения действия будет печать в консоль.
        // (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
        //3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
        // плавание: кот не умеет плавать, собака 10 м.).
        //4. * Добавить подсчет созданных котов, собак и животных.

            Animal animal = new Animal("CatsCategory");
            Cat cat = new Cat("Дуся", 200, false, 2);
            animal.animalInfo();
            cat.animalInfo();
            cat.catInfo();

            Animal danimal = new Animal("Dogs");
            Dog dog = new Dog("Рекс", 500, 10, 0.5);
            danimal.animalInfo();
            dog.animalInfo();
            dog.dogInfo();

        }

}
