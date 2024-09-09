package LibroJava.Capitolo9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Snippet_9_18
{
    // in un'espressione di assegnamento con l'operatore = avremo che:
    // LHS -> left hand side, è quell'espressione/dichiarazione scritta a sinistra di =
    // RHS -> right hand side, è quell'espressione scritta a destra di =
    public static void main(String[] args)
    {
        // OK - inferenza corretta anche se si usa il diamond operator nel RHS
        // nel LHS infatti sono indicati come argomenti di tipo il tipo String e il tipo Integer
        // nessuna ambiguità deduttiva per il compilatore
        // string_int_map sarà di tipo Map<String, Integer>
        Map<String, Integer> string_int_map = new HashMap<>();
        string_int_map.put("Rino", 46);
        string_int_map.put("Paolo", 50);

        // OK - inferenza corretta il compilatore ha informazioni sufficienti per valutare che
        // nel RHS string_int_map è di tipo Map<String, Integer> e dunque che il metodo
        // entrySet dichiarato come public Set<Map.Entry<K,​V>> entrySet() debba ritornare
        // una set view di tipo Set<Map.Entry<String, Integer>>
        // in questo caso notiamo anche come nel LHS var abbia permesso di scrivere la relativa
        // dichiarazione in modo più concisa e compatta
        // in assenza di var avremmo dovuto scrivere qualcosa come:
        // Set<Map.Entry<String, Integer>> entry = string_int_map.entrySet();
        // nessuna ambiguità deduttiva per il compilatore
        // entry sarà di tipo Set<Map.Entry<String, Integer>>
        var entry = string_int_map.entrySet();

        // OK - inferenza corretta anche se si usa il diamond operator nel RHS
        // nel LHS infatti è indicato come argomento di tipo il tipo Integer
        // nessuna ambiguità deduttiva per il compilatore
        // int_list sarà di tipo List<Integer>
        List<Integer> int_list = new ArrayList<>();
        int_list.add(100);
        int_list.add(1000);

        // OK - inferenza corretta anche se si usa l'identificatore var nel LHS
        // nel RHS infatti è indicato come argomento di tipo il tipo Boolean
        // nessuna ambiguità deduttiva per il compilatore
        // bool_list sarà di tipo ArrayList<Boolean>
        var bool_list = new ArrayList<Boolean>();
        bool_list.add(true);
        bool_list.add(false);

        // ATTENZIONE - inferenza non corretta rispetto a quanto desiderato
        // il compilatore non ha informazioni sufficienti per la deduzione di
        // un tipo nè nel LHS nè nel RHS
        // di default, comunque, "sceglierà" il tipo Object...
        // string_list sarà di tipo ArrayList<Object>
        var string_list = new ArrayList<>();
        string_list.add("Prix");
        string_list.add("Srix");

        // OK - inferenza corretta anche se si usa il diamond operator nel RHS
        // e l'identificatore var nel LHS
        // nel RHS è infatti passato come argomento del costruttore di ArrayList
        // il riferimento int_list che è di tipo List<Integer> e questo
        // permette l'individuazione da parte del compilatore del tipo da inferire
        // nessuna ambiguità deduttiva per il compilatore
        // another_int_list sarà di tipo ArrayList<Integer>
        var another_int_list = new ArrayList<>(int_list);
        another_int_list.add(-100);
        another_int_list.add(-1000);
    }
}
