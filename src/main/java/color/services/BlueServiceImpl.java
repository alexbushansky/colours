package color.services;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component()
@Scope("prototype")
@Qualifier("blue")
public class BlueServiceImpl implements ColorService {

    private static final Logger logger = LogManager.getLogger(ColorService.class);

    public void initMethod() { logger.info("invoke initMethod method"); }

    public void destroyMethod() { logger.info("invoke destroyMethod method"); }

    @Override
    public String toString() {
        return "blue";
    }
}
