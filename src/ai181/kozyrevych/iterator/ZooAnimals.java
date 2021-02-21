package ai181.kozyrevych.iterator;

public class ZooAnimals implements Container {
    private String animals[];

    public ZooAnimals(String[] animals) {
        this.animals = animals;
    }

    public String[] getAnimals() {
        return animals;
    }

    public void setAnimals(String[] animals) {
        this.animals = animals;
    }

    @Override
    public MyIterator getIterator() {
        return new ZooIterator();
    }

    class ZooIterator implements MyIterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < animals.length;
        }

        @Override
        public String next() {
            return animals[index++];
        }

        @Override
        public boolean hasPrevious() {
            return index > 0;
        }

        @Override
        public String previous() {
            return animals[--index];
        }
    }
}
