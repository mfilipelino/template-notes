venv:
	virtualenv venv -p python3
	mvn install

requirements:
	venv/bin/python3 venv/bin/pip3 install -r requirements.txt

clean:
	rm -rf venv
