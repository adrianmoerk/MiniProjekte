package de.gds2.ab_interfaces;

import java.util.Vector;

public class Vermittler implements NachrichtenEmpfaenger, NachrichtenQuelle {
    private Vector vec = new Vector<Personen>();

    @Override
    public void empfangeNachricht(String nachricht) {
    }

    @Override
    public void anmelden(NachrichtenEmpfaenger empf) {
        vec.add(empf);
    }

    @Override
    public void abmelden(NachrichtenEmpfaenger empf) {
        vec.remove(empf);
    }

    @Override
    public void sendeNachricht(String nachricht) {
        // Alle angemeldeten Objekte werden benachrichtigt
        for (int i = 0; i < vec.size(); i++) {
            NachrichtenEmpfaenger ref = (NachrichtenEmpfaenger) vec.elementAt(i);
            ref.empfangeNachricht(nachricht);
        }
    }
}
