package entities;

public class Employe {
    private int id;
    private String nom;
    private String prenom;
    private String nomDepartement;
    private int grade;

    public Employe() {}

    public Employe(int id, String nom, String prenom, String nomDepartement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDepartement = nomDepartement;
        this.grade = grade;
    }

    //getters
    public int getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getNomDepartement() { return nomDepartement;}
    public int getGrade() { return grade; }
    //setters
    public void setId(int id) { this.id = id; }
    public void setNom(String nom) { this.nom = nom;}
    public void setPrenom(String prenom) { this.prenom = prenom;}
    public void setNomDepartement(String nomDepartement) { this.nomDepartement = nomDepartement;}
    public void setGrade(int grade) { this.grade = grade;}

    @Override
    public String toString() {
        return "Emlpoye{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", grade=" + grade +
                '}';}
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employe)) return false;
        Employe other = (Employe) obj;
        return this.id == other.id && this.nom.equalsIgnoreCase(other.nom);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + nom.hashCode();
        return  result;
    }
}
    
