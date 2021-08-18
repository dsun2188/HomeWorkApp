class Dog extends Animal {

        public double jump;
        public int sweem;

        public Dog(String name, int run, int sweem, double jump ) {
            this.name = name;
            this.run = run;
            this.sweem = sweem;
            this.jump = jump;
        }
        public void dogInfo() {
            System.out.println("Имя Собаки: " + name + " /Бег: " + run + " /Плавание: " + sweem);
        }
}
