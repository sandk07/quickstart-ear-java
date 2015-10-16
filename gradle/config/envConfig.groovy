environments {

dev {
		server {
			localHomeDir = '/wildfly/wildfly-8.0.0.Final-dev'
			containerId = 'wildfly8x'
			hostname = 'localhost'
			port = 8091
			managementPort = 10001
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
			managementPort = 10002
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
			managementPort = 10003
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
			managementPort = 10004
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
			managementPort = 10005
			context = appName
			username = 'admin'
			password = 'admin'
		}
	}
}
