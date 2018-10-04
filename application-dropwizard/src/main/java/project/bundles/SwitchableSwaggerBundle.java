package project.bundles;

import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;
import project.ProjectConfiguration;

public class SwitchableSwaggerBundle extends SwaggerBundle<ProjectConfiguration> {

    @Override
    protected SwaggerBundleConfiguration getSwaggerBundleConfiguration(ProjectConfiguration configuration) {
        return configuration.getSwaggerBundleConfiguration();
    }

    @Override
    public void run(ProjectConfiguration configuration, Environment environment) throws Exception {
        super.run(configuration, environment);
    }
}
