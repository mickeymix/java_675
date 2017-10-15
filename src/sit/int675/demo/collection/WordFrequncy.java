/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.demo.collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author INT675
 */
public class WordFrequncy {

    Map<String, WordCount> map = new HashMap(400, 0.5f);

    public void processFile(String fileName) throws FileNotFoundException {
        File f = new File(fileName);
        if (!f.exists()) {
            System.err.println(fileName + " does not exist !!!");
            return;
        }
        Scanner sc = new Scanner(f);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            StringTokenizer stknzr = new StringTokenizer(line, " ,.:;[]/'\"-(){}%");
            while (stknzr.hasMoreTokens()) {
                String w = stknzr.nextToken().toLowerCase();
                WordCount tmp = map.get(w);
                if (tmp == null) {
                    map.put(w, new WordCount(1, w));
                } else {
                    tmp.increment();
                }
            }
        }

    }
    
    public Map<String, WordCount> getResult() {
        return map ;
    }
    
    public void showFrequency() {
        //Collection<WordCount> results = map.values() ;
        List<WordCount> results = Collections.unmodifiableList(new ArrayList( map.values() )) ;
        Collections.sort(results, new FreqCompareAsc());
        for (WordCount wc : results) {
            System.out.printf("%-20s %3d\n", wc.getWord(), wc.getCounter());
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        WordFrequncy wf = new WordFrequncy();
        wf.processFile("sample.txt");
        wf.showFrequency() ;
    }

    public class WordCount implements Comparable<WordCount> {

        int counter;
        String word;

        public WordCount(int counter, String word) {
            this.counter = counter;
            this.word = word;
        }

        public int getCounter() {
            return counter;
        }

        public String getWord() {
            return word;
        }

        void increment() {
            counter++;
        }

        @Override
        public int compareTo(WordCount o) {
            return this.word.compareTo(o.word) ;
        }
    }

}

//------------------------------------------------------
class FreqCompareDesc implements Comparator<WordFrequncy.WordCount> {
    @Override
    public int compare(WordFrequncy.WordCount o1, WordFrequncy.WordCount o2) {
        return  - (o1.counter - o2.counter) ;
    }
    
}

class FreqCompareAsc implements Comparator<WordFrequncy.WordCount> {
    @Override
    public int compare(WordFrequncy.WordCount o1, WordFrequncy.WordCount o2) {
        return  o1.counter - o2.counter ;
    }
    
}

