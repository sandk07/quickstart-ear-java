environments {

dev {
		server {
			localHomeDir = '/wildfly/wildfly-8.0.0.Final-dev'
			containerId = 'wildfly8x'
			hostname = 'localhost'
			port = 8180
			managementPort = 10090
			context = 'web'
			username = 'admin'
			password = 'admin'
		}
}
qa {
		server {
			localHomeDir = '/wildfly/wildfly-8.0.0.Final-qa'
			containerId = 'wildfly8x'
			hostname = 'localhost'
			port = 8280
			managementPort = 10190
			context = appName
			username = 'admin'
			password = 'admin'
		}
	}
perf {
		server {
			localHomeDir = '/wildfly/wildfly-8.0.0.Final-perf'
			containerId = 'wildfly8x'
			hostname = 'localhost'
			port = 8380
			managementPort = 10290
			context = appName
			username = 'admin'
			password = 'admin'
		}
	}
stage {
		server {
			localHomeDir = '/wildfly/wildfly-8.0.0.Final-stage'
			containerId = 'wildfly8x'
			hostname = 'localhost'
			port = 8480
			context = appName
			username = 'admin'
			password = 'admin'
		}
	}
prod {
		server {
			localHomeDir = '/wildfly/wildfly-8.0.0.Final-prod'
			containerId = 'wildfly8x'
			hostname = 'localhost'
			port = 8580
			context = appName
			username = 'admin'
			password = 'admin'
		}
	}
}
