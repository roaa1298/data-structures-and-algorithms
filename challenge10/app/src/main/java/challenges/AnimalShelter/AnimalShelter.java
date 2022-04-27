package challenges.AnimalShelter;

import challenges.queue.structure.Queue;

public class AnimalShelter<T> {
    Queue<Animal<T>> cat=new Queue<>();
    Queue<Animal<T>> dog=new Queue<>();
    private int size;

    public AnimalShelter() {
        size=0;
    }
    public void enQueue(Animal<T> animal){
        if (animal instanceof Cat)
        {
            cat.enqueue(animal);
            size++;
        } else if (animal instanceof Dog)
        {
            dog.enqueue(animal);
            size++;
        }
    }
    public Animal<T> deQueue(String pref) throws Exception {
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
