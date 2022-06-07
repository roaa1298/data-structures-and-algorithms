package challenges.LeftJoin;

import challenges.HashMap.Structure.HashMap;

import java.util.ArrayList;
import java.util.List;

public class LeftJoin {

    public List<List<String>> leftJoin(HashMap<String,String> table1, HashMap<String,String> table2){
        List<List<String>> res=new ArrayList<>();
        List<String> table1List=table1.keys();
        System.out.println(table1List.toString());
        for (int i=0 ; i<table1List.size() ; i++)
        {
            if (table2.contains(table1List.get(i)))
            {
                res.add(new ArrayList<>());
                res.get(i).add(table1List.get(i));
                res.get(i).add(table1.get(table1List.get(i)));
                res.get(i).add(table2.get(table1List.get(i)));
            } else {
                res.add(new ArrayList<>());
                res.get(i).add(table1List.get(i));
                res.get(i).add(table1.get(table1List.get(i)));
                res.get(i).add(null);
            }
        }
        return res;
    }
}
