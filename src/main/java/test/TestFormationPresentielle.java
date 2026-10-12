package test;

import model.FormationPresentielle;

public class TestFormationPresentielle {
    public static void main(String[] args) {
        FormationPresentielle formation1 = new FormationPresentielle(1, "Java", 3, 200);
        FormationPresentielle formation2 = new FormationPresentielle(2, "Python", 0, 200);

        System.out.println(formation1.getTitre() + " : " + formation1.calculerPrix());
        System.out.println(formation2.getTitre() + " : " + formation2.calculerPrix());
    }
}
