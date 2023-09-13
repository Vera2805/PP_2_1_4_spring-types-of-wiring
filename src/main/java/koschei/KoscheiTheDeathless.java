package koschei;

import koschei.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KoscheiTheDeathless {
    private Ocean1 ocean;
    private Island2 island;
    private Wood3 wood;
    private Rabbit4 rabbit;
    private Duck5 duck;
    private Egg6 egg;
    private Needle7 needle;
    private Deth8 deth;


    @Autowired
    public void setOcean (Ocean1 ocean) {
        this.ocean = ocean;
    }
    @Autowired
    public void setIsland(Island2 island) {
        this.island = island;
    }
        @Autowired
         public void setWood(Wood3 wood) {
            this.wood = wood;
    }
    @Autowired
    public void setRabbit (Rabbit4 rabbit) {
        this.rabbit = rabbit;
    }
    @Autowired
    public void setDuck(Duck5 duck) {
        this.duck = duck;
    }
    @Autowired
    public void setEgg (Egg6 egg) {
        this.egg = egg;
        }
    @Autowired
    public void setNeedle (Needle7 needle) {
        this.needle = needle;
    }
    @Autowired
    public void setDeth (Deth8 deth) {
        this.deth = deth;
    }

    public String getRulesByDeth() {

        return "На свете есть океан , " + ocean.toString() + ", на острове дерево " + wood.toString() +
                ", на дереве заяц " + rabbit.toString() + ", в зайце утка " + duck.toString() +
                ", в утке яйцо " + egg.toString() + ", смерть Кощея на игле :( " + deth.toString();
    }
}

