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
        System.out.println("je m'appelle :" +Divine.nom + Divine.prenom + ",j'ai"+Divine.age + "ans ,je vis à " + Divine.ville +" et joignable au "+ Divine.telephone + " immatriculée au "+Divine.matricule);
    }
}