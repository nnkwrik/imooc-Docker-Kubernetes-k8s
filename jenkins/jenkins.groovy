#!/groovy
pipeline{
	agent any

	environment {
		REPOSITORY="ssh://git@gitlab.nnkwrik.com:2222/nnkwrik/microservice.git"
		MODULE="user-edge-service"
		SCRIPT_PATH="/home/ubuntu/scripts"
	}

	stages {
		stage('获取代码') {
			steps {
				echo "start fetch code from git:${REPOSITORY}"
				deleteDir()
				git "${REPOSITORY}"
			}
		}

		stage('代码静态检查') {
			steps {
				echo "start code check"
			}
		}

		stage('编译+单元测试') {
			steps {
				echo "star compile"
				sh "mvn -U -pl ${MODULE} -am clean package"
			}
		}

		stage('构建镜像') {
			steps {
				echo "start build image"
				sh "${SCRIPT_PATH}/build-images.sh ${MODULE}"
			}
		}

		stage('发布系统') {
			steps {
				echo "start deploy"
				sh "${SCRIPT_PATH}/deploy.sh user-service-deployment ${MODULE}"
			}
		}
	}
}