#!/usr/bin/python3
import argparse
import subprocess

RUNNER = "jcoffee_runner.py"
OUT_PATH = "fixed/output.java"
N_TRIES = 10

def jcoffee(inp_file_path, out_file_path=OUT_PATH, times_to_try_compile=N_TRIES):
	subprocess.run(['./'+RUNNER, inp_file_path, out_file_path, str(times_to_try_compile)], stderr=subprocess.PIPE).stderr.decode('utf-8')


if __name__ == '__main__':

	parser = argparse.ArgumentParser()

	parser.add_argument('-f', required=True, help="path to input java code snippet")
	parser.add_argument('-o', default=OUT_PATH, help="path to output java file. default="+OUT_PATH)
	parser.add_argument('-n', type=int, default=N_TRIES, help="max number of times to try compile. default=10")
	args = parser.parse_args()

	INPUT_FILE = args.f
	OUTPUT_FILE = args.o
	TIMES_TO_TRY_COMPILE = int(args.n)

	jcoffee(INPUT_FILE, OUTPUT_FILE, TIMES_TO_TRY_COMPILE)
