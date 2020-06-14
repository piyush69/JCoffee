#!/usr/bin/python3
import argparse
import subprocess

RUNNER = "jcoffee_runner.py"

def jcoffee(inp_file_path, out_file_path="output.java", times_to_try_compile=10):
	subprocess.run(['./'+RUNNER, inp_file_path, out_file_path, str(times_to_try_compile)], stderr=subprocess.PIPE).stderr.decode('utf-8')


if __name__ == '__main__':

	parser = argparse.ArgumentParser()

	parser.add_argument('-f', required=True, help="path to input java code snippet")
	parser.add_argument('-o', default="output.java", help="path to output java file. default=output.java")
	parser.add_argument('-n', type=int, default=10, help="max number of times to try compile. default=10")
	args = parser.parse_args()

	INPUT_FILE = args.f
	OUTPUT_FILE = args.o
	TIMES_TO_TRY_COMPILE = int(args.n)

	jcoffee(INPUT_FILE, OUTPUT_FILE, TIMES_TO_TRY_COMPILE)
