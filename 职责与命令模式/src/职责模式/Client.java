package 职责模式;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        AbstractFruitSort Bfs,Mfs,Sfs;
        Bfs = new BigFruitSorting(9);
        Mfs = new MidFruitSorting(5);
        Sfs = new SmallFruitSorting(3);

        //构成职责链
        Bfs.setNextFruitSort(Mfs);
        Mfs.setNextFruitSort(Sfs);

        Random rm = new Random();
        for(int i=0; i<1000; i++)
        {
            int weight = rm.nextInt(10);
            Bfs.sendFruit(weight,"橙子");
        }
        Bfs.getFruitBox();
        Mfs.getFruitBox();
        Sfs.getFruitBox();
    }
}
