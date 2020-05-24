package PrezentacjaZadania.ex11;

public class ProgramString {

    String najdluzszeSlowo = "";
    public String koniec(String wprowadzoneSlowo){
        if (!wprowadzoneSlowo.equals("starczy") && najdluzszeSlowo.length() <  wprowadzoneSlowo.length()){
            najdluzszeSlowo = wprowadzoneSlowo;
        } else if(wprowadzoneSlowo.isEmpty()){
            System.out.println("Nie podano żadnego tekstu");
        }
        return najdluzszeSlowo;
    }
}