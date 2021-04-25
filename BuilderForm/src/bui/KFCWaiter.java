package bui;

import java.io.FileInputStream;
import java.util.Properties;

public class KFCWaiter {
    MealBuilder mb;

    public void setMb(MealBuilder mb)
    {
        this.mb = mb;
    }

    Meal construct()
    {
        if(mb.meal==null)mb.meal=new Meal();
        mb.buildFood();
        mb.buildDrink();
        return mb.getMeal();
    }
}
