
public class Principal {

    public static void main(String args[]) {
        ClasseA a = new ClasseA();
        ClasseB b1 = new ClasseB();
        a.setAClasseB(b1); //Sua chamada é opcional
        ClasseB b2 = new ClasseB();
        a.setAClasseB(b2); //Sua chamada é opcional
    }
}
