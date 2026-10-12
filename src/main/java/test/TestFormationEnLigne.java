package test;

import model.FormationEnLigne;

public class TestFormationEnLigne {
    public static void main(String[] args) {
        FormationEnLigne formation1 = new FormationEnLigne(1, "SQL", 4, 30);
        FormationEnLigne formation2 = new FormationEnLigne(2, "HTML", 0, 30);

        System.out.println(formation1.getTitre() + " : " + formation1.calculerPrix());
        System.out.println(formation2.getTitre() + " : " + formation2.calculerPrix());
    }
}
