package challenges.RepeatedWord;

import challenges.HashMap.Structure.HashMap;

import java.util.Arrays;

public class RepeatedWord {

    public RepeatedWord() {
    }

    public String repeatedWord(String str){
        String[] wordList=str.toLowerCase().split(" ");
        HashMap<String,String> newTable=new HashMap<>();
        System.out.println(Arrays.toString(wordList));
        for (int i=0 ; i<wordList.length ; i++)
        {
            if (!newTable.contains(wordList[i].replaceAll("[^a-zA-Z0-9]","")))
            {
//                System.out.println(wordList[i].replaceAll("[^a-zA-Z0-9]",""));
                newTable.put(wordList[i].replaceAll("[^a-zA-Z0-9]",""),wordList[i].replaceAll("[^a-zA-Z0-9]",""));
            } else {
                return wordList[i].replaceAll("[^a-zA-Z0-9]","");
            }

        }
        return null;
    }
    public HashMap<String,Integer> wordsCount(String str){
        String[] wordList=str.toLowerCase().split(" ");
        HashMap<String,Integer> newTable=new HashMap<>();
        System.out.println(Arrays.toString(wordList));
        for (int i=0 ; i<wordList.length ; i++)
        {
            if (!newTable.contains(wordList[i].replaceAll("[^a-zA-Z0-9]","")))
            {
                int c=1;
                newTable.put(wordList[i].replaceAll("[^a-zA-Z0-9]",""),c);
            } else {
                int count=newTable.get(wordList[i].replaceAll("[^a-zA-Z0-9]",""));
                newTable.put(wordList[i].replaceAll("[^a-zA-Z0-9]",""),count+1);
            }

        }
        return newTable;
    }
}
