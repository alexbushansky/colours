package color.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("green")
@Scope("prototype")
@Qualifier("green")
public class GreenServiceImpl implements ColorService {
    @Override
    public String toString() {
        return "green";
    }
}
