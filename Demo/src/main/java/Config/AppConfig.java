package Config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("Luong 1");
        return new Class[]{WebConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("Luong 2");
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("Luong 3");
        return new String[]{"/"};
    }
}
