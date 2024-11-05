package salvar_dados;

import cadastro.Alunos;
import java.util.ArrayList;

public class ControlaAlunos {

    private ArrayList<Alunos> alunos = new ArrayList<>();
    public boolean salvar;    
    public boolean salvar (Alunos a){
        if(a != null){
            alunos.add(a);
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<Alunos> listaAlunos(){
        return alunos;
    }
}
