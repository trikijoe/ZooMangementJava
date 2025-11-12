package entities;
import java.util.ArrayList;
import java.util.List;


public class SocieteArrayList implements IGestion<Employe>  , IRechercheAvancee<Employe> {

    private ArrayList<Employe> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe t) {
        employes.add(t);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employes) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }
    

    @Override
    public boolean rechercherEmploye(Employe t) {
        return employes.contains(t);
    }

    @Override
    public void supprimerEmployer(Employe t) {
        employes.remove(t);
    }

    @Override
    public void displayEmployes() {
        for (Employe e : employes) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployesParId() {
        employes.sort((e1, e2) -> Integer.compare(e1.getId(), e2.getId()));
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        employes.sort((e1, e2) -> {
            int nomCompare = e1.getNom().compareTo(e2.getNom());
            if (nomCompare != 0) {
                return nomCompare;
            }
            int deptCompare = e1.getNomDepartement().compareTo(e2.getNomDepartement());
            if (deptCompare != 0) {
                return deptCompare;
            }
            return Integer.compare(e1.getGrade(), e2.getGrade());
        });
    }

    @Override
    public List<Employe> rechercheParDepartement(String nomDepartement) {
        List<Employe> result = new ArrayList<>();
        for (Employe e : employes) {
            if (e.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                result.add(e);
            }
        }
        return result;
    }

}
