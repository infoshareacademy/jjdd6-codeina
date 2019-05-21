package com.infoshareacademy.jjdd6.codeina.service;

        import com.infoshareacademy.jjdd6.codeina.servlet.ErrorMessageServlet;
        import org.apache.logging.log4j.LogManager;
        import org.apache.logging.log4j.Logger;

        import javax.ejb.Stateless;
        import java.io.IOException;
        import java.util.logging.FileHandler;
        import java.util.logging.SimpleFormatter;

@Stateless
public class LoadProperties {

    private static final Logger logger = LogManager.getLogger(LoadProperties.class);
    public String getTempDirectory() throws IOException {

        logger.info("Temp dir: " + System.getProperty("java.io.tmpdir"));
        return System.getProperty("java.io.tmpdir") + "/";
    }
}
