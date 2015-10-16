environments {

dev {
		server {
			localHomeDir = '/wildfly/wildfly-8.0.0.Final-dev'
			containerId = 'wildfly8x'
			hostname = 'localhost'
			port = 8091
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
			port = 8092
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
			port = 8093
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
			port = 8094
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
			port = 8095
			context = appName
			username = 'admin'
			password = 'admin'
		}
	}
}
