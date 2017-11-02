import interfeisai.ArraySarasas;
import interfeisai.LinkedSarasas;
import interfeisai.Sarasas;
import paveldimumas.Dvigalvis;
import paveldimumas.Suo;
import paveldimumas.Trigalvis;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Sarasas> sarasasList = new ArrayList<Sarasas>();
        sarasasList.add(new ArraySarasas());
        sarasasList.add(new LinkedSarasas());

        for (Sarasas item : sarasasList) {
            System.out.println(item.size());
        }

        List<Suo> sunys = new ArrayList<Suo>();
        sunys.add(new Dvigalvis());
        sunys.add(new Trigalvis());

        for (Suo suo : sunys) {
            suo.loti();
            suo.begti();
        }

        // tas pats.
        for (int i = 0; i < sunys.size(); i++) {
            Suo esamas = sunys.get(i);
            esamas.loti();
            esamas.begti();
        }
    }
}
