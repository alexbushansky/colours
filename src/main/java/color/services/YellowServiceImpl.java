package color.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("yellow")
@Qualifier("yellow")
@Scope("prototype")
public class YellowServiceImpl implements ColorService, MixedColorService {

    @Autowired
    @Qualifier("red")
    private ColorService red;

    @Autowired
    @Qualifier("green")
    private ColorService green;

    @Override
    public void mix() {
        System.out.println(String.format("yellow = %s + %s", red.toString(), green.toString()));
    }

    @Override
    public String toString() {
        return "yellow";
    }

    @Override
    public void define() {
        mix();
    }
}
