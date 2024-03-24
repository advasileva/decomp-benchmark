build:
	cd java && mvn clean install

run:
	cd java && java -jar target/benchmarks.jar
