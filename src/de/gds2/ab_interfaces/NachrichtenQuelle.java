package de.gds2.ab_interfaces;

public interface NachrichtenQuelle {
    public void anmelden(NachrichtenEmpfaenger empf);

    public void abmelden(NachrichtenEmpfaenger empf);

    public void sendeNachricht(String nachricht);
}
