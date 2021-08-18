class Cat extends Animal {

        protected boolean sweem;
        int jump;

        public Cat(String name, int run, boolean sweem, int jump) {
            this.name = name;
            this.run = run;
            this.sweem = sweem;
            this.jump = jump;
        }

        public void catInfo() {
            System.out.println("Имя Кошки: " + name + " /Бег: " + run+ " метров/" + " Плавание:" + sweem);
        }
}
