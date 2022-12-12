public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        FirstClass myObjet = new FirstClass();
        System.out.println(myObjet.x);
        FirstClass myObjet2 = new FirstClass();
        System.out.println((myObjet2.x)*2);
        SecondClass mySObjet = new SecondClass();
        System.out.println(mySObjet.x);
        Etudiants Divine = new Etudiants();
        System.out.println("je m'appelle :" +Divine.nom + Divine.prenom + ",j'ai "+Divine.age + "ans ,je vis à " + Divine.ville +" et joignable au "+ Divine.telephone + " immatriculée au "+Divine.matricule);
        Enseignant bedinge =new Enseignant();
        System.out.println("Je suis l'enseignant :" +bedinge.nom + bedinge.prenom + ",j'ai "+bedinge.age + "ans ,je vis à " + bedinge.ville +" et joignable au "+ bedinge.telephone + " immatriculée au "+bedinge.matricule + " mon email est " +bedinge.email + " pour vous dispenser " + bedinge.matiere );
        myMethod();
        myStaticMethod();
        Main syntiche =new Main();
          syntiche.myPublicMethod();
        Main myCar = new Main();   // Create a myCar object
        myCar.fullThrottle();      // Call the fullThrottle() method
        myCar.speed(200);          // Call the speed() method
    }
    static void myMethod() {
        System.out.println("Hello world");
    }
    static  void myStaticMethod() {
        System.out.println("statics method can be call without creating objects");
    }
    //public methods
    public void myPublicMethod() {
        System.out.println("ceci est une methode public");
    }
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!"); }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

// The car is going as fast as it can!
// Max speed is: 200s
}