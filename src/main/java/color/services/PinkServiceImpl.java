package color.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("pink")
@Qualifier("pink")
@Scope("prototype")
public class PinkServiceImpl implements MixedColorService,ColorService {

    @Autowired
    @Qualifier("red")
    private ColorService red;
    @Autowired
    @Qualifier("blue")
    private ColorService blue;
    @Override
    public void mix() {
        System.out.println(String.format("pink = %s + %s", red.toString(), blue.toString()));
    }

    @Override
    public String toString() {
        return "pink";
    }

    @Override
    public void define() {
        mix();
    }
}
