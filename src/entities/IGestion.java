package entities;

public interface IGestion<T> {
     void ajouterEmploye(T t);
     boolean rechercherEmploye(String nom);
     boolean rechercherEmploye(T t);
     void supprimerEmployer(T t);
     void displayEmployes();
     void trierEmployesParId();  //Comparable
     void trierEmployeParNomDépartementEtGrade(); // Comparator
}
