/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenges;

import challenges.AnimalShelter.Animal;
import challenges.AnimalShelter.AnimalShelter;
import challenges.AnimalShelter.Cat;
import challenges.AnimalShelter.Dog;
import challenges.BusinessTrip.BusinessTrip;
import challenges.Graph.Graph;
import challenges.Graph.Vertex;
import challenges.HashMap.Structure.HashMap;
import challenges.InsertionSort.InsertionSort;
import challenges.LeftJoin.LeftJoin;
import challenges.MergeSort.MergeSort;
import challenges.Practice.Practice;
import challenges.QuickSort.QuickSort;
import challenges.RepeatedWord.RepeatedWord;
import challenges.TreeIntersection.TreeIntersection;
import challenges.Trees.data.BTNode;
import challenges.Trees.structure.BinarySearchTree;
import challenges.Trees.structure.BinaryTree;
import challenges.challenge39.TwoNodesConnected;
import challenges.challenge41.Navigator;
import challenges.pseudoQueue.pseudoQueue;
import challenges.queue.structure.Queue;
import challenges.stack.structure.Stack;
import challenges.validateBrackets.ValidateBrackets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static challenges.Trees.structure.BinaryTree.TraversalOrder.INORDER;
import static challenges.Trees.structure.BinaryTree.TraversalOrder.POSTORDER;
import static challenges.Trees.structure.BinaryTree.TraversalOrder.PREORDER;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        System.out.println(new App().getGreeting());

        Stack newStack=new Stack();
        newStack.push("1");
        newStack.push("2");
        newStack.push("3");
        newStack.push("4");
        newStack.push("5");
        System.out.println(newStack);
        System.out.println(newStack.pop());
        System.out.println(newStack);
        System.out.println(newStack.peek());

        System.out.println("------------------------------------------Queue---------------------------------------");

        Queue<String> newQueue=new Queue<>();
        newQueue.enqueue("1");
        newQueue.enqueue("2");
        newQueue.enqueue("3");
        newQueue.enqueue("4");
        newQueue.enqueue("5");
        System.out.println(newQueue);
        System.out.println(newQueue.dequeue());
        System.out.println(newQueue);
        System.out.println(newQueue.peek());

        pseudoQueue newPseudoQueue=new pseudoQueue();
        newPseudoQueue.enQueue("1");
        newPseudoQueue.enQueue("2");
        newPseudoQueue.enQueue("3");
        newPseudoQueue.enQueue("4");
        System.out.println(newPseudoQueue.getS1());

        System.out.println("--------------------------------------------- Animal shelter ------------------------");

        AnimalShelter<Animal> animal=new AnimalShelter<>();
        animal.enQueue(new Cat("cat1"));
        animal.enQueue(new Dog("dog1"));
        animal.enQueue(new Cat("cat2"));
        animal.enQueue(new Dog("dog2"));
        animal.enQueue(new Cat("cat3"));

        System.out.println(animal.getSize());
        System.out.println(animal.deQueue("cat"));
        System.out.println(animal.getSize());
        System.out.println(animal);

        System.out.println("---------------------------------------------------------------------------------");
        String str="[}";
        ValidateBrackets ob=new ValidateBrackets();
        System.out.println(ob.validateBrackets(str));

        System.out.println("-------------------------------trees--------------------------------------------------");
        BinarySearchTree<Integer> newTree=new BinarySearchTree<>();
        System.out.println(newTree.getRoot());
        newTree.add(5);
        newTree.add(8);
        newTree.add(4);
        newTree.add(3);
        newTree.add(4);
        newTree.add(90);
        newTree.add(55);
        System.out.println(newTree);
        System.out.println(newTree.getRoot());
        System.out.println(newTree.traverse(INORDER));
        System.out.println(newTree.traverse(PREORDER));
        System.out.println(newTree.traverse(POSTORDER));
        System.out.println(newTree.Contains(90));
        System.out.println(newTree.Contains(9));
        System.out.println("-------------------breadth first---------------------------");
        System.out.println(newTree.breadthFirst());
        System.out.println("----------------------------------------------");

        BinaryTree<Integer> tre=new BinaryTree<>(9);
        System.out.println(tre.getRoot());

        System.out.println("------------------------- tree max ---------------------------------");
        BinaryTree<Integer> maxTree=new BinaryTree<Integer>();
        BTNode<Integer> node1=new BTNode<Integer>(2);
        maxTree.setRoot(node1);

        node1.setLeftNode(new BTNode<Integer>(7));
        node1.setRightNode(new BTNode<Integer>(5));

        node1.getLeftNode().setLeftNode(new BTNode<Integer>(2));
        node1.getLeftNode().setRightNode(new BTNode<Integer>(6));

        node1.getLeftNode().getRightNode().setLeftNode(new BTNode<Integer>(5));
        node1.getLeftNode().getRightNode().setRightNode(new BTNode<Integer>(11));

        node1.getRightNode().setRightNode(new BTNode<Integer>(9));
        node1.getRightNode().getRightNode().setLeftNode(new BTNode<Integer>(4));

        System.out.println("The max number => "+maxTree.getMaxNum());
        System.out.println("------------------------- fizzbuzz ---------------------------------");
        BinaryTree<Integer> fizzbuzz=new BinaryTree<>();
        fizzbuzz.setRoot(new BTNode<>(5));
        fizzbuzz.getRoot().setLeftNode(new BTNode<>(4));
        fizzbuzz.getRoot().setRightNode(new BTNode<>(3));
        fizzbuzz.getRoot().getLeftNode().setLeftNode(new BTNode<>(15));
        fizzbuzz.getRoot().getLeftNode().setRightNode(new BTNode<>(9));
        fizzbuzz.getRoot().getRightNode().setLeftNode(new BTNode<>(6));
        fizzbuzz.getRoot().getRightNode().setRightNode(new BTNode<>(7));
        System.out.println(fizzbuzz.fizzbuzzTree(fizzbuzz));

        System.out.println("------------------------- Insertion Sort ---------------------------------");

        int[] ar={8,4,23,42,16,15};
        System.out.println("the original array--> "+ Arrays.toString(ar));
        InsertionSort sortedArray=new InsertionSort();
        System.out.println(Arrays.toString(sortedArray.Insertion(ar)));

        System.out.println("------------------------- merge Sort ---------------------------------");
        int[] ar2={8,4,23,42,16,15};
        System.out.println("the original array--> "+ Arrays.toString(ar2));
        MergeSort mergeSort=new MergeSort();
        System.out.println("sorted by merge sort algorithm= "+Arrays.toString(mergeSort.Mergesort(ar2)));

        System.out.println("------------------------- quick Sort ---------------------------------");
        int[] ar3={8,4,23,42,16,15};
        System.out.println("the original array--> "+ Arrays.toString(ar3));
        QuickSort quickSort=new QuickSort();
        quickSort.quickSort(ar3,0,ar3.length-1);
        System.out.println("sorted by quick sort algorithm= "+ Arrays.toString(ar3));

        System.out.println("------------------------- hash map ---------------------------------");
        HashMap<String, String> hashMap=new HashMap<>();
        hashMap.put("java","java");
        hashMap.put("python","python");
        hashMap.put("kotlin","kotlin");
        hashMap.put("js","js");
        hashMap.put("html","html");
        hashMap.put("css","css");
        hashMap.put("php","php");
        hashMap.put("c","c");

        System.out.println("the size of the hashMap= "+hashMap.getSize());
        System.out.println("********************************");

        System.out.println("The value of kotlin key is --> "+hashMap.get("kotlin"));
        System.out.println("The value of css key is --> "+hashMap.get("css"));
        System.out.println("The value of js key is --> "+hashMap.get("js"));
        System.out.println("The value of anythingElse key is --> "+hashMap.get("anythingElse"));  // return null
        System.out.println("********************************");

        // change the value of php key to "changed" because it is redundant
        System.out.println("The value of php key is --> "+hashMap.get("php"));  // the value -> php
        hashMap.put("php","changed");
        System.out.println("The value of php key is --> "+hashMap.get("php"));  // the value -> changed
        System.out.println("the size of the hashMap= "+hashMap.getSize());
        System.out.println("********************************");

        System.out.println("is the hashMap contains (html) ? "+hashMap.contains("html"));
        System.out.println("is the hashMap contains (anythingElse) ? "+hashMap.contains("anythingElse"));
        System.out.println("********************************");


        System.out.println("The keys list: "+hashMap.keys());
        System.out.println(hashMap.getBucketArray());
        System.out.println("********************************");

        // edge case -> key not exists
        System.out.println("the index for css is -> "+hashMap.hash("css"));
        System.out.println("the index for js is -> "+hashMap.hash("js"));
        System.out.println("the index for c++ is -> "+hashMap.hash("c++")); // return null
        System.out.println("********************************");

        // edge case -> empty array
        HashMap<String, String> hashMap2=new HashMap<>();
        System.out.println("The keys list: "+hashMap2.keys());  // return []


        System.out.println("------------------------- hash map repeated word -------------------------------------");

        RepeatedWord newString=new RepeatedWord();
        System.out.println("the repeated word: "+newString.repeatedWord("Once upon a time, there was a brave princess who"));
        System.out.println("********************************");
        System.out.println("the repeated word: "+newString.repeatedWord("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only"));
        System.out.println("********************************");
        System.out.println("the repeated word: "+newString.repeatedWord("It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York"));
        System.out.println("********************************");
        System.out.println("words count: "+newString.wordsCount("Once upon a time, there was a brave princess who").get("a"));

        System.out.println("------------------------- hash map tree-intersection -------------------------------------");
        TreeIntersection treeIntersection=new TreeIntersection();
        BinarySearchTree<Integer> tree1=new BinarySearchTree<>();
        BinarySearchTree<Integer> tree2=new BinarySearchTree<>();

        tree1.setRoot(new BTNode<>(150));
        tree1.getRoot().setLeftNode(new BTNode<>(100));
        tree1.getRoot().setRightNode(new BTNode<>(250));

        tree1.getRoot().getLeftNode().setLeftNode(new BTNode<>(75));
        tree1.getRoot().getLeftNode().setRightNode(new BTNode<>(160));

        tree1.getRoot().getRightNode().setLeftNode(new BTNode<>(200));
        tree1.getRoot().getRightNode().setRightNode(new BTNode<>(350));

        tree1.getRoot().getLeftNode().getRightNode().setLeftNode(new BTNode<>(125));
        tree1.getRoot().getLeftNode().getRightNode().setRightNode(new BTNode<>(175));

        tree1.getRoot().getRightNode().getRightNode().setLeftNode(new BTNode<>(300));
        tree1.getRoot().getRightNode().getRightNode().setRightNode(new BTNode<>(500));
        // -------------------------------------  Tree2  -----------------------------------------
        tree2.setRoot(new BTNode<>(42));
        tree2.getRoot().setLeftNode(new BTNode<>(100));
        tree2.getRoot().setRightNode(new BTNode<>(600));

        tree2.getRoot().getLeftNode().setLeftNode(new BTNode<>(15));
        tree2.getRoot().getLeftNode().setRightNode(new BTNode<>(160));

        tree2.getRoot().getRightNode().setLeftNode(new BTNode<>(200));
        tree2.getRoot().getRightNode().setRightNode(new BTNode<>(350));

        tree2.getRoot().getLeftNode().getRightNode().setLeftNode(new BTNode<>(125));
        tree2.getRoot().getLeftNode().getRightNode().setRightNode(new BTNode<>(175));

        tree2.getRoot().getRightNode().getRightNode().setLeftNode(new BTNode<>(4));
        tree2.getRoot().getRightNode().getRightNode().setRightNode(new BTNode<>(500));

        System.out.println(treeIntersection.tree_intersection(tree1,tree2));

        System.out.println("---------------------------------------- no matching ------------------------------------------");
        BinarySearchTree<Integer> tree3=new BinarySearchTree<>();
        BinarySearchTree<Integer> tree4=new BinarySearchTree<>();

        tree3.setRoot(new BTNode<>(1));
        tree3.getRoot().setLeftNode(new BTNode<>(2));
        tree3.getRoot().setRightNode(new BTNode<>(3));

        tree3.getRoot().getLeftNode().setLeftNode(new BTNode<>(4));
        tree3.getRoot().getLeftNode().setRightNode(new BTNode<>(5));

        tree3.getRoot().getRightNode().setLeftNode(new BTNode<>(6));
        tree3.getRoot().getRightNode().setRightNode(new BTNode<>(7));

        tree3.getRoot().getLeftNode().getRightNode().setLeftNode(new BTNode<>(8));
        tree3.getRoot().getLeftNode().getRightNode().setRightNode(new BTNode<>(9));

        tree3.getRoot().getRightNode().getRightNode().setLeftNode(new BTNode<>(10));
        tree3.getRoot().getRightNode().getRightNode().setRightNode(new BTNode<>(11));
        // -------------------------------------  Tree2  -----------------------------------------
        tree4.setRoot(new BTNode<>(12));
        tree4.getRoot().setLeftNode(new BTNode<>(13));
        tree4.getRoot().setRightNode(new BTNode<>(14));

        tree4.getRoot().getLeftNode().setLeftNode(new BTNode<>(15));
        tree4.getRoot().getLeftNode().setRightNode(new BTNode<>(16));

        tree4.getRoot().getRightNode().setLeftNode(new BTNode<>(17));
        tree4.getRoot().getRightNode().setRightNode(new BTNode<>(18));

        tree4.getRoot().getLeftNode().getRightNode().setLeftNode(new BTNode<>(19));
        tree4.getRoot().getLeftNode().getRightNode().setRightNode(new BTNode<>(20));

        tree4.getRoot().getRightNode().getRightNode().setLeftNode(new BTNode<>(21));
        tree4.getRoot().getRightNode().getRightNode().setRightNode(new BTNode<>(22));

        System.out.println(treeIntersection.tree_intersection(tree3,tree4));

        // ------------------------------------ LEFT JOIN ----------------------------------------
        System.out.println("------------------------- LEFT JOIN -------------------------------------");

        LeftJoin tables=new LeftJoin();
        HashMap<String, String> hash1=new HashMap<>();
        hash1.put("diligent","employed");
        hash1.put("fond","enamored");
        hash1.put("guide","usher");
        hash1.put("outfit","garb");
        hash1.put("wrath","anger");

        HashMap<String, String> hash2=new HashMap<>();
        hash2.put("diligent","idle");
        hash2.put("fond","averse");
        hash2.put("guide","follow");
        hash2.put("flow","jam");
        hash2.put("wrath","delight");

        System.out.println(tables.leftJoin(hash1,hash2).toString());


        // ------------------------------------ Graph ----------------------------------------
        System.out.println("------------------------- Graph -------------------------------------");

        Graph graph=new Graph();
        System.out.println(graph.addVertex("A"));
        System.out.println(graph.addVertex("B"));
        System.out.println(graph.addVertex("C"));
        System.out.println(graph.addVertex("D"));

        graph.addEdges("A","B",4);
        graph.addEdges("A","C",3);
        graph.addEdges("A","D",9);
        graph.addEdges("D","B",5);
        graph.addEdges("C","D",6);

        System.out.println(graph.getNodes());
        System.out.println(graph.getNeighbors(new Vertex("B")));
        System.out.println(graph.getNeighbors(new Vertex("A")));
        System.out.println(graph.getNeighbors(new Vertex("C")));
        System.out.println(graph.getNeighbors(new Vertex("D")));
        System.out.println(graph.getSize());

        System.out.println(graph.addVertex("D"));
        System.out.println(graph.getNeighbors(new Vertex("D")));
        System.out.println(graph.getSize());

        System.out.println("-------------------- Test edges -------------------------");
        System.out.println(graph.getNeighbors(new Vertex("B")));
        System.out.println(graph.getNeighbors(new Vertex("A")));
        graph.addEdges("A","B",8);
        System.out.println(graph.getNeighbors(new Vertex("B")));
        System.out.println(graph.getNeighbors(new Vertex("A")));

        System.out.println("----------------- breadth first search in graph ---------------------");
        System.out.println(graph.bfs(new Vertex("A")).toString());

        System.out.println("--------------------- graph-business-trip --------------------------");
        BusinessTrip businessTrip=new BusinessTrip();
        Graph graph2=new Graph();
        System.out.println(graph2.addVertex("Pandora"));
        System.out.println(graph2.addVertex("Arendelle"));
        System.out.println(graph2.addVertex("Metroville"));
        System.out.println(graph2.addVertex("Monstropolis"));
        System.out.println(graph2.addVertex("Narnia"));
        System.out.println(graph2.addVertex("Naboo"));

        graph2.addEdges("Pandora","Arendelle",150);
        graph2.addEdges("Pandora","Metroville",82);
        graph2.addEdges("Arendelle","Metroville",99);
        graph2.addEdges("Arendelle","Monstropolis",42);
        graph2.addEdges("Metroville","Monstropolis",105);
        graph2.addEdges("Naboo","Monstropolis",73);
        graph2.addEdges("Naboo","Metroville",26);
        graph2.addEdges("Naboo","Narnia",250);
        graph2.addEdges("Metroville","Narnia",37);
        List<String> cityNames=new ArrayList<>();
        cityNames.add("Arendelle");
        cityNames.add("Monstropolis");
        cityNames.add("Naboo");

        System.out.println(businessTrip.businessTrip(graph2,cityNames));

        System.out.println("--------------------- Depth first search --------------------------");
        Graph g=new Graph();
        System.out.println(g.addVertex("A"));
        System.out.println(g.addVertex("B"));
        System.out.println(g.addVertex("C"));
        System.out.println(g.addVertex("D"));
        System.out.println(g.addVertex("E"));
        System.out.println(g.addVertex("F"));
        System.out.println(g.addVertex("G"));
        System.out.println(g.addVertex("H"));

        g.addEdges("A","B",150);
        g.addEdges("A","D",82);
        g.addEdges("B","C",99);
        g.addEdges("B","D",42);
        g.addEdges("C","G",105);
        g.addEdges("D","E",73);
        g.addEdges("D","H",26);
        g.addEdges("D","F",250);
        g.addEdges("H","F",37);

        System.out.println(g.DepthFirstSearch(new Vertex("A")));

        System.out.println("--------------------- Are two nodes connected? --------------------------");
        Graph g2=new Graph();
        Vertex v1=g2.addVertex("A");
        Vertex v2=g2.addVertex("B");
        Vertex v3=g2.addVertex("C");
        Vertex v4=g2.addVertex("D");
        Vertex v5=g2.addVertex("E");
        Vertex v6=g2.addVertex("F");
        Vertex v7=g2.addVertex("G");
        Vertex v8=g2.addVertex("H");

        g2.addEdges("A","B",150);
        g2.addEdges("A","D",82);
        g2.addEdges("B","C",99);
        g2.addEdges("B","D",42);
        g2.addEdges("C","G",105);
        g2.addEdges("D","E",73);
        g2.addEdges("D","H",26);
        g2.addEdges("D","F",250);
        g2.addEdges("H","F",37);
//        System.out.println(g2.bfs(v2));
        System.out.println(g2.getAdjVertices().toString());

        TwoNodesConnected twoNodesConnected=new TwoNodesConnected();
        System.out.println(twoNodesConnected.areTwoNodesConnected(g2,v2,v6));

        System.out.println("--------------------- track browser navigation history --------------------------");

        Navigator navigator=new Navigator();
        navigator.go("1");
        navigator.go("2");
        navigator.go("3");
        navigator.go("4");
        System.out.println(navigator.back());
        System.out.println(navigator.forward());
        navigator.go("5");
        System.out.println(navigator.back());

        System.out.println("--------------------- Second Largest Number --------------------------");
        BinarySearchTree<Integer> bst=new BinarySearchTree<>();
        bst.add(50);
        bst.add(30);
        bst.add(20);
        bst.add(40);
        bst.add(70);
        bst.add(60);
        bst.add(80);

        Practice practice=new Practice();
        System.out.println(practice.secondMax(bst));

        System.out.println("--------------------- graph center --------------------------");
        Graph star=new Graph();
        System.out.println(star.addVertex("1"));
        System.out.println(star.addVertex("2"));
        System.out.println(star.addVertex("3"));
        System.out.println(star.addVertex("4"));

        star.addEdges("2","1",150);
        star.addEdges("2","3",82);
        star.addEdges("2","4",99);
        Practice practice2=new Practice();
        System.out.println(practice2.starGraphCenter(star));


    }
}
