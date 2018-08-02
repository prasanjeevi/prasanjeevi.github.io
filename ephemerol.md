# ephemerol

```
git clone https://github.com/Pivotal-Field-Engineering/ephemerol.git
cd ephemerol
pip install -r requirements.txt
python -m ephemerol -h
usage: python -m ephemerol [-h] [-c] rulefile archive

Scan a source archive for cloud readiness

positional arguments:
  rulefile    The file describing the rules the scanner should use
  archive     The source archive to scan

optional arguments:
  -h, --help  show this help message and exit
  -c          Flags the rule file as a CSV based rule file. Rules files are
              considered YAML by default.

python ./ephemerol/ephemerol-web.py



python -m ephemerol /Users/sanjeevi/ephemerol/ephemerol/test/rulebase.yml /Users/sanjeevi/Desktop/Cli.zip

```