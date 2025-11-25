package entities;
import java.util.*;
public class DepartementHashSet implements IDepartement<Departement> {
    HashSet<Departement> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Departement d) {
        departements.add(d);
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for (Departement d : departements)
            if (d.getNomDepartement().equalsIgnoreCase(nomDepartement))
                return true;
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        departements.remove(d);
    }

    @Override
    public void afficherDepartements() {
        departements.forEach(System.out::println);
    }

    @Override
    public void trierDepartementsParId() {
        List<Departement> list = new ArrayList<>(departements);
        list.sort(Comparator.comparingInt(Departement::getId));
        list.forEach(System.out::println);
    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        List<Departement> list = new ArrayList<>(departements);
        list.sort(Comparator.comparing(Departement::getNomDepartement)
                .thenComparingInt(Departement::getNombreEmployes));
        list.forEach(System.out::println);
    }
}
