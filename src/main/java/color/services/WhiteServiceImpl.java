package color.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("white")
@Qualifier("white")
@Scope("prototype")
public class WhiteServiceImpl implements ColorService, MixedColorService {
    @Autowired
    @Qualifier("red")
    private ColorService red;

    @Autowired
    @Qualifier("green")
    private ColorService green;


    @Autowired
    @Qualifier("blue")
    private ColorService blue;


    @Override
    public void mix() {
        System.out.println(String.format("white = %s + %s + %s", red.toString(), green.toString(), blue.toString()));
    }

    @Override
    public void define() {
        mix();
    }

    @Override
    public String toString() {
        return "white";
    }
}
