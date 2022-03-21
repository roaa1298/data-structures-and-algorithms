package challenge10.AnimalShelter;

import challenge10.queue.structure.Queue;

public class AnimalShelter {
    Queue<Animal> cat=new Queue<>();
    Queue<Animal> dog=new Queue<>();
    private int size;

    public AnimalShelter() {
        size=0;
    }
    public void enQueue(Animal animal){
        if (animal instanceof Cat)
        {
            cat.enqueue(animal.getValue());
            size++;
        } else if (animal instanceof Dog)
        {
            dog.enqueue(animal.getValue());
            size++;
        }
    }
    public String deQueue(String pref) throws Exception {
        if (pref=="cat")
        {
            if (!cat.isEmpty())
            {
                size--;
                return cat.dequeue();
            }
        }
        else if (pref=="dog")
        {
            if (!dog.isEmpty())
            {
                size--;
                return dog.dequeue();
            }
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "cat=" + cat +
                ", dog=" + dog +
                '}';
    }
}
