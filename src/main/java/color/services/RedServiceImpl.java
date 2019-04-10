package color.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("red")
@Scope("prototype")
public class RedServiceImpl implements ColorService {
    @Override
    public String toString() {
        return "red";
    }
}
