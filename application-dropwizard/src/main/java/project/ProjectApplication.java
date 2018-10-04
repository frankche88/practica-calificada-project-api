package project;

import io.dropwizard.Application;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.migrations.MigrationsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import project.bundles.CorsBundle;
import project.bundles.HbnBundle;
import project.bundles.SwitchableSwaggerBundle;
import project.guice.module.HbnModule;
import ru.vyarus.dropwizard.guice.GuiceBundle;

public class ProjectApplication extends Application<ProjectConfiguration> {

	public static void main(String[] args) throws Exception {
		new ProjectApplication().run(args);
	}


	@Override
	public String getName() {
		return "project-api";
	}

	@Override
	public void initialize(Bootstrap<ProjectConfiguration> bootstrap) {
		
		bootstrap.setConfigurationSourceProvider(new SubstitutingSourceProvider(
                bootstrap.getConfigurationSourceProvider(), new EnvironmentVariableSubstitutor(false)));

		bootstrap.addBundle(new MigrationsBundle<ProjectConfiguration>() {
			@Override
			public DataSourceFactory getDataSourceFactory(ProjectConfiguration configuration) {
				return configuration.getDataSourceFactory();
			}
		});

		final HbnBundle hibernate = new HbnBundle();
		
		bootstrap.addBundle(new SwitchableSwaggerBundle());
        bootstrap.addBundle(new CorsBundle());
		
		
        // register hbn bundle before guice to make sure factory initialized before guice context start
        bootstrap.addBundle(hibernate);
        bootstrap.addBundle(GuiceBundle.builder()
                .enableAutoConfig("project")
                .modules(new HbnModule(hibernate))
                .build());

	}

	@Override
	public void run(ProjectConfiguration configuration, Environment environment) throws Exception {

		//environment.jersey().register(BankTransferController.class);
		// environment.jersey().register(new ViewResource());

	}
}
