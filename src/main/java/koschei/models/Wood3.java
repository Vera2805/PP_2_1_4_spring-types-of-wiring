package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wood3 {

    private Rabbit4 rabbit;

    @Autowired
    public void setRabbit(Rabbit4 rabbit) {
        this.rabbit = rabbit;
    }

    public Wood3 wood() {
        return new Wood3();
    }

    @Override
    public String toString() {
        return ", на дереве заяц " + rabbit.toString();
    }
}
