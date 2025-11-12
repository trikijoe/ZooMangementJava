package entities;
import java.util.List;
public interface IRechercheAvancee <T>{

    List<T> rechercheParDepartement(String nomDepartement);
}
