package color.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("black")
@Qualifier("black")
@Scope("prototype")
public class BlackServiceImpl implements MixedColorService,ColorService {

    @Autowired
    @Qualifier("red")
    private ColorService red;
    @Autowired
    @Qualifier("blue")
    private ColorService blue;
    @Autowired
    @Qualifier("yellow")
    private ColorService yellow;

    @Override
    public void mix() {
        System.out.println(String.format("black = %s + %s + %s", red.toString(), blue.toString(), yellow.toString()));
    }

    @Override
    public void define() {
        mix();
    }

    @Override
    public String toString() {
        return "Black";
    }
}
